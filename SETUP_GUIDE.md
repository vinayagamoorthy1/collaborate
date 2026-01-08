# 📧 Email Functionality Setup Guide - Iraivi Enterprises

## 🎯 Quick Start

**Good News!** Your enquiry form already works! Here's what happens:

### Without Any Setup (Works Now!)
1. User fills the enquiry form
2. User clicks "Submit"
3. A dialog appears with two options:
   - **Option A:** Opens email client with pre-filled details
   - **Option B:** Copies enquiry to clipboard
4. User sends email manually

### With EmailJS Setup (Better Experience)
1. User fills the enquiry form
2. User clicks "Submit"
3. Email sends automatically to `iravigreenenergy@gmail.com`
4. User sees success message
5. Done! No manual email sending needed

---

## 🚀 Option 1: Use Current Setup (No Configuration)

**Already working!** Just:
1. Run `ng serve`
2. Test the enquiry form
3. When prompted, choose to open email client or copy to clipboard

**Pros:**
- ✅ No setup required
- ✅ Works immediately
- ✅ No dependencies
- ✅ No costs

**Cons:**
- ❌ User must manually send email
- ❌ Less professional experience
- ❌ May not work on all browsers

---

## 🎨 Option 2: Setup EmailJS (Recommended)

### Why EmailJS?
- ✅ Automatic email sending
- ✅ Better user experience
- ✅ No backend server needed
- ✅ Free for 200 emails/month
- ✅ Gmail integration
- ✅ Professional appearance

### Setup Time: ~10 minutes

---

## 📋 EmailJS Setup Instructions

### Step 1: Create Account (2 minutes)

1. Visit [https://www.emailjs.com/](https://www.emailjs.com/)
2. Click **"Sign Up"** (top right)
3. Register with any email
4. Verify your email

### Step 2: Connect Gmail (3 minutes)

1. Login to EmailJS
2. Click **"Email Services"** (left sidebar)
3. Click **"Add New Service"**
4. Choose **"Gmail"**
5. Click **"Connect Account"**
6. Login with: `iravigreenenergy@gmail.com`
7. Click **"Allow"** to grant permissions
8. Name the service: "Iraivi Gmail"
9. Click **"Create Service"**
10. **📝 SAVE THE SERVICE ID** (looks like: `service_abc123`)

### Step 3: Create Email Template (3 minutes)

1. Click **"Email Templates"** (left sidebar)
2. Click **"Create New Template"**
3. Name: "Iraivi Enquiry"
4. Click **"Settings"** tab:
   - To Email: `iravigreenenergy@gmail.com`
   - From Name: `{{from_name}}`
   - Reply To: `{{from_email}}`

5. Click **"Content"** tab

**Subject Line:**
```
New Enquiry from {{from_name}} - Iraivi Enterprises
```

**Email Body:** (Paste this)
```html
<h2>🎉 New Enquiry - Iraivi Enterprises</h2>
<hr>

<h3>📞 Contact Information</h3>
<p><strong>Name:</strong> {{from_name}}</p>
<p><strong>Email:</strong> {{from_email}}</p>
<p><strong>Mobile:</strong> {{from_mobile}}</p>
<p><strong>Age:</strong> {{age}}</p>

<h3>📍 Address</h3>
<p><strong>District:</strong> {{district}}</p>
<p><strong>City:</strong> {{city}}</p>
<p><strong>Pincode:</strong> {{pincode}}</p>

<h3>🔧 Services</h3>
<p><strong>Solar Installation:</strong> {{solar_selected}}</p>
<p><strong>Fabrication Work:</strong> {{fabrication_selected}}</p>

<h3>☀️ Solar Details</h3>
<p><strong>Kilowatt:</strong> {{kilowatt}}</p>
<p><strong>EB Service #:</strong> {{eb_service_number}}</p>
<p><strong>Registered Mobile:</strong> {{registered_mobile}}</p>

<h3>🔨 Fabrication Details</h3>
<p><strong>Length:</strong> {{length}}</p>
<p><strong>Breadth:</strong> {{breadth}}</p>
<p><strong>Material:</strong> {{material_type}}</p>
<p><strong>Other Material:</strong> {{other_material}}</p>

<hr>
<p><em>Submitted: {{submission_date}}</em></p>
```

6. Click **"Save"**
7. **📝 SAVE THE TEMPLATE ID** (looks like: `template_xyz789`)

### Step 4: Get Public Key (1 minute)

1. Click your **name** (top right)
2. Click **"Account"**
3. Go to **"General"** tab
4. Find **"Public Key"** section
5. **📝 SAVE YOUR PUBLIC KEY** (looks like: `AbCdEf123456`)

### Step 5: Update Code (1 minute)

1. Open: `src/app/services/email.ts`
2. Find (around line 16-20):

```typescript
private emailJsConfig = {
  serviceId: 'YOUR_SERVICE_ID',
  templateId: 'YOUR_TEMPLATE_ID',
  publicKey: 'YOUR_PUBLIC_KEY'
};
```

3. Replace with your actual values:

```typescript
private emailJsConfig = {
  serviceId: 'service_abc123',      // YOUR Service ID from Step 2
  templateId: 'template_xyz789',    // YOUR Template ID from Step 3
  publicKey: 'AbCdEf123456'         // YOUR Public Key from Step 4
};
```

4. Save the file

### Step 6: Test! (1 minute)

1. Application will auto-reload
2. Go to **Enquiry** page
3. Fill and submit form
4. Should see success message
5. Check Gmail inbox for email!

---

## ✅ Verification

After setup, check:
- [ ] No `YOUR_` prefix in values
- [ ] Service ID starts with `service_`
- [ ] Template ID starts with `template_`
- [ ] Public Key is alphanumeric
- [ ] Test email received in Gmail

---

## 🔧 Troubleshooting

### Dialog still appears asking to open email client
**Problem:** EmailJS not configured
**Solution:** 
- Check all three values are replaced
- No `YOUR_` prefix should remain
- Restart dev server: `Ctrl+C` then `ng serve`

### "Failed to send email" error
**Problem:** Wrong credentials or template issue
**Solution:**
1. Verify Service ID in EmailJS dashboard
2. Verify Template ID in EmailJS dashboard
3. Check browser console (F12) for detailed error
4. Ensure Gmail is still connected in EmailJS

### Emails not received
**Solutions:**
1. Check Gmail spam folder
2. Verify "To Email" in template settings
3. Check EmailJS dashboard → Email Logs
4. Ensure Service is still connected to Gmail

### "Rate limit exceeded"
**Problem:** Sent more than 200 emails this month
**Solutions:**
- Wait for monthly reset
- Upgrade EmailJS plan
- Use mailto fallback temporarily

---

## 🔒 Security

**Safe to include in code:**
- ✅ Public Key (designed for client-side)
- ✅ Service ID
- ✅ Template ID

**Never share:**
- ❌ EmailJS password
- ❌ Gmail password

---

## 📊 EmailJS Plans

**Free:** 200 emails/month (Perfect for small business)
**Personal:** $7/month - 1,000 emails
**Business:** $15/month - 5,000 emails

---

## 🆘 Need Help?

1. Check browser console (F12) for errors
2. Check EmailJS dashboard for logs
3. Read: [EmailJS Docs](https://www.emailjs.com/docs/)
4. Test with a simple form first

---

## 📝 Summary

**Without EmailJS:**
- ✅ Works now
- ✅ No setup
- ❌ Manual email sending

**With EmailJS:**
- ✅ Automatic emails
- ✅ Professional UX
- ✅ 10 min setup
- ✅ Free for 200/month

**Your Choice!** Both options work perfectly.

---

*Last updated: January 2025*
*For Iraivi Enterprises - Solar & Fabrication Work*
