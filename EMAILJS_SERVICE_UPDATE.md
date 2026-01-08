# EmailJS Service ID Update

## Update Made - January 8, 2026

### Service Configuration
- **File**: `c:\Iravi\src\app\services\email.ts`
- **Service ID**: Updated to `service_kcduas6`

### Current Configuration Status

✅ **Service ID**: `service_kcduas6` (CONFIGURED)  
⚠️ **Template ID**: `YOUR_TEMPLATE_ID` (NEEDS CONFIGURATION)  
⚠️ **Public Key**: `YOUR_PUBLIC_KEY` (NEEDS CONFIGURATION)

### Next Steps to Complete EmailJS Setup

1. **Get Your Template ID**
   - Go to https://dashboard.emailjs.com/admin/templates
   - Create or select your email template
   - Copy the Template ID (format: `template_xxxxxxx`)
   - Update line 11 in `email.ts`

2. **Get Your Public Key**
   - Go to https://dashboard.emailjs.com/admin/account
   - Find your Public Key (under "API Keys" section)
   - Copy the Public Key (format: alphanumeric string)
   - Update line 12 in `email.ts`

3. **Test the Configuration**
   - Navigate to the "Get Quote" page
   - Fill out the enquiry form
   - Submit and verify the email is received at `iravigreenenergy@gmail.com`

### Email Template Variables

Make sure your EmailJS template includes these variables:

**Customer Information:**
- `{{from_name}}` - Customer name
- `{{from_email}}` - Customer email (used as reply-to)
- `{{customer_mobile}}` - Customer mobile number
- `{{customer_age}}` - Customer age
- `{{district}}` - District
- `{{city}}` - City
- `{{pincode}}` - Pincode

**Solar Installation Details:**
- `{{solar_installation}}` - Yes/No
- `{{kilowatt_needed}}` - KW capacity
- `{{eb_service_number}}` - EB service number
- `{{registered_mobile}}` - EB registered mobile

**Fabrication Work Details:**
- `{{fabrication_enquiry}}` - Yes/No
- `{{length}}` - Length in feet
- `{{breadth}}` - Breadth in feet
- `{{material_type}}` - Material type
- `{{other_material}}` - Other material description

**System Information:**
- `{{to_email}}` - iravigreenenergy@gmail.com
- `{{reply_to}}` - Customer email
- `{{submission_date}}` - Date and time of submission

### Sample Email Template

```html
<!DOCTYPE html>
<html>
<head>
  <style>
    body { font-family: Arial, sans-serif; line-height: 1.6; }
    .header { background: linear-gradient(135deg, #ff6b35 0%, #f7931e 100%); color: white; padding: 20px; }
    .content { padding: 20px; }
    .section { margin-bottom: 20px; border-left: 4px solid #ff6b35; padding-left: 15px; }
    .label { font-weight: bold; color: #333; }
    .value { color: #666; }
  </style>
</head>
<body>
  <div class="header">
    <h2>🔔 New Enquiry from Iraivi Enterprises Website</h2>
  </div>
  
  <div class="content">
    <div class="section">
      <h3>👤 Customer Information</h3>
      <p><span class="label">Name:</span> <span class="value">{{from_name}}</span></p>
      <p><span class="label">Email:</span> <span class="value">{{from_email}}</span></p>
      <p><span class="label">Mobile:</span> <span class="value">{{customer_mobile}}</span></p>
      <p><span class="label">Age:</span> <span class="value">{{customer_age}}</span></p>
      <p><span class="label">Location:</span> <span class="value">{{city}}, {{district}} - {{pincode}}</span></p>
    </div>
    
    <div class="section">
      <h3>☀️ Solar Installation</h3>
      <p><span class="label">Interested:</span> <span class="value">{{solar_installation}}</span></p>
      {{#if kilowatt_needed}}
      <p><span class="label">KW Needed:</span> <span class="value">{{kilowatt_needed}}</span></p>
      <p><span class="label">EB Service #:</span> <span class="value">{{eb_service_number}}</span></p>
      <p><span class="label">Registered Mobile:</span> <span class="value">{{registered_mobile}}</span></p>
      {{/if}}
    </div>
    
    <div class="section">
      <h3>🔧 Fabrication Work</h3>
      <p><span class="label">Interested:</span> <span class="value">{{fabrication_enquiry}}</span></p>
      {{#if length}}
      <p><span class="label">Dimensions:</span> <span class="value">{{length}} x {{breadth}} feet</span></p>
      <p><span class="label">Material:</span> <span class="value">{{material_type}} {{other_material}}</span></p>
      {{/if}}
    </div>
    
    <div class="section">
      <p><span class="label">Submission Time:</span> <span class="value">{{submission_date}}</span></p>
    </div>
    
    <p style="color: #666; font-style: italic;">
      Reply directly to this email to contact the customer at {{from_email}}
    </p>
  </div>
</body>
</html>
```

### Verification Checklist

- [x] Service ID configured: `service_kcduas6`
- [ ] Template ID configured
- [ ] Public Key configured
- [ ] Email template created with all variables
- [ ] Test email sent successfully
- [ ] Email received at `iravigreenenergy@gmail.com`
- [ ] Reply-to address works correctly

### Support

If you need help with EmailJS setup:
- Documentation: https://www.emailjs.com/docs/
- Dashboard: https://dashboard.emailjs.com/
- Support: https://www.emailjs.com/docs/support/

### Important Notes

⚠️ **The enquiry form will NOT work until you complete all three configuration steps** (Service ID, Template ID, and Public Key).

📧 **All emails will be sent TO**: `iravigreenenergy@gmail.com`  
↩️ **Reply-To will be set to**: Customer's email address (for easy replies)

🔒 **Security**: Never commit your Public Key to public repositories. Consider using environment variables for production.
