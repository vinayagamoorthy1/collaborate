# Email Integration Setup Guide for Iraivi Enterprises

## Current Implementation

The enquiry form currently uses **mailto** which opens the user's default email client with pre-filled data. This is a temporary solution that works without requiring a backend.

## For Production Email Integration

You have several options to send emails automatically:

---

## Option 1: EmailJS (Easiest - No Backend Required)

EmailJS is a free service that allows you to send emails directly from the frontend.

### Steps:

1. **Sign up for EmailJS**: https://www.emailjs.com/
2. **Create an Email Service** (Gmail, Outlook, etc.)
3. **Create an Email Template**
4. **Get your credentials**:
   - User ID
   - Service ID
   - Template ID

5. **Install EmailJS**:
   ```bash
   npm install @emailjs/browser
   ```

6. **Update `src/app/services/email.ts`**:
   ```typescript
   import emailjs from '@emailjs/browser';

   sendEnquiryEmailJS(formData: any): Promise<any> {
     const templateParams = {
       from_name: formData.name,
       from_email: formData.email,
       mobile: formData.mobile,
       age: formData.age,
       district: formData.district,
       city: formData.city,
       pincode: formData.pincode,
       message: this.formatEmailBodyPlainText(formData)
     };

     return emailjs.send(
       'YOUR_SERVICE_ID',
       'YOUR_TEMPLATE_ID',
       templateParams,
       'YOUR_PUBLIC_KEY'
     );
   }
   ```

**Cost**: Free for up to 200 emails/month

---

## Option 2: Backend API with Node.js

Create a simple backend API to send emails.

### Backend Setup (Node.js + Express + Nodemailer):

1. **Create a new folder for backend**:
   ```bash
   mkdir iraivi-backend
   cd iraivi-backend
   npm init -y
   npm install express nodemailer cors dotenv
   ```

2. **Create `server.js`**:
   ```javascript
   const express = require('express');
   const nodemailer = require('nodemailer');
   const cors = require('cors');
   require('dotenv').config();

   const app = express();
   app.use(cors());
   app.use(express.json());

   // Email configuration
   const transporter = nodemailer.createTransport({
     service: 'gmail',
     auth: {
       user: process.env.EMAIL_USER, // your Gmail
       pass: process.env.EMAIL_PASS  // App Password
     }
   });

   // Send email endpoint
   app.post('/api/send-email', async (req, res) => {
     const { to, subject, body } = req.body;

     const mailOptions = {
       from: process.env.EMAIL_USER,
       to: to,
       subject: subject,
       html: body
     };

     try {
       await transporter.sendMail(mailOptions);
       res.status(200).json({ message: 'Email sent successfully' });
     } catch (error) {
       console.error('Error sending email:', error);
       res.status(500).json({ error: 'Failed to send email' });
     }
   });

   const PORT = process.env.PORT || 3000;
   app.listen(PORT, () => {
     console.log(`Server running on port ${PORT}`);
   });
   ```

3. **Create `.env` file**:
   ```
   EMAIL_USER=your-email@gmail.com
   EMAIL_PASS=your-app-password
   PORT=3000
   ```

4. **Generate Gmail App Password**:
   - Go to Google Account Settings
   - Security → 2-Step Verification → App passwords
   - Generate a new app password

5. **Run the backend**:
   ```bash
   node server.js
   ```

6. **Update Angular `email.service.ts`**:
   ```typescript
   private apiUrl = 'http://localhost:3000/api/send-email';
   ```

---

## Option 3: Firebase Cloud Functions

Use Firebase to handle email sending.

1. **Install Firebase**:
   ```bash
   npm install -g firebase-tools
   npm install firebase
   ```

2. **Initialize Firebase**:
   ```bash
   firebase init functions
   ```

3. **Create Cloud Function** in `functions/index.js`:
   ```javascript
   const functions = require('firebase-functions');
   const nodemailer = require('nodemailer');

   exports.sendEnquiryEmail = functions.https.onCall(async (data, context) => {
     // Send email logic here
   });
   ```

---

## Option 4: Third-Party Services

### SendGrid
- https://sendgrid.com/
- Free tier: 100 emails/day
- Easy API integration

### Mailgun
- https://www.mailgun.com/
- Free tier: 5,000 emails/month
- Reliable delivery

### AWS SES (Simple Email Service)
- Very affordable
- Scalable solution
- Requires AWS account

---

## Current Configuration

The form currently uses **mailto** method:
- ✅ Works immediately without setup
- ✅ No backend required
- ❌ Opens user's email client
- ❌ User must manually send

**To receive emails automatically**, implement one of the options above.

---

## Recommended Approach

For **quick testing**: Use EmailJS (Option 1)
For **production**: Use Backend API (Option 2) or Firebase (Option 3)
For **enterprise**: Use SendGrid/AWS SES (Option 4)

---

## Email Template

When you set up email sending, emails will be formatted with:
- Contact information (name, mobile, email, age)
- Address (district, city, pincode)
- Service type selected
- Solar installation details (if applicable)
- Fabrication details (if applicable)
- Submission timestamp

The email will be sent to: **info@iraivi.com** (change this in `email.service.ts`)
