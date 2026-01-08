# 📧 EmailJS Setup Guide - Direct Email Sending

## ✅ What This Fixes

Your Iraivi Enterprises enquiry form will send emails **DIRECTLY** without opening Gmail, Outlook, or any email client!

**How it works:**
- Customer fills the form
- Clicks "Submit"
- Email sends automatically in background
- **FROM:** Customer's email (from form) ← Dynamic!
- **TO:** moorthyvinayaka77@gmail.com
- No popups, no email client opens!

---

## 🚀 Quick Setup (10 Minutes)

### Step 1: Create EmailJS Account (2 min)

1. Go to **https://www.emailjs.com/**
2. Click **"Sign Up"** (top right)
3. Sign up with Google (quick) or email
4. Verify your email address
5. Login to EmailJS dashboard

**Status:** ⬜ Not Started | ✅ Completed

---

### Step 2: Add Gmail Service (3 min)

1. In EmailJS dashboard, click **"Email Services"** (left menu)
2. Click **"Add New Service"** button
3. Select **"Gmail"** from the list
4. Click **"Connect Account"**
5. Sign in with **moorthyvinayaka77@gmail.com**
6. Click **"Allow"** to grant EmailJS permissions
7. **⚠️ IMPORTANT**: Copy the **Service ID** that appears
   
   ```
   Service ID: service_________________
   
   Write it here → _____________________
   ```

**Status:** ⬜ Not Started | ✅ Completed

---

### Step 3: Create Email Template (4 min)

1. In EmailJS dashboard, click **"Email Templates"** (left menu)
2. Click **"Create New Template"** button
3. Set **Template Name**: `Iraivi Enterprises Enquiry`
4. Set **Subject**: `New Enquiry from {{from_name}} - Iraivi Enterprises`

5. **Template Settings** (click Settings tab):
   - **To Email**: `{{to_email}}`
   - **From Name**: `{{from_name}}`
   - **From Email**: (leave default)
   - **Reply To**: `{{reply_to}}`

6. **Content** tab - Paste this HTML template:

```html
<div style="font-family: Arial, sans-serif; max-width: 600px; margin: 0 auto; border: 1px solid #ddd; border-radius: 10px; overflow: hidden;">
  <!-- Header -->
  <div style="background: linear-gradient(135deg, #FF6B35 0%, #F7931E 100%); color: white; padding: 30px; text-align: center;">
    <h1 style="margin: 0; font-size: 28px;">🌟 New Enquiry</h1>
    <h2 style="margin: 10px 0 0 0; font-weight: normal;">Iraivi Enterprises</h2>
    <p style="margin: 5px 0 0 0; opacity: 0.9;">Solar Work & Fabrication Services</p>
  </div>
  
  <!-- Content -->
  <div style="padding: 30px; background: #f9f9f9;">
    <!-- Customer Info -->
    <div style="background: white; padding: 20px; border-radius: 8px; margin-bottom: 20px; box-shadow: 0 2px 4px rgba(0,0,0,0.1);">
      <h3 style="color: #FF6B35; margin: 0 0 15px 0; border-bottom: 2px solid #FF6B35; padding-bottom: 10px;">👤 Customer Information</h3>
      <table style="width: 100%; border-collapse: collapse;">
        <tr><td style="padding: 8px; border-bottom: 1px solid #eee;"><strong>Name:</strong></td><td style="padding: 8px; border-bottom: 1px solid #eee;">{{customer_name}}</td></tr>
        <tr><td style="padding: 8px; border-bottom: 1px solid #eee;"><strong>Email:</strong></td><td style="padding: 8px; border-bottom: 1px solid #eee;">{{customer_email}}</td></tr>
        <tr><td style="padding: 8px; border-bottom: 1px solid #eee;"><strong>Mobile:</strong></td><td style="padding: 8px; border-bottom: 1px solid #eee;">{{customer_mobile}}</td></tr>
        <tr><td style="padding: 8px;"><strong>Age:</strong></td><td style="padding: 8px;">{{customer_age}}</td></tr>
      </table>
    </div>

    <!-- Address -->
    <div style="background: white; padding: 20px; border-radius: 8px; margin-bottom: 20px; box-shadow: 0 2px 4px rgba(0,0,0,0.1);">
      <h3 style="color: #FF6B35; margin: 0 0 15px 0; border-bottom: 2px solid #FF6B35; padding-bottom: 10px;">📍 Address</h3>
      <p><strong>District:</strong> {{district}}</p>
      <p><strong>City:</strong> {{city}}</p>
      <p><strong>Pincode:</strong> {{pincode}}</p>
    </div>

    <!-- Services -->
    <div style="background: white; padding: 20px; border-radius: 8px; margin-bottom: 20px; box-shadow: 0 2px 4px rgba(0,0,0,0.1);">
      <h3 style="color: #FF6B35; margin: 0 0 15px 0; border-bottom: 2px solid #FF6B35; padding-bottom: 10px;">🔧 Services Requested</h3>
      
      <!-- Solar -->
      <div style="margin-bottom: 15px;">
        <div style="background: #e3f2fd; padding: 10px; border-radius: 5px; margin-bottom: 10px;">
          <strong>☀️ Solar Installation:</strong> {{solar_installation}}
        </div>
        <div style="margin-left: 20px;">
          <p>• <strong>Kilowatt Needed:</strong> {{kilowatt_needed}}</p>
          <p>• <strong>EB Service Number:</strong> {{eb_service_number}}</p>
          <p>• <strong>Registered Mobile:</strong> {{registered_mobile}}</p>
        </div>
      </div>

      <!-- Fabrication -->
      <div>
        <div style="background: #fff3e0; padding: 10px; border-radius: 5px; margin-bottom: 10px;">
          <strong>🔨 Fabrication Work:</strong> {{fabrication_enquiry}}
        </div>
        <div style="margin-left: 20px;">
          <p>• <strong>Length:</strong> {{length}} feet</p>
          <p>• <strong>Breadth:</strong> {{breadth}} feet</p>
          <p>• <strong>Material Type:</strong> {{material_type}}</p>
          <p>• <strong>Other Material:</strong> {{other_material}}</p>
        </div>
      </div>
    </div>

    <!-- Timestamp -->
    <div style="text-align: center; padding: 15px; background: #f5f5f5; border-radius: 8px;">
      <p style="margin: 0;"><strong>📅 Submitted:</strong> {{submission_date}}</p>
    </div>
  </div>
  
  <!-- Footer -->
  <div style="background: #333; color: white; padding: 20px; text-align: center;">
    <p style="margin: 0;"><strong>Iraivi Enterprises</strong></p>
    <p style="margin: 5px 0 0 0; opacity: 0.8;">Solar Work & Fabrication Services</p>
    <p style="margin: 15px 0 0 0; padding-top: 15px; border-top: 1px solid rgba(255,255,255,0.2);">
      💬 Reply to this email to contact: {{reply_to}}
    </p>
  </div>
</div>
```

7. Click **"Save"** button
8. **⚠️ IMPORTANT**: Copy the **Template ID** that appears
   
   ```
   Template ID: template_________________
   
   Write it here → _____________________
   ```

**Status:** ⬜ Not Started | ✅ Completed

---

### Step 4: Get Public Key (1 min)

1. Click on your **account name/profile** (top right corner)
2. Select **"Account"** from dropdown
3. Click on **"General"** tab
4. Scroll to **"API Keys"** or **"Public Key"** section
5. **⚠️ IMPORTANT**: Copy your **Public Key**
   
   ```
   Public Key: _____________________
   
   Write it here → _____________________
   ```

**Status:** ⬜ Not Started | ✅ Completed

---

### Step 5: Update Your Code (2 min)

1. Open **Visual Studio Code**
2. Open file: **`src/app/services/email.ts`**
3. Find lines 26-30 (emailJsConfig object)

**Current code:**
```typescript
private emailJsConfig = {
  serviceId: 'YOUR_SERVICE_ID',     // Example: 'service_abc1234'
  templateId: 'YOUR_TEMPLATE_ID',   // Example: 'template_xyz5678'
  publicKey: 'YOUR_PUBLIC_KEY'      // Example: 'abcdef123456'
};
```

**Replace with YOUR values:**
```typescript
private emailJsConfig = {
  serviceId: 'service_abc1234',     // ← Your Service ID from Step 2
  templateId: 'template_xyz5678',   // ← Your Template ID from Step 3
  publicKey: 'abcdef123456'         // ← Your Public Key from Step 4
};
```

4. **Save the file** (Ctrl+S or Cmd+S)
5. Browser will auto-reload

**Status:** ⬜ Not Started | ✅ Completed

---

### Step 6: Test! (1 min)

1. Open browser: **http://localhost:4200**
2. Go to **Enquiry** page
3. Fill the form with test data:
   - Name: Test Customer
   - Email: test@example.com ← This will be FROM address
   - Mobile: 9876543210
   - Age: 30
   - District, City, Pincode: Test data
   - Select "Solar Installation" and fill details
   
4. Click **"Submit Enquiry"**
5. Should see success message!
6. Check **moorthyvinayaka77@gmail.com** inbox
7. Email should arrive within seconds!

**Email will show:**
- FROM: test@example.com (customer's email)
- TO: moorthyvinayaka77@gmail.com
- Beautiful HTML formatting
- All enquiry details

**Status:** ⬜ Not Started | ✅ Completed

---

## ✅ Verification Checklist

After setup, verify:
- [ ] EmailJS dashboard shows service as "Connected"
- [ ] Email template is saved and active
- [ ] All three IDs are replaced in code (no 'YOUR_' text)
- [ ] Service ID starts with `service_`
- [ ] Template ID starts with `template_`
- [ ] Public Key is alphanumeric string
- [ ] Browser console shows "EmailJS initialized successfully"
- [ ] Test email was received in moorthyvinayaka77@gmail.com
- [ ] Email shows customer's email as sender
- [ ] Reply button in email goes to customer's email

---

## 🎉 Success!

Once configured, your enquiry form will:
- ✅ Send emails **directly** (no email client opens)
- ✅ FROM: Customer's email (dynamic from form)
- ✅ TO: moorthyvinayaka77@gmail.com
- ✅ Professional HTML formatting
- ✅ Instant delivery
- ✅ Free for 200 emails/month
- ✅ Production ready!

---

## 🔧 Troubleshooting

### Issue: "EmailJS NOT configured" in console

**Solution:**
- Check you replaced all 3 values in `email.ts`
- Make sure no 'YOUR_' prefix remains
- Service ID should start with `service_`
- Template ID should start with `template_`
- Restart dev server: Stop (Ctrl+C) and run `ng serve` again

### Issue: Email not received

**Solutions:**
1. Check spam/junk folder in Gmail
2. Verify Service ID, Template ID, Public Key are correct
3. Go to EmailJS dashboard → Logs to see if email was sent
4. Check Gmail service shows "Connected" in EmailJS
5. Make sure template "To Email" is set to `{{to_email}}`

### Issue: Form shows error after submit

**Solutions:**
1. Open browser console (F12)
2. Look for detailed error message
3. Check Network tab for failed requests
4. Verify internet connection
5. Check EmailJS account isn't over quota (200/month free)

### Issue: Template formatting broken

**Solutions:**
- Copy the entire HTML template (don't miss any tags)
- Check all variables have double curly braces: `{{variable}}`
- Test template in EmailJS dashboard
- Make sure Reply To is set to `{{reply_to}}`

---

## 💰 EmailJS Pricing

**Free Plan** (Perfect for you!):
- ✅ 200 emails per month
- ✅ All features included
- ✅ No credit card required
- ✅ No expiration

**Paid Plans** (if you need more):
- $15/month → 1,000 emails
- $30/month → 5,000 emails
- Custom plans available

---

## 🔒 Security Notes

**Safe to include in code:**
- ✅ Service ID (not sensitive)
- ✅ Template ID (not sensitive)
- ✅ Public Key (designed for frontend use)

**Never share:**
- ❌ EmailJS account password
- ❌ Gmail password
- ❌ Private API keys (not used here)

**How it's secure:**
- EmailJS handles Gmail authentication
- Your Gmail password is never exposed
- All connections are SSL/TLS encrypted
- Public Key can only send emails (can't read inbox)

---

## 📚 Additional Resources

- **EmailJS Docs**: https://www.emailjs.com/docs/
- **EmailJS Dashboard**: https://dashboard.emailjs.com/
- **EmailJS Support**: https://www.emailjs.com/support/

---

## 📞 Need Help?

If you're stuck:
1. Check browser console for detailed errors (F12)
2. Check EmailJS dashboard logs
3. Re-read this guide carefully
4. Make sure all steps are completed
5. Contact EmailJS support if needed

---

**Setup Time:** ~10 minutes  
**Difficulty:** Easy ⭐☆☆☆☆  
**Cost:** FREE (200 emails/month)  
**Result:** Professional direct email system! 🚀

---

*Last Updated: January 7, 2026*  
*For: Iraivi Enterprises Angular Application*
