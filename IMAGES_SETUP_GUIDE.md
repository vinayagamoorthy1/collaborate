# 📸 Images Setup Guide - Iraivi Enterprises

## 📁 Image Folder Structure

Your images are stored in: **`public/assets/images/`**

```
c:\Iravi\
├── public/
│   └── assets/
│       └── images/          ← Put your images here
│           ├── logo.png
│           ├── solar-banner.jpg
│           ├── fabrication-banner.jpg
│           ├── about-us.jpg
│           ├── service-solar.jpg
│           ├── service-fabrication.jpg
│           └── ... (your images)
```

---

## 🖼️ How to Add Images

### Step 1: Add Your Images
Copy your image files to: `c:\Iravi\public\assets\images\`

**Recommended images for Iraivi Enterprises:**
- `logo.png` - Company logo (for navbar)
- `hero-banner.jpg` - Home page banner
- `solar-panel.jpg` - Solar installation image
- `fabrication-work.jpg` - Fabrication work image
- `about-us.jpg` - About page image
- `contact-us.jpg` - Contact page image

---

## 💻 How to Use Images in Components

### Method 1: In HTML Template

```html
<!-- Logo in Navbar -->
<img src="assets/images/logo.png" alt="Iraivi Enterprises Logo" class="logo">

<!-- Banner Image -->
<img src="assets/images/hero-banner.jpg" alt="Solar & Fabrication" class="banner-img">

<!-- Service Cards -->
<div class="service-card">
  <img src="assets/images/solar-panel.jpg" alt="Solar Installation">
  <h3>Solar Installation</h3>
</div>
```

### Method 2: In SCSS/CSS (Background Images)

```scss
.hero-section {
  background-image: url('/assets/images/hero-banner.jpg');
  background-size: cover;
  background-position: center;
}

.about-banner {
  background: url('/assets/images/about-us.jpg') no-repeat center;
  background-size: cover;
}
```

---

## 🎨 Example: Update Components with Images

### 1. Update Navbar with Logo

**File:** `src/app/components/navbar/navbar.html`

```html
<nav class="navbar navbar-expand-lg navbar-light bg-white shadow-sm">
  <div class="container-fluid">
    <!-- Logo -->
    <a class="navbar-brand" routerLink="/">
      <img src="assets/images/logo.png" alt="Iraivi Enterprises" height="50">
      <span class="brand-text">Iraivi Enterprises</span>
    </a>
    <!-- ...rest of navbar... -->
  </div>
</nav>
```

### 2. Update Home Page with Banner

**File:** `src/app/pages/home/home.html`

```html
<div class="home-container">
  <!-- Hero Section with Background Image -->
  <section class="hero-section">
    <div class="container">
      <div class="row align-items-center">
        <div class="col-lg-6">
          <h1>Iraivi Enterprises</h1>
          <p>Leading Provider of Solar & Fabrication Solutions</p>
          <a routerLink="/enquiry" class="btn btn-primary">Get Started</a>
        </div>
        <div class="col-lg-6">
          <img src="assets/images/solar-panel.jpg" alt="Solar Installation" class="img-fluid rounded">
        </div>
      </div>
    </div>
  </section>

  <!-- Services Section -->
  <section class="services-section">
    <div class="container">
      <h2>Our Services</h2>
      <div class="row">
        <div class="col-md-6">
          <div class="service-card">
            <img src="assets/images/solar-panel.jpg" alt="Solar Installation">
            <h3>Solar Installation</h3>
            <p>Professional solar energy solutions</p>
          </div>
        </div>
        <div class="col-md-6">
          <div class="service-card">
            <img src="assets/images/fabrication-work.jpg" alt="Fabrication">
            <h3>Fabrication Work</h3>
            <p>Quality metalwork and fabrication</p>
          </div>
        </div>
      </div>
    </div>
  </section>
</div>
```

### 3. Add SCSS Styles

**File:** `src/app/pages/home/home.scss`

```scss
.hero-section {
  min-height: 500px;
  background: linear-gradient(135deg, #FF6B35 0%, #F7931E 100%);
  padding: 80px 0;
  color: white;

  h1 {
    font-size: 3rem;
    font-weight: bold;
    margin-bottom: 20px;
  }

  img {
    border-radius: 15px;
    box-shadow: 0 10px 30px rgba(0,0,0,0.3);
  }
}

.services-section {
  padding: 60px 0;

  .service-card {
    background: white;
    border-radius: 15px;
    padding: 20px;
    box-shadow: 0 4px 6px rgba(0,0,0,0.1);
    transition: transform 0.3s;
    margin-bottom: 20px;

    &:hover {
      transform: translateY(-10px);
      box-shadow: 0 8px 15px rgba(0,0,0,0.2);
    }

    img {
      width: 100%;
      height: 200px;
      object-fit: cover;
      border-radius: 10px;
      margin-bottom: 15px;
    }

    h3 {
      color: #FF6B35;
      margin: 15px 0 10px;
    }
  }
}
```

---

## 📊 Image Best Practices

### Recommended Image Sizes:
- **Logo**: 200x50px (or maintain ratio)
- **Hero Banner**: 1920x600px
- **Service Cards**: 600x400px
- **About/Contact**: 1200x800px
- **Icons**: 100x100px

### Image Formats:
- **Photos**: `.jpg` or `.webp` (smaller file size)
- **Graphics/Logo**: `.png` (transparent background)
- **Icons**: `.svg` (scalable, best quality)

### Optimization Tips:
- Compress images before adding (use tools like TinyPNG)
- Keep file sizes under 500KB for fast loading
- Use descriptive alt text for accessibility
- Consider lazy loading for better performance

---

## 🚀 Quick Implementation

I'll create updated component files with image placeholders for you:

### Updated Navbar Component
### Updated Home Component
### Updated About Component

Would you like me to:
1. ✅ Create image placeholder files
2. ✅ Update all components to use images
3. ✅ Add responsive image styles
4. ✅ Show you where to place your images

---

## 📝 Sample Images You Need

Copy these to `public/assets/images/`:

1. **logo.png** - Your company logo
2. **hero-banner.jpg** - Main homepage banner
3. **solar-panel.jpg** - Solar installation photo
4. **fabrication-work.jpg** - Fabrication work photo
5. **about-us.jpg** - Team or company photo
6. **contact-banner.jpg** - Contact page image

---

## 🎯 Next Steps

1. **Add your images** to `public/assets/images/`
2. **Tell me which components** you want to update with images
3. **I'll update the code** to include your images
4. **Test and see** beautiful images in your app!

Which component do you want to add images to first? 
- Home page? 
- Navbar logo?
- About page?
- All components?

Let me know and I'll update them! 🎨
