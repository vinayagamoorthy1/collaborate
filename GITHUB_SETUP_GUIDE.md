# Complete GitHub Setup & Upload Guide - Step by Step

## Date: January 8, 2026

---

## 📝 Part 1: Create GitHub Account (5 minutes)

### Step 1: Go to GitHub Website
1. Open your browser
2. Go to: **https://github.com**
3. You'll see the GitHub homepage

### Step 2: Sign Up
1. Click the **"Sign up"** button (top right corner)
2. Enter your details:
   ```
   Email: Your email (e.g., iravigreenenergy@gmail.com)
   Password: Create a strong password
   Username: Choose a username (e.g., iravi-green-energy or iravienterprises)
   ```
3. Click **"Continue"**

### Step 3: Verify Your Email
1. Check your email inbox
2. Find email from GitHub
3. Click the verification link
4. Your account is created! ✅

### Step 4: Choose Free Plan
1. Select **"Free"** plan (it's enough for your project)
2. Click **"Continue"**
3. Skip the survey or answer it
4. You're now on GitHub! 🎉

---

## 💻 Part 2: Install Git on Your Computer

### Check if Git is Already Installed:
```powershell
git --version
```

**If you see a version number** (e.g., `git version 2.40.0`):
- ✅ Git is already installed! Skip to Part 3

**If you see an error**:
- ❌ Need to install Git (continue below)

### Install Git on Windows:

1. **Download Git**
   - Go to: https://git-scm.com/download/win
   - Download will start automatically
   - File name: `Git-2.xx.x-64-bit.exe`

2. **Install Git**
   - Double-click the downloaded file
   - Click **"Next"** through all steps
   - Keep default settings
   - Click **"Install"**
   - Click **"Finish"**

3. **Verify Installation**
   ```powershell
   git --version
   ```
   - You should see: `git version 2.xx.x`
   - ✅ Git is installed!

---

## 🔧 Part 3: Configure Git (First Time Only)

Open PowerShell in your project folder and run these commands:

```powershell
# Set your name (will appear on commits)
git config --global user.name "Iravi Green Energy"

# Set your email (use your GitHub email)
git config --global user.email "iravigreenenergy@gmail.com"

# Verify settings
git config --list
```

✅ Git is now configured with your details!

---

## 📦 Part 4: Prepare Your Project for GitHub

### Step 1: Open PowerShell in Project Folder

**Method 1: From File Explorer**
1. Open File Explorer
2. Navigate to `C:\Iravi`
3. Hold **Shift** + **Right-click** in empty space
4. Select **"Open PowerShell window here"**

**Method 2: From PowerShell**
```powershell
cd C:\Iravi
```

### Step 2: Create .gitignore File

This tells Git which files NOT to upload (like node_modules):

```powershell
# Create .gitignore file
@"
# Dependencies
node_modules/
npm-debug.log*
yarn-debug.log*
yarn-error.log*

# Build output
dist/
build/
.angular/

# Environment files
.env
.env.local
.env.development.local
.env.test.local
.env.production.local

# IDE
.vscode/
.idea/
*.swp
*.swo
*~
.DS_Store

# Testing
coverage/
.nyc_output/

# Misc
*.log
.cache/
.temp/
"@ | Out-File -FilePath .gitignore -Encoding UTF8
```

✅ .gitignore file created!

### Step 3: Initialize Git Repository

```powershell
# Initialize Git in your project
git init
```

**You should see**: `Initialized empty Git repository in C:/Iravi/.git/`

✅ Git repository initialized!

---

## 🚀 Part 5: Upload to GitHub

### Step 1: Stage All Files

```powershell
# Add all files to staging
git add .
```

This prepares all your files for upload.

### Step 2: Create First Commit

```powershell
# Create your first commit
git commit -m "Initial commit - Iravi Green Energy website"
```

**You should see**: List of files added ✅

### Step 3: Rename Branch to 'main'

```powershell
# Rename master to main (GitHub standard)
git branch -M main
```

### Step 4: Create Repository on GitHub

1. **Go to GitHub**: https://github.com
2. **Log in** with your account
3. Click **"+"** icon (top right)
4. Click **"New repository"**
5. Fill in details:
   ```
   Repository name: iravi-green-energy
   Description: Solar panel installation and fabrication services website
   Visibility: Public (so it can be found on Google)
   ```
6. **DO NOT** check "Initialize with README" (your project already has files)
7. Click **"Create repository"**

### Step 5: Connect Your Project to GitHub

After creating the repository, GitHub will show you commands. Use these:

```powershell
# Connect to GitHub (replace YOUR_USERNAME with your GitHub username)
git remote add origin https://github.com/YOUR_USERNAME/iravi-green-energy.git

# Example:
# git remote add origin https://github.com/iravi-green-energy/iravi-green-energy.git
```

### Step 6: Push to GitHub

```powershell
# Upload your code to GitHub
git push -u origin main
```

**You'll be asked for credentials:**
1. **Username**: Your GitHub username
2. **Password**: Your GitHub password OR Personal Access Token

**If password doesn't work**, you need a Personal Access Token:

---

## 🔑 Part 6: Create Personal Access Token (If Needed)

### Step 1: Generate Token
1. Go to: https://github.com/settings/tokens
2. Click **"Generate new token"** → **"Generate new token (classic)"**
3. Give it a name: `Iravi Project`
4. Select scopes:
   - ✅ Check **"repo"** (all sub-options)
5. Click **"Generate token"**
6. **IMPORTANT**: Copy the token (starts with `ghp_...`)
7. Save it somewhere safe (you won't see it again!)

### Step 2: Push Again with Token
```powershell
# Push to GitHub (use token as password)
git push -u origin main
```

When asked:
- **Username**: Your GitHub username
- **Password**: Paste your token (ghp_xxx...)

✅ **Your code is now on GitHub!** 🎉

---

## ✅ Part 7: Verify Upload

1. Go to: `https://github.com/YOUR_USERNAME/iravi-green-energy`
2. You should see all your files!
3. ✅ Success!

---

## 🔄 Part 8: Update Code in Future

When you make changes and want to upload:

```powershell
# 1. Add changes
git add .

# 2. Commit with message
git commit -m "Updated contact information"

# 3. Push to GitHub
git push
```

---

## 📋 Complete Command Reference

### For First Time Upload:
```powershell
# 1. Navigate to project
cd C:\Iravi

# 2. Configure Git (first time only)
git config --global user.name "Iravi Green Energy"
git config --global user.email "iravigreenenergy@gmail.com"

# 3. Initialize repository
git init

# 4. Add all files
git add .

# 5. Create first commit
git commit -m "Initial commit - Iravi Green Energy website"

# 6. Rename branch
git branch -M main

# 7. Connect to GitHub (replace YOUR_USERNAME)
git remote add origin https://github.com/YOUR_USERNAME/iravi-green-energy.git

# 8. Push to GitHub
git push -u origin main
```

### For Future Updates:
```powershell
cd C:\Iravi
git add .
git commit -m "Your update message"
git push
```

---

## 🎯 Quick Checklist

- [ ] Create GitHub account at github.com
- [ ] Verify email
- [ ] Install Git on Windows
- [ ] Configure Git with name and email
- [ ] Navigate to project folder (C:\Iravi)
- [ ] Create .gitignore file
- [ ] Initialize Git (`git init`)
- [ ] Add files (`git add .`)
- [ ] Commit files (`git commit -m "Initial commit"`)
- [ ] Create repository on GitHub
- [ ] Connect to GitHub (`git remote add origin ...`)
- [ ] Push to GitHub (`git push -u origin main`)
- [ ] Verify files on GitHub website

---

## 🆘 Common Issues & Solutions

### Issue 1: "git is not recognized"
**Solution**: Restart PowerShell after installing Git

### Issue 2: "Permission denied"
**Solution**: Use Personal Access Token instead of password

### Issue 3: "Repository not found"
**Solution**: Check GitHub username and repository name are correct

### Issue 4: "fatal: not a git repository"
**Solution**: Make sure you're in the correct folder (`cd C:\Iravi`)

### Issue 5: Large files (node_modules)
**Solution**: Make sure .gitignore file exists and contains `node_modules/`

---

## 🎥 Visual Guide

### Your GitHub Repository URL will be:
```
https://github.com/YOUR_USERNAME/iravi-green-energy
```

**Example**: If your username is `iravi-enterprises`, then:
```
https://github.com/iravi-enterprises/iravi-green-energy
```

---

## 🚀 After GitHub Upload - Next Steps

Once your code is on GitHub:

1. **Deploy to Vercel/Cloudflare**
   - Go to https://vercel.com or https://pages.cloudflare.com
   - Sign up with GitHub
   - Import your `iravi-green-energy` repository
   - Deploy!
   - Your site will be live in 3-5 minutes

2. **Share Your GitHub**
   - Add to your resume/portfolio
   - Share with developers
   - Show to clients

---

## 📞 Need Help?

If you get stuck at any step:
1. Take a screenshot of the error
2. Note which step you're on
3. Let me know and I'll help!

---

## ✅ Success Indicators

You'll know it worked when:
- ✅ You can see your files on `github.com/YOUR_USERNAME/iravi-green-energy`
- ✅ The file count matches your project
- ✅ No `node_modules` folder (excluded by .gitignore)
- ✅ All your code files are visible

---

Ready to start? Just follow the steps in order! 🎉

**Start with**: Creating your GitHub account at https://github.com
