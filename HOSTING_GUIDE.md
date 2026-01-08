# Free Hosting & Domain Guide for Iravi Enterprises

## Date: January 8, 2026

---

## 🚀 Best Free Hosting Options (with Free Domains)

### Option 1: **Vercel** (Recommended ⭐)

**Why Choose Vercel:**
- ✅ Free forever for personal/commercial projects
- ✅ Free subdomain: `iravi-enterprises.vercel.app`
- ✅ Perfect for Angular applications
- ✅ Automatic HTTPS/SSL
- ✅ Global CDN (fast worldwide)
- ✅ Automatic deployments from GitHub
- ✅ Zero configuration needed
- ✅ Excellent performance

**Free Domain**: `your-project-name.vercel.app`

**Steps to Deploy:**

1. **Create GitHub Repository**
   ```powershell
   # In your project folder
   git init
   git add .
   git commit -m "Initial commit"
   git branch -M main
   ```

2. **Push to GitHub**
   - Go to https://github.com/new
   - Create new repository: `iravi-enterprises`
   - Copy the commands and run:
   ```powershell
   git remote add origin https://github.com/YOUR_USERNAME/iravi-enterprises.git
   git push -u origin main
   ```

3. **Deploy to Vercel**
   - Go to https://vercel.com
   - Click "Sign Up" (use GitHub account)
   - Click "New Project"
   - Import your `iravi-enterprises` repository
   - Framework: Auto-detected (Angular)
   - Click "Deploy"
   - Done! Your site is live at `iravi-enterprises.vercel.app`

**Custom Domain (Optional):**
- You can add your own domain later (like `iravigreenenergy.com`)

---

### Option 2: **Netlify**

**Why Choose Netlify:**
- ✅ Free tier forever
- ✅ Free subdomain: `iravi-enterprises.netlify.app`
- ✅ Easy deployment
- ✅ Automatic HTTPS
- ✅ Form handling (great for contact forms)
- ✅ Git-based deployment

**Free Domain**: `your-site-name.netlify.app`

**Steps to Deploy:**

1. **Build your project**
   ```powershell
   npm run build
   ```

2. **Deploy to Netlify**
   - Go to https://netlify.com
   - Sign up with GitHub
   - Click "Add new site" → "Import an existing project"
   - Connect GitHub repository
   - Build command: `npm run build`
   - Publish directory: `dist/iravi-enterprises/browser`
   - Click "Deploy site"
   - Your site is live!

3. **Custom Subdomain**
   - Go to Site settings → Domain management
   - Change site name to `iravi-enterprises`
   - Your URL: `iravi-enterprises.netlify.app`

---

### Option 3: **Firebase Hosting** (Google)

**Why Choose Firebase:**
- ✅ Free tier (10 GB storage, 360 MB/day transfer)
- ✅ Free subdomain: `iravi-enterprises.web.app`
- ✅ Google's infrastructure
- ✅ Fast and reliable
- ✅ Easy to set up
- ✅ Good for future expansion

**Free Domains**: 
- `your-project.web.app`
- `your-project.firebaseapp.com`

**Steps to Deploy:**

1. **Install Firebase CLI**
   ```powershell
   npm install -g firebase-tools
   ```

2. **Login to Firebase**
   ```powershell
   firebase login
   ```

3. **Initialize Firebase**
   ```powershell
   firebase init hosting
   ```
   - Select "Create a new project"
   - Name: `iravi-enterprises`
   - Public directory: `dist/iravi-enterprises/browser`
   - Configure as single-page app: Yes
   - Set up automatic builds: No (for now)

4. **Build and Deploy**
   ```powershell
   npm run build
   firebase deploy
   ```

5. **Your site is live!**
   - URL: `iravi-enterprises.web.app`
   - Alt URL: `iravi-enterprises.firebaseapp.com`

---

### Option 4: **GitHub Pages**

**Why Choose GitHub Pages:**
- ✅ Completely free
- ✅ Free subdomain: `username.github.io/iravi-enterprises`
- ✅ Good for static sites
- ✅ Integrated with GitHub

**Free Domain**: `yourusername.github.io/project-name`

**Steps to Deploy:**

1. **Install Angular CLI gh-pages**
   ```powershell
   npm install -g angular-cli-ghpages
   ```

2. **Build for production**
   ```powershell
   ng build --configuration production --base-href "/iravi-enterprises/"
   ```

3. **Deploy**
   ```powershell
   npx angular-cli-ghpages --dir=dist/iravi-enterprises/browser
   ```

4. **Your site is live!**
   - URL: `https://yourusername.github.io/iravi-enterprises/`

**Note**: GitHub Pages may have routing issues with Angular. Use Vercel or Netlify for better results.

---

### Option 5: **Render**

**Why Choose Render:**
- ✅ Free tier available
- ✅ Free subdomain: `iravi-enterprises.onrender.com`
- ✅ Easy deployment
- ✅ Automatic HTTPS

**Free Domain**: `your-app.onrender.com`

**Steps:**
1. Go to https://render.com
2. Sign up with GitHub
3. New → Static Site
4. Connect repository
5. Build command: `npm run build`
6. Publish directory: `dist/iravi-enterprises/browser`
7. Deploy!

---

## 🏆 Recommendation Matrix

| Feature | Vercel | Netlify | Firebase | GitHub Pages | Render |
|---------|--------|---------|----------|--------------|--------|
| **Ease of Setup** | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐ | ⭐⭐⭐ | ⭐⭐⭐⭐ |
| **Angular Support** | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ | ⭐⭐⭐ | ⭐⭐⭐⭐ |
| **Performance** | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐ | ⭐⭐⭐⭐ |
| **Free Forever** | ✅ Yes | ✅ Yes | ✅ Yes* | ✅ Yes | ✅ Yes* |
| **Custom Domain** | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes | ✅ Yes |
| **Auto Deploy** | ✅ Yes | ✅ Yes | ⚠️ Manual | ✅ Yes | ✅ Yes |
| **Analytics** | ✅ Yes | ✅ Yes | ✅ Yes | ❌ No | ⚠️ Limited |

*With usage limits

---

## 🎯 Best Choice for Iravi Enterprises

### **Winner: Vercel** ⭐⭐⭐⭐⭐

**Your URL will be**: `iravi-enterprises.vercel.app`

**Why:**
1. Perfect for Angular/React/Next.js
2. Fastest deployment
3. Best performance
4. Automatic deployments from GitHub
5. Free forever
6. Professional subdomain
7. No limitations for commercial use

---

## 📋 Quick Start Guide - Deploy to Vercel

### Step 1: Prepare Your Project

```powershell
# Make sure your project builds successfully
npm run build
```

### Step 2: Push to GitHub

```powershell
# Initialize git (if not done)
git init

# Add all files
git add .

# Commit
git commit -m "Ready for deployment"

# Create repository on GitHub.com
# Then push:
git remote add origin https://github.com/YOUR_USERNAME/iravi-enterprises.git
git branch -M main
git push -u origin main
```

### Step 3: Deploy to Vercel

1. Go to: https://vercel.com
2. Click **"Sign Up"** → Use GitHub
3. Click **"New Project"**
4. Import **`iravi-enterprises`** repository
5. Configure:
   - Framework Preset: **Angular**
   - Root Directory: `./`
   - Build Command: `npm run build` (auto-detected)
   - Output Directory: `dist/iravi-enterprises/browser` (auto-detected)
6. Click **"Deploy"**
7. Wait 2-3 minutes ⏳
8. **Done!** 🎉

**Your site is now live at:**
```
https://iravi-enterprises.vercel.app
```

---

## 🌐 Getting a Free Custom Domain

While the free subdomains are great, here are options for custom domains:

### Free Custom Domain Options:

#### 1. **Freenom** (Free .tk, .ml, .ga, .cf, .gq domains)
- Website: https://www.freenom.com
- Duration: Free for 12 months, renewable
- Example: `iravigreenenergy.tk`

**Steps:**
1. Search for available domain
2. Select 12 months free
3. Complete checkout (no payment needed)
4. Connect to Vercel/Netlify

#### 2. **InfinityFree** (Free subdomain)
- Website: https://infinityfree.net
- Free hosting + free subdomain
- Example: `iravigreenenergy.rf.gd`

#### 3. **Buy Affordable Domain** (Recommended for Business)
- **Namecheap**: ~₹500-800/year (.com)
- **GoDaddy**: ~₹600-1000/year (.com)
- **Google Domains**: ~₹1000/year (.com)

**Recommended for professional business:**
- `iravigreenenergy.com`
- `iravi.in`
- `iravienterprises.com`

---

## 🔧 Connecting Custom Domain to Vercel

### If you get a custom domain:

1. **In Vercel Dashboard:**
   - Go to your project
   - Settings → Domains
   - Click "Add"
   - Enter your domain: `iravigreenenergy.com`

2. **In Your Domain Provider:**
   - Add DNS records:
   ```
   Type: A
   Name: @
   Value: 76.76.21.21
   
   Type: CNAME
   Name: www
   Value: cname.vercel-dns.com
   ```

3. **Wait for DNS propagation** (5-30 minutes)
4. **Done!** Your site is live on custom domain

---

## 📊 Free Domain Comparison

| Domain Type | Example | Professional | SEO | Recommended |
|-------------|---------|--------------|-----|-------------|
| Vercel subdomain | `iravi.vercel.app` | ⭐⭐⭐⭐ | ⭐⭐⭐⭐ | ✅ Start here |
| Netlify subdomain | `iravi.netlify.app` | ⭐⭐⭐⭐ | ⭐⭐⭐⭐ | ✅ Good option |
| Firebase subdomain | `iravi.web.app` | ⭐⭐⭐⭐ | ⭐⭐⭐⭐ | ✅ Good option |
| Freenom (.tk/.ml) | `iravi.tk` | ⭐⭐ | ⭐⭐ | ⚠️ Not recommended |
| Paid .com domain | `iravigreenenergy.com` | ⭐⭐⭐⭐⭐ | ⭐⭐⭐⭐⭐ | ⭐ Best for business |

---

## 🎓 SEO & Google Search

### Making Your Site Appear on Google:

#### 1. **Submit to Google Search Console**
- Go to: https://search.google.com/search-console
- Add your Vercel URL: `iravi-enterprises.vercel.app`
- Verify ownership
- Submit sitemap

#### 2. **Create Sitemap**
Your Angular app needs a sitemap. Add this to your `public` folder:

**File: `public/sitemap.xml`**
```xml
<?xml version="1.0" encoding="UTF-8"?>
<urlset xmlns="http://www.sitemaps.org/schemas/sitemap/0.9">
  <url>
    <loc>https://iravi-enterprises.vercel.app/</loc>
    <priority>1.0</priority>
    <changefreq>daily</changefreq>
  </url>
  <url>
    <loc>https://iravi-enterprises.vercel.app/home</loc>
    <priority>0.9</priority>
    <changefreq>weekly</changefreq>
  </url>
  <url>
    <loc>https://iravi-enterprises.vercel.app/about</loc>
    <priority>0.8</priority>
    <changefreq>monthly</changefreq>
  </url>
  <url>
    <loc>https://iravi-enterprises.vercel.app/contact</loc>
    <priority>0.9</priority>
    <changefreq>monthly</changefreq>
  </url>
  <url>
    <loc>https://iravi-enterprises.vercel.app/enquiry</loc>
    <priority>0.9</priority>
    <changefreq>monthly</changefreq>
  </url>
</urlset>
```

#### 3. **Create robots.txt**

**File: `public/robots.txt`**
```
User-agent: *
Allow: /
Sitemap: https://iravi-enterprises.vercel.app/sitemap.xml
```

#### 4. **Add Meta Tags for SEO**

Update `src/index.html`:
```html
<head>
  <meta charset="utf-8">
  <title>Iravi Enterprises - Solar & Fabrication Services | Madurai</title>
  <base href="/">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <!-- SEO Meta Tags -->
  <meta name="description" content="Iravi Green Energy provides solar panel installation and professional fabrication services in Usilampatti, Madurai. Get free quotes for solar and fabrication work.">
  <meta name="keywords" content="solar panels madurai, solar installation madurai, fabrication work madurai, Iravi Green Energy, solar energy usilampatti, metal fabrication">
  <meta name="author" content="Iravi Enterprises">
  
  <!-- Open Graph / Facebook -->
  <meta property="og:type" content="website">
  <meta property="og:url" content="https://iravi-enterprises.vercel.app/">
  <meta property="og:title" content="Iravi Enterprises - Solar & Fabrication Services">
  <meta property="og:description" content="Leading provider of solar energy solutions and fabrication services in Madurai">
  <meta property="og:image" content="https://iravi-enterprises.vercel.app/assets/images/logo finished2 (1).jpg">
  
  <!-- Twitter -->
  <meta property="twitter:card" content="summary_large_image">
  <meta property="twitter:url" content="https://iravi-enterprises.vercel.app/">
  <meta property="twitter:title" content="Iravi Enterprises - Solar & Fabrication Services">
  <meta property="twitter:description" content="Leading provider of solar energy solutions and fabrication services in Madurai">
  
  <link rel="icon" type="image/x-icon" href="favicon.ico">
</head>
```

---

## 📱 Complete Deployment Checklist

### Before Deployment:
- [ ] Test locally: `ng serve`
- [ ] Build successfully: `npm run build`
- [ ] Check all pages load correctly
- [ ] Verify contact form works
- [ ] Test EmailJS integration
- [ ] Verify all images load
- [ ] Check responsive design
- [ ] Test on mobile

### During Deployment:
- [ ] Create GitHub repository
- [ ] Push code to GitHub
- [ ] Sign up for Vercel
- [ ] Import repository
- [ ] Configure build settings
- [ ] Deploy site

### After Deployment:
- [ ] Test live site
- [ ] Check all pages work
- [ ] Test contact form on live site
- [ ] Verify EmailJS works
- [ ] Submit to Google Search Console
- [ ] Add sitemap
- [ ] Share URL on social media
- [ ] Update business cards with URL
- [ ] Add URL to email signature

---

## 💡 Pro Tips

1. **Use Vercel** - Best for Angular, free forever
2. **Custom Domain** - Invest in a .com domain for professional look (₹500-1000/year)
3. **SSL Certificate** - All platforms provide free HTTPS
4. **Analytics** - Use Google Analytics (free) to track visitors
5. **Performance** - Vercel and Netlify have best performance
6. **Automatic Deployments** - Every git push automatically updates your site

---

## 🚀 Your Free URL Options

Based on your project name "Iravi", here are available free URLs:

1. `iravi-enterprises.vercel.app` ⭐ Recommended
2. `iravi-green-energy.vercel.app`
3. `iravi.netlify.app`
4. `iravigreenenergy.web.app`
5. `iravi-solar.vercel.app`

---

## 📞 Support & Help

If you need help deploying:
- Vercel Docs: https://vercel.com/docs
- Netlify Docs: https://docs.netlify.com
- Firebase Docs: https://firebase.google.com/docs/hosting
- GitHub: https://docs.github.com/en/pages

---

## ✅ Summary

**Best Free Option**: Deploy to **Vercel**
- **URL**: `iravi-enterprises.vercel.app`
- **Cost**: Free forever
- **Time**: 10 minutes to deploy
- **Performance**: Excellent
- **Google Search**: Yes, will be indexed

**Next Level**: Buy custom domain
- **Domain**: `iravigreenenergy.com`
- **Cost**: ~₹500-1000/year
- **More Professional**: Yes
- **Better SEO**: Yes

---

Would you like me to guide you through deploying to Vercel step-by-step?
