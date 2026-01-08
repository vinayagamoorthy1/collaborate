# Iravi Enterprises - Solar & Fabrication Services

A modern, responsive web application for Iravi Enterprises - specialists in solar energy solutions and professional fabrication work in Usilampatti, Madurai, Tamil Nadu.

## � Project Status

**✅ COMPLETE & READY FOR DEPLOYMENT**

This project is fully developed and ready to be uploaded to GitHub and deployed to the web. Follow our comprehensive guides to get your website online in about 1 hour!

**👉 START HERE**: Open `START_HERE.md` to begin your launch journey!

## �🌟 Features

- **Fully Responsive Design** - Works seamlessly on all devices (mobile, tablet, desktop)
- **Modern UI** - Professional appearance with Bootstrap styling
- **Navigation Bar** - Easy-to-use navigation with company logo
- **Image Carousel** - Showcase solar installation projects
- **Direct Email Integration** - EmailJS for instant enquiries (no backend required)
- **Multiple Pages**:
  - Home - Company overview, services, and project showcase
  - About Us - Company information, mission, vision, and values
  - Contact Us - Contact form, business info, Google Maps, social media
  - Enquiry Form - Detailed form for project inquiries with validation
- **Form Validation** - User-friendly validation with error messages
- **Social Media Integration** - Instagram, Facebook, WhatsApp
- **SEO Optimized** - Sitemap and robots.txt for Google Search
- **Solar & Fabrication Theme** - Design reflects the company's business focus

## 🚀 Quick Start

### Prerequisites
- Node.js (v18 or higher)
- npm (comes with Node.js)

### Installation

1. Clone the repository or navigate to the project directory:
```bash
cd c:\Iravi
```

2. Install dependencies (if not already installed):
```bash
npm install
```

### Development Server

To start a local development server, run:

```bash
ng serve
```

Once the server is running, open your browser and navigate to `http://localhost:4200/`. The application will automatically reload whenever you modify any of the source files.

## 📋 Enquiry Form

The enquiry form includes validated fields for both **Solar Installation** and **Fabrication** services:

### Basic Information (Required)
- **Name** (minimum 3 characters)
- **Mobile Number** (10 digits)
- **Age** (18-100)
- **Email ID** (valid format)
- **District**
- **City**
- **Pincode** (6 digits)

### Service Selection (At least one required)
- ☀️ **Solar Installation**
- 🔧 **Fabrication Enquiry**

### Solar Installation Fields (Shown when selected)
- Kilowatt Needed
- EB Service Number
- Registered Mobile Number

### Fabrication Fields (Shown when selected)
- Length (in feet)
- Breadth (in feet)
- Material Type (MS/SS/Others)
- Other Material (if "Others" selected)

## 📧 Email Functionality

The enquiry form sends submissions to **iravigreenenergy@gmail.com**.

### Current Status: ✅ Working (Multiple Options)

**Option 1: Mailto (Active by default)**
- Opens user's email client
- Pre-fills all enquiry details
- User sends email manually
- **No setup required** - works immediately!

**Option 2: EmailJS (Optional, better UX)**
- Sends emails automatically
- Better user experience
- No manual email sending needed
- Requires 10-minute setup

### Setup EmailJS (Optional)

For automatic email sending without user interaction:

1. **Read the guide:** `SETUP_GUIDE.md`
2. **Setup time:** ~10 minutes
3. **Cost:** Free (200 emails/month)
4. **Result:** Professional automatic email sending

**Quick Setup:**
1. Create EmailJS account at [emailjs.com](https://www.emailjs.com/)
2. Connect Gmail service
3. Create email template
4. Update `src/app/services/email.ts` with your credentials

**Detailed instructions:** See `SETUP_GUIDE.md` for step-by-step guide.

### Current Behavior

When form is submitted:
- ✅ **With EmailJS configured:** Email sends automatically
- ✅ **Without EmailJS:** Dialog offers to open email client or copy details
- ✅ **On any error:** Fallback options always available

Both methods work perfectly - choose based on your preference!

## 🛠️ Tech Stack

- **Angular** (v20.1.3) - Frontend framework
- **TypeScript** - Programming language
- **SCSS** - Styling
- **Bootstrap 5** - UI components and responsive design
- **Reactive Forms** - Form handling and validation

## 📦 Building for Production

To build the project for production:

```bash
ng build
```

This will compile your project and store the build artifacts in the `dist/` directory.

## Running unit tests

To execute unit tests with the [Karma](https://karma-runner.github.io) test runner, use the following command:

```bash
ng test
```

## Running end-to-end tests

For end-to-end (e2e) testing, run:

```bash
ng e2e
```

Angular CLI does not come with an end-to-end testing framework by default. You can choose one that suits your needs.

## Additional Resources

For more information on using the Angular CLI, including detailed command references, visit the [Angular CLI Overview and Command Reference](https://angular.dev/tools/cli) page.
