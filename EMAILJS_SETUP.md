# EmailJS Setup Guide - Send Emails from Your Gmail

Follow these steps to configure EmailJS to send enquiry form emails from your Gmail account.

## Step 1: Create EmailJS Account

1. Go to **https://www.emailjs.com/**
2. Click **"Sign Up"** (or "Get Started")
3. Create a free account using your email

---

## Step 2: Add Email Service (Gmail)

1. After logging in, go to **"Email Services"** in the dashboard
2. Click **"Add New Service"**
3. Select **"Gmail"**
4. Click **"Connect Account"**
5. **Sign in with your Gmail** (iravigreenenergy@gmail.com)
6. **Allow EmailJS permissions**
7. Give your service a name (e.g., "Iraivi Gmail")
8. Click **"Create Service"**
9. **Copy the Service ID** (looks like: `service_xxxxxxx`)

---

## Step 3: Create Email Template

1. Go to **"Email Templates"** in the dashboard
2. Click **"Create New Template"**
3. Use this template content:

**Subject:**
```
New Enquiry from {{from_name}}
```

**Content (HTML):**
```html
<h2>New Enquiry Received</h2>
<hr>

<h3>Contact Information:</h3>
<p><strong>Name:</strong> {{from_name}}</p>
<p><strong>Email:</strong> {{from_email}}</p>
<p><strong>Mobile:</strong> {{from_mobile}}</p>
<p><strong>Age:</strong> {{age}}</p>

<h3>Address:</h3>
<p><strong>District:</strong> {{district}}</p>
<p><strong>City:</strong> {{city}}</p>
<p><strong>Pincode:</strong> {{pincode}}</p>

<h3>Service Requested:</h3>
<p><strong>Solar Installation:</strong> {{solar_selected}}</p>
<p><strong>Fabrication Enquiry:</strong> {{fabrication_selected}}</p>

{{#if solar_selected}}
<h4>☀️ Solar Installation Details:</h4>
<p><strong>Kilowatt Needed:</strong> {{kilowatt}} kW</p>
<p><strong>EB Service Number:</strong> {{eb_service_number}}</p>
<p><strong>Registered Mobile:</strong> {{registered_mobile}}</p>
{{/if}}

{{#if fabrication_selected}}
<h4>🔧 Fabrication Details:</h4>
<p><strong>Length:</strong> {{length}} feet</p>
<p><strong>Breadth:</strong> {{breadth}} feet</p>
<p><strong>Material Type:</strong> {{material_type}}</p>
<p><strong>Other Material:</strong> {{other_material}}</p>
{{/if}}

<hr>
<p><em>Submitted on: {{submission_date}}</em></p>

<br>
<p>Full Message:</p>
<pre>{{message}}</pre>
```

4. Set **"To email"** field to: `{{to_email}}` or directly to `iravigreenenergy@gmail.com`
5. Click **"Save"**
6. **Copy the Template ID** (looks like: `template_xxxxxxx`)

---

## Step 4: Get Public Key

1. Go to **"Account"** → **"General"** in the dashboard
2. Find **"Public Key"** section
3. **Copy your Public Key** (looks like: `xxxxxxxxxx`)

---

## Step 5: Update Angular Application

Open `src/app/services/email.ts` and update these values:

```typescript
private emailJsConfig = {
  serviceId: 'service_xxxxxxx',     // Paste your Service ID here
  templateId: 'template_xxxxxxx',   // Paste your Template ID here
  publicKey: 'xxxxxxxxxx'            // Paste your Public Key here
};
```

**Example:**
```typescript
private emailJsConfig = {
  serviceId: 'service_abc123',
  templateId: 'template_xyz789',
  publicKey: 'YourPublicKey123'
};
```

---

## Step 6: Test the Form

1. Save all files
2. The Angular dev server will automatically reload
3. Go to the **Enquiry** page
4. Fill out the form
5. Click **"Submit Enquiry"**
6. Check your inbox at **iravigreenenergy@gmail.com**

---

## Free Tier Limits

- **200 emails per month** (free)
- Upgrade for more emails if needed

---

## Troubleshooting

### Issue: Email not received
- Check spam/junk folder
- Verify all IDs are correct in `email.ts`
- Check EmailJS dashboard for send status

### Issue: "Failed to send enquiry" error
- Open browser console (F12) to see detailed error
- Verify your EmailJS account is active
- Check if you've exceeded monthly limit

### Issue: Template variables not showing
- Make sure template variable names match exactly
- Use double curly braces: `{{variable_name}}`

---

## Important Notes

1. **Never share your keys publicly** - they're already in your code
2. **EmailJS is free for 200 emails/month** - perfect for small businesses
3. **Emails come FROM your Gmail** (iravigreenenergy@gmail.com)
4. **You receive emails TO your Gmail**
5. **No backend required!**

---

## Alternative: Enable Less Secure Apps (if needed)

If Gmail blocks EmailJS:
1. Go to Google Account Settings
2. Security → Less secure app access
3. Turn ON (or use App Password instead)

---

## Need Help?

- EmailJS Documentation: https://www.emailjs.com/docs/
- EmailJS Support: https://www.emailjs.com/support/
- Video Tutorial: Search "EmailJS tutorial" on YouTube

---

**Your form will now send emails directly from your Gmail account!** 📧✨
