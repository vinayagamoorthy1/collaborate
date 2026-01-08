# Address Update - Iravi Green Energy

## Date: January 8, 2026

## New Address

**Iravi Green Energy**  
150, 1st Meera Bhai Gas Agency  
Nandhavana Street, Peraiyur Road  
Usilampatti, Madurai - 625532  
Tamil Nadu, India

---

## Files Updated

### 1. Contact Page
**File**: `c:\Iravi\src\app\pages\contact\contact.html`

**Location**: Address Card (Lines 16-21)

**Updated From**:
```
Iraivi Enterprises
123 Solar Street
Industrial Area
Chennai, Tamil Nadu - 600001
```

**Updated To**:
```
Iravi Green Energy
150, 1st Meera Bhai Gas Agency
Nandhavana Street, Peraiyur Road
Usilampatti, Madurai - 625532
```

---

### 2. Footer Component
**File**: `c:\Iravi\src\app\components\footer\footer.html`

**Location**: Contact Information Section (Line 65)

**Updated From**:
```
123 Solar Street, Industrial Area
Chennai, Tamil Nadu - 600001
```

**Updated To**:
```
150, 1st Meera Bhai Gas Agency, Nandhavana Street
Peraiyur Road, Usilampatti, Madurai - 625532
```

---

### 3. Google Maps Embed
**File**: `c:\Iravi\src\app\pages\contact\contact.html`

**Location**: Map Container (Line 87)

**Updated**:
- Changed map location from Chennai to Usilampatti, Madurai
- Updated coordinates to point to Usilampatti area

**Note**: The Google Maps embed URL has been updated with approximate coordinates for Usilampatti. For the exact location, you can:

1. Go to [Google Maps](https://www.google.com/maps)
2. Search for: `150, 1st Meera Bhai Gas Agency, Nandhavana Street, Peraiyur Road, Usilampatti, Madurai - 625532`
3. Click "Share" → "Embed a map"
4. Copy the iframe code
5. Replace the iframe in `contact.html` (line 87-95)

---

## Location Details

### Geographic Information:
- **City**: Usilampatti
- **District**: Madurai
- **State**: Tamil Nadu
- **Country**: India
- **Pincode**: 625532
- **Landmark**: Near Meera Bhai Gas Agency, Nandhavana Street
- **Main Road**: Peraiyur Road

### Coordinates (Approximate):
- **Latitude**: ~9.97°N
- **Longitude**: ~77.79°E

---

## Where the Address Appears

The updated address now appears in:

### 1. **Contact Us Page** (`/contact`)
   - ✅ Address Card with location icon
   - ✅ Google Maps embed showing Usilampatti
   - ✅ Visible to all visitors

### 2. **Footer** (All Pages)
   - ✅ Contact Information section
   - ✅ Appears on every page: Home, About, Contact, Get Quote
   - ✅ Always visible at bottom

---

## Visual Presentation

### Contact Page Card:
```
┌─────────────────────────────┐
│          📍                 │
│     Our Location            │
│                             │
│   Iravi Green Energy        │
│   150, 1st Meera Bhai       │
│   Gas Agency                │
│   Nandhavana Street,        │
│   Peraiyur Road             │
│   Usilampatti, Madurai      │
│   625532                    │
└─────────────────────────────┘
```

### Footer Display:
```
📍 150, 1st Meera Bhai Gas Agency, Nandhavana Street
   Peraiyur Road, Usilampatti, Madurai - 625532
```

---

## Additional Updates Recommended

### 1. **Update Google Maps to Exact Location**
To show your exact business location on the map:

**Steps**:
1. Visit: https://www.google.com/maps
2. Search for your exact address
3. Click the location pin on your business
4. Click "Share" button
5. Select "Embed a map" tab
6. Copy the `<iframe>` code
7. Replace the iframe code in `contact.html` (lines 87-95)

### 2. **Update Company Name Consistency**
Notice: 
- Some places say "Iraivi Enterprises"
- New address says "Iravi Green Energy"

**Recommendation**: Decide on one official name and update throughout:
- Navbar brand name
- Footer company name
- About page
- Email templates
- All documentation

Current files to check:
- `navbar.html` - Line 6
- `footer.html` - Line 9
- `about.html` - Throughout
- `email.ts` - recipientEmail description

### 3. **Update Email Service Address**
Check if address is mentioned in email templates (EmailJS template).

### 4. **Update Meta Tags**
If you have meta tags for local SEO, update them with:
- New city: Usilampatti
- New district: Madurai
- New pincode: 625532

---

## Testing Checklist

- [x] Address updated in Contact page
- [x] Address updated in Footer
- [x] Google Maps updated (approximate location)
- [x] No HTML errors
- [ ] Test Contact page in browser
- [ ] Verify map loads correctly
- [ ] Check footer on all pages
- [ ] Test on mobile devices
- [ ] Verify address is readable
- [ ] Update exact Google Maps embed (recommended)
- [ ] Update company name consistency (if needed)

---

## Map Embed Enhancement

For the best Google Maps experience, you can:

### Option 1: Use Google Maps Embed API
1. Get your exact location coordinates
2. Use Google Maps Embed API with your API key
3. Customize map style and markers

### Option 2: Simple Embed (Current)
The current embed shows the general Usilampatti area. To make it more specific:

```html
<!-- Get this exact embed code from Google Maps -->
<iframe 
  src="YOUR_EXACT_GOOGLE_MAPS_EMBED_URL_HERE"
  width="100%" 
  height="450" 
  style="border:0;" 
  allowfullscreen="" 
  loading="lazy" 
  referrerpolicy="no-referrer-when-downgrade">
</iframe>
```

### How to Get Exact Embed Code:
1. Go to https://www.google.com/maps
2. Type: `150, 1st Meera Bhai Gas Agency, Nandhavana Street, Peraiyur Road, Usilampatti, Madurai 625532`
3. Click the location result
4. Click "Share" button
5. Click "Embed a map" tab
6. Choose size (Medium or Large recommended)
7. Click "Copy HTML"
8. Replace the iframe in your contact.html file

---

## Contact Information Summary

After these updates, your complete contact information is:

**Address**: 150, 1st Meera Bhai Gas Agency, Nandhavana Street, Peraiyur Road, Usilampatti, Madurai - 625532

**Email**: iravigreenenergy@gmail.com

**Phone**: +91 98765 43210 (Update if this is not correct)

**Social**: @iraivi_enterprises2026

**Website**: https://your-domain.com (when deployed)

**Business Hours**: Mon - Sat: 9:00 AM - 6:00 PM

---

## Next Steps

1. ✅ **Save all files** (if not auto-saved)
2. ✅ **Refresh browser** to see changes
3. 🔄 **Update Google Maps embed** with exact location
4. 🔄 **Verify phone number** is correct
5. 🔄 **Check company name** consistency across all pages
6. 🔄 **Test on mobile** devices
7. 🔄 **Update EmailJS template** with new address (if mentioned there)

---

## Files That Still Need Manual Review

You may want to check these files for old address references:

- `README.md`
- `CONTACT_PAGE_SETUP.md`
- `FOOTER_INTEGRATION.md`
- Any other documentation files

Use this command to search:
```
Search for: "123 Solar Street" or "Chennai" or "600001"
```

---

All address updates completed successfully! ✅
