# Contact Page - Iraivi Enterprises

## ✅ Complete Contact Page Created

### Features Implemented

#### 1. **Contact Information Cards (4 Cards)**
- **Location Card** 📍
  - Full business address
  - Professional card design with icon
  
- **Phone Card** 📞
  - Clickable phone numbers
  - Business hours display
  - Direct call links (`tel:` protocol)
  
- **Email Card** ✉️
  - Clickable email address: `iravigreenenergy@gmail.com`
  - Direct mailto link
  - Response time indicator
  
- **WhatsApp Card** 💬
  - Direct WhatsApp chat link
  - Pre-filled message
  - Green gradient background
  - "Chat Now" button

#### 2. **Google Maps Integration**
- Embedded Google Map (8 columns width)
- Shows business location
- Interactive map with zoom/pan
- Directions available
- Responsive height (450px desktop, 300px mobile)

#### 3. **Quick Actions Sidebar**
- **Submit Enquiry Form** button (Primary)
- **Call Now** button (Outline Primary)
- **WhatsApp Chat** button (Outline Success)
- All buttons are clickable with proper links

#### 4. **Business Hours Display**
- Detailed weekly schedule:
  - Monday - Friday: 9:00 AM - 6:00 PM
  - Saturday: 9:00 AM - 4:00 PM
  - Sunday: Closed
- Professional table-like layout

#### 5. **Social Media Links**
- Facebook 📘
- Instagram 📷
- LinkedIn 💼
- Twitter 🐦
- Circular icon design with hover effects

#### 6. **Emergency Contact Banner**
- Highlighted section for urgent inquiries
- Direct phone and WhatsApp buttons
- Eye-catching gradient background

## Contact Details Included

### Address
```
Iraivi Enterprises
123 Solar Street
Industrial Area
Chennai, Tamil Nadu - 600001
```

### Phone Numbers
- **Primary**: [+91 98765 43210](tel:+919876543210)
- **Secondary**: [+91 98765 43211](tel:+919876543211)

### Email
- **Main**: [iravigreenenergy@gmail.com](mailto:iravigreenenergy@gmail.com)

### WhatsApp
- **Number**: +91 98765 43210
- **Link**: [Click to Chat](https://wa.me/919876543210)
- **Pre-filled Message**: "Hello Iraivi Enterprises, I'm interested in your services"

## Visual Layout

```
+------------------------------------------------------------------+
|                         CONTACT US                               |
|                    Subtitle text here                            |
+------------------------------------------------------------------+
|                                                                  |
|   📍 Location  |  📞 Phone  |  ✉️ Email  |  💬 WhatsApp         |
|   [Card]       |  [Card]   |  [Card]   |  [Card]              |
|                                                                  |
+------------------------------------------------------------------+
|                                                                  |
|  +----------------------------------+  +---------------------+   |
|  |                                  |  | Quick Actions       |   |
|  |    Google Maps                   |  | [Enquiry Button]    |   |
|  |    (Interactive)                 |  | [Call Button]       |   |
|  |                                  |  | [WhatsApp Button]   |   |
|  |                                  |  | Business Hours      |   |
|  |                                  |  | Social Media        |   |
|  +----------------------------------+  +---------------------+   |
|                                                                  |
+------------------------------------------------------------------+
|                 NEED IMMEDIATE ASSISTANCE?                       |
|              [Call Button] [WhatsApp Button]                     |
+------------------------------------------------------------------+
```

## WhatsApp Integration

### How It Works
1. **WhatsApp Link Format**: `https://wa.me/919876543210?text=MESSAGE`
2. **Pre-filled Message**: Automatically includes greeting text
3. **Opens in**: 
   - WhatsApp app on mobile
   - WhatsApp Web on desktop
4. **No Installation Required**: Works directly from browser

### Customizing WhatsApp Message
To change the pre-filled message, edit the URL:
```html
https://wa.me/919876543210?text=Your%20Custom%20Message%20Here
```
Note: Use `%20` for spaces in the URL

## Google Maps Setup

### Current Status
The map currently uses a generic Chennai location. 

### To Update to Your Exact Location:

#### Method 1: Using Google Maps
1. Go to [Google Maps](https://www.google.com/maps)
2. Search for your business address
3. Click "Share" button
4. Select "Embed a map" tab
5. Copy the iframe code
6. Replace the iframe in `contact.html`

#### Method 2: Using Coordinates
1. Find your location on Google Maps
2. Right-click → "What's here?"
3. Copy the coordinates (e.g., 13.0827, 80.2707)
4. Update the iframe URL with your coordinates

#### Example iframe to replace:
```html
<iframe 
  src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3886.8412791364434!2d80.2707!3d13.0827!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3a5267840b3b3b3b%3A0x3b3b3b3b3b3b3b3b!2sYOUR_BUSINESS_NAME!5e0!3m2!1sen!2sin!4v1234567890"
  width="100%" 
  height="450" 
  style="border:0;" 
  allowfullscreen="" 
  loading="lazy">
</iframe>
```

## Styling Features

### Card Hover Effects
- Lift animation on hover (`translateY(-5px)`)
- Shadow increases for depth
- Smooth 0.3s transitions

### WhatsApp Card Special Styling
- Green gradient background (#25D366 to #128C7E)
- White text for contrast
- Special hover effect with scale

### Button Interactions
- All buttons have hover animations
- Shadow effects on hover
- Transform animations

### Responsive Design
- **Desktop**: 4 cards in a row, large map
- **Tablet**: 2 cards per row, medium map
- **Mobile**: 1 card per row, small map (300px)
- Font sizes adjust automatically
- Buttons stack vertically on small screens

## Files Modified

### 1. `src/app/pages/contact/contact.html`
Complete redesign with:
- 4 contact information cards
- Google Maps integration
- Quick actions sidebar
- Business hours section
- Social media links
- Emergency contact banner

### 2. `src/app/pages/contact/contact.scss`
Comprehensive styling:
- Contact card animations
- WhatsApp card gradient
- Map container styling
- Business hours table
- Social media icons
- Responsive breakpoints
- Hover effects and transitions

## Customization Guide

### Change Phone Numbers
Find and replace in `contact.html`:
```html
+91 98765 43210  →  Your actual number
+91 98765 43211  →  Your second number
```
Update in 4 places:
1. Phone card
2. WhatsApp card
3. Quick actions sidebar
4. Emergency banner

### Change Email Address
Currently set to: `iravigreenenergy@gmail.com`
Update in email card section

### Change Business Address
Update in location card:
```html
Iraivi Enterprises
123 Solar Street
Industrial Area
Chennai, Tamil Nadu - 600001
```

### Change Business Hours
Edit the hours-item sections in the Business Hours div

### Add/Remove Social Media Links
Edit the social-links section:
```html
<a href="YOUR_FACEBOOK_URL" class="social-link" title="Facebook">📘</a>
```

## Testing Checklist

### Functionality Tests
✅ **Phone Links**
- [ ] Click phone numbers → Opens phone dialer
- [ ] Works on mobile and desktop

✅ **Email Links**
- [ ] Click email → Opens email client
- [ ] Email address is correct

✅ **WhatsApp Links**
- [ ] Click WhatsApp button → Opens WhatsApp
- [ ] Pre-filled message appears
- [ ] Works on mobile app and web

✅ **Google Maps**
- [ ] Map loads correctly
- [ ] Can zoom in/out
- [ ] Can pan around
- [ ] "View larger map" works
- [ ] Directions available

✅ **Navigation**
- [ ] "Submit Enquiry Form" → Goes to enquiry page
- [ ] All buttons are clickable
- [ ] Links open in correct target (new tab for external)

### Visual Tests
✅ **Desktop View**
- [ ] 4 cards display in a row
- [ ] Map is wide enough
- [ ] Sidebar aligns properly
- [ ] Hover effects work smoothly

✅ **Mobile View**
- [ ] Cards stack vertically
- [ ] Map height is appropriate
- [ ] Buttons are full width
- [ ] Text is readable
- [ ] No horizontal scroll

✅ **Tablet View**
- [ ] 2 cards per row
- [ ] Layout is balanced
- [ ] Touch targets are adequate

## SEO & Accessibility

### Features Included
- ✅ Semantic HTML structure
- ✅ Proper heading hierarchy (h1, h4, h5)
- ✅ Alt text for icons (using emojis with aria-labels)
- ✅ Descriptive link text
- ✅ Keyboard navigation support
- ✅ Focus indicators on interactive elements
- ✅ ARIA labels for better screen reader support

### Schema Markup (Optional Enhancement)
Consider adding structured data for local business:
```html
<script type="application/ld+json">
{
  "@context": "https://schema.org",
  "@type": "LocalBusiness",
  "name": "Iraivi Enterprises",
  "address": {
    "@type": "PostalAddress",
    "streetAddress": "123 Solar Street, Industrial Area",
    "addressLocality": "Chennai",
    "addressRegion": "Tamil Nadu",
    "postalCode": "600001",
    "addressCountry": "IN"
  },
  "telephone": "+919876543210",
  "email": "iravigreenenergy@gmail.com"
}
</script>
```

## Future Enhancements (Optional)

### 1. Live Chat Widget
- Integrate Tawk.to or Intercom
- Real-time chat support

### 2. Contact Form
- Add inline contact form
- Alternative to enquiry page
- Quick message submission

### 3. Appointment Booking
- Calendar integration
- Schedule site visits
- Automated confirmations

### 4. Testimonials Section
- Customer reviews
- Star ratings
- Project photos

### 5. FAQ Section
- Common questions
- Accordion style
- Reduces contact volume

## Troubleshooting

### WhatsApp Not Opening
- Check phone number format (no spaces, with country code)
- Ensure WhatsApp is installed (mobile) or web.whatsapp.com works
- Test URL manually: `https://wa.me/919876543210`

### Map Not Loading
- Check internet connection
- Verify iframe src URL is correct
- Ensure Google Maps is not blocked
- Check browser console for errors

### Phone Links Not Working
- Ensure device has phone capability
- Check tel: protocol is properly formatted
- Test on actual mobile device

## Status
✅ **COMPLETED** - Full-featured contact page
✅ **WhatsApp Integration** - Direct chat links
✅ **Google Maps** - Interactive location map
✅ **Responsive Design** - Works on all devices
✅ **Professional Styling** - Modern UI/UX
✅ **No Errors** - HTML and SCSS validated

---

**Ready to use!** Update the phone numbers, email, and map location with your actual details, then test all links! 🎉
