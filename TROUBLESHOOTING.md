# 🔧 Troubleshooting Guide - Iraivi Enterprises Email Form

## 🎯 Common Issues and Solutions

### Issue 1: Form shows dialog when submitting

**What you see:**
```
📧 Email Setup Required

The direct email service (EmailJS) is not configured yet.

Would you like to open your email client to send the enquiry?
```

**Why this happens:**
EmailJS is not configured yet (this is normal!)

**Solutions:**

**Option A: Use Mailto (Immediate - No Setup)**
1. Click "OK" in the dialog
2. Your email client opens with pre-filled details
3. Click "Send" in your email app
4. Done! ✅

**Option B: Setup EmailJS (Better Experience)**
1. Read `SETUP_GUIDE.md`
2. Takes ~10 minutes
3. Follow steps to get Service ID, Template ID, and Public Key
4. Update `src/app/services/email.ts`
5. Restart application
6. Emails will send automatically! ✅

---

### Issue 2: Email client doesn't open

**Possible causes:**
- No default email client configured
- Browser blocks mailto links
- Email client not installed

**Solutions:**

1. **Use clipboard option:**
   - Click "Cancel" in dialog
   - Enquiry details copied to clipboard
   - Open Gmail manually
   - Paste details
   - Send to: iravigreenenergy@gmail.com

2. **Setup EmailJS:**
   - See `SETUP_GUIDE.md`
   - Bypasses email client requirement

3. **Configure default email client:**
   - Windows: Settings → Apps → Default Apps → Email
   - Mac: Mail.app usually works
   - Or use web browser: gmail.com

---

### Issue 3: Form validation errors

**Common validation issues:**

**Name:**
- Must be at least 3 characters
- Cannot be empty

**Mobile Number:**
- Must be exactly 10 digits
- Only numbers allowed
- No spaces or special characters

**Age:**
- Must be between 18 and 100
- Must be a number

**Email:**
- Must be valid email format
- Example: name@domain.com

**Pincode:**
- Must be exactly 6 digits
- Only numbers allowed

**Service Selection:**
- Must select at least one: Solar OR Fabrication
- Can select both

**Solar Fields (if Solar selected):**
- Kilowatt must be greater than 0
- EB Service Number required
- Registered Mobile must be 10 digits

**Fabrication Fields (if Fabrication selected):**
- Length must be greater than 0
- Breadth must be greater than 0
- Material Type must be selected
- If "Others" selected, must specify material

**Solution:**
- Check error messages under each field
- Fix the highlighted fields
- All required fields must be filled

---

### Issue 4: "Failed to send email" error

**If EmailJS is configured:**

1. **Check credentials in `email.ts`:**
```typescript
private emailJsConfig = {
  serviceId: 'service_abc123',      // Should start with 'service_'
  templateId: 'template_xyz789',    // Should start with 'template_'
  publicKey: 'AbCdEf123456'         // Alphanumeric string
};
```

2. **Verify in EmailJS Dashboard:**
- Is Gmail service still connected?
- Is template active?
- Any error logs?

3. **Check browser console (F12):**
- Look for detailed error messages
- Network errors?
- CORS issues?

4. **Common fixes:**
- Re-enter credentials
- Restart dev server (`Ctrl+C`, then `ng serve`)
- Clear browser cache
- Re-connect Gmail in EmailJS

**Fallback:**
- Error dialog will offer mailto or clipboard options
- Use these as backup

---

### Issue 5: Application won't start

**Error:** `Cannot find module` or similar

**Solutions:**

1. **Install dependencies:**
```powershell
cd c:\Iravi
npm install
```

2. **Clear cache and reinstall:**
```powershell
cd c:\Iravi
rmdir -r node_modules
rmdir -r .angular
npm install
```

3. **Check Node version:**
```powershell
node --version
# Should be v18 or higher
```

4. **Update Angular CLI:**
```powershell
npm install -g @angular/cli@latest
```

---

### Issue 6: Form doesn't reset after submission

**Expected behavior:**
- Success message shows for 3 seconds
- Form resets automatically
- Can submit new enquiry

**If not working:**
- Check browser console for errors
- Try refreshing the page
- May need to restart dev server

---

### Issue 7: Conditional fields not showing/hiding

**Solar Installation fields should show when:**
- "Solar Installation" checkbox is checked

**Fabrication fields should show when:**
- "Fabrication Enquiry" checkbox is checked

**"Other Material" textbox should show when:**
- "Fabrication Enquiry" is checked
- Material Type is set to "Others"

**If not working:**
1. Refresh the page
2. Check browser console for errors
3. Clear browser cache
4. Restart dev server

---

### Issue 8: Mobile menu not working

**Hamburger icon should:**
- Appear on mobile/small screens
- Toggle menu open/closed when clicked

**If not working:**
1. Check Bootstrap JS is loaded (see `src/index.html`)
2. Clear browser cache
3. Test in different browser
4. Restart dev server

---

### Issue 9: EmailJS rate limit exceeded

**Error:** "Service rate limit exceeded"

**Why:** Free EmailJS plan allows 200 emails/month

**Solutions:**

1. **Check usage:**
   - Login to EmailJS dashboard
   - View email logs
   - See how many emails sent

2. **Immediate fix:**
   - Use mailto fallback
   - Or clipboard option
   - Send emails manually

3. **Long-term fix:**
   - Upgrade EmailJS plan ($7/month for 1000 emails)
   - Or wait for monthly reset
   - Or implement backend email service

---

### Issue 10: Styling looks broken

**Possible causes:**
- Bootstrap not loaded
- CSS not compiled
- Cache issue

**Solutions:**

1. **Hard refresh:**
   - Chrome/Edge: `Ctrl + Shift + R`
   - Firefox: `Ctrl + F5`

2. **Clear browser cache:**
   - Settings → Privacy → Clear browsing data

3. **Restart dev server:**
```powershell
# In terminal, press Ctrl+C, then:
ng serve
```

4. **Check Bootstrap:**
- Open browser console (F12)
- Look for 404 errors
- Check `src/index.html` has Bootstrap CDN links

---

## 🔍 How to Check Browser Console

1. **Open Console:**
   - Chrome/Edge: Press `F12` or `Ctrl+Shift+I`
   - Firefox: Press `F12`
   - Safari: Enable Developer menu, then `Cmd+Option+C`

2. **What to look for:**
   - Red errors
   - Network failures (404, 500)
   - Warning messages
   - EmailJS errors

3. **Common error messages:**
   - `404 Not Found` → File missing
   - `CORS error` → Server configuration issue
   - `EmailJS error` → Check credentials
   - `undefined is not a function` → Code error

---

## 📞 Still Having Issues?

### Quick Checklist:
- [ ] Node.js v18+ installed
- [ ] Dependencies installed (`npm install`)
- [ ] Dev server running (`ng serve`)
- [ ] Browser console checked (F12)
- [ ] EmailJS configured OR using mailto fallback
- [ ] All form fields valid

### Testing Steps:
1. Fill form with valid data
2. Select at least one service type
3. Fill conditional fields if shown
4. Click Submit
5. Follow dialog instructions OR see success message

### Files to Check:
- `src/app/services/email.ts` → Email configuration
- `src/app/pages/enquiry/enquiry.ts` → Form logic
- `src/index.html` → Bootstrap and scripts loaded

### Get Help:
1. Check browser console errors
2. Read `SETUP_GUIDE.md` for EmailJS setup
3. Review this troubleshooting guide
4. Check EmailJS dashboard logs
5. Restart everything and try again

---

## ✅ Expected Working Behavior

**Without EmailJS:**
1. Submit form
2. Dialog appears
3. Choose email client or clipboard
4. Send email manually
5. Success! ✅

**With EmailJS:**
1. Submit form
2. Loading indicator shows briefly
3. Success message appears
4. Form resets after 3 seconds
5. Email arrives automatically
6. Done! ✅

Both scenarios are **correct and working**!

---

*Last updated: January 2025*
*For Iraivi Enterprises*
