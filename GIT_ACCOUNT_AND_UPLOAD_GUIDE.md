# Git Account Creation and Repository Setup Guide

## Step 1: Create a GitHub Account

### 1.1 Sign Up for GitHub
1. Open your web browser and go to: **https://github.com**
2. Click the **"Sign up"** button in the top-right corner
3. Enter your details:
   - **Email address**: Use your business email (iravigreenenergy@gmail.com) or personal email
   - **Password**: Create a strong password (at least 15 characters or 8+ characters with a number and lowercase letter)
   - **Username**: Choose a username (e.g., `iravi-enterprises`, `iravi-greenenergy`, or `iravienterprises`)
   - **Email preferences**: Choose whether you want product updates
4. Complete the CAPTCHA verification (puzzle)
5. Click **"Create account"**
6. Check your email for a verification code
7. Enter the verification code on GitHub
8. Answer a few questions about your usage (you can skip this)
9. Choose the **Free** plan (perfect for open-source projects)

### 1.2 Set Up Your Profile (Optional but Recommended)
1. Click your profile icon in the top-right corner
2. Go to **Settings**
3. Add a profile picture (consider using your company logo)
4. Add your name: "Iravi Enterprises"
5. Add bio: "Solar & Fabrication Work Solutions | Madurai, Tamil Nadu"
6. Add company website once hosted

---

## Step 2: Install Git on Your Computer

### 2.1 Download Git
1. Go to: **https://git-scm.com/download/win**
2. Download the latest version for Windows
3. Run the installer

### 2.2 Install Git (Recommended Settings)
1. Click **Next** through the welcome screens
2. **Select Components**: Keep default selections
3. **Choosing the default editor**: Select your preferred editor or keep default
4. **Adjusting your PATH environment**: Choose **"Git from the command line and also from 3rd-party software"**
5. **Choosing HTTPS transport backend**: Keep default
6. **Configuring line ending conversions**: Choose **"Checkout Windows-style, commit Unix-style"**
7. **Configuring terminal emulator**: Choose **"Use MinTTY"**
8. **Configuring extra options**: Keep defaults
9. Click **Install**
10. Click **Finish**

### 2.3 Verify Git Installation
1. Open **PowerShell** or **Command Prompt**
2. Type: `git --version`
3. You should see something like: `git version 2.x.x`

---

## Step 3: Configure Git with Your Details

Open PowerShell in your project folder (c:\Iravi) and run these commands:

```powershell
# Set your name (will appear in commits)
git config --global user.name "Iravi Enterprises"

# Set your email (use the email you used for GitHub)
git config --global user.email "iravigreenenergy@gmail.com"

# Verify configuration
git config --global --list
```

---

## Step 4: Create a New Repository on GitHub

### 4.1 Create Repository
1. Log in to **GitHub** (https://github.com)
2. Click the **"+"** icon in the top-right corner
3. Select **"New repository"**
4. Fill in the details:
   - **Repository name**: `iravi-enterprises-website` (or `iravi-angular-app`)
   - **Description**: "Modern, responsive website for Iravi Enterprises - Solar & Fabrication Work Solutions"
   - **Visibility**: 
     - Choose **Public** (free, anyone can see but you control who can modify)
     - Or **Private** (only you and invited collaborators can see)
   - **Initialize repository**: 
     - ❌ **DO NOT** check "Add a README file"
     - ❌ **DO NOT** add .gitignore
     - ❌ **DO NOT** choose a license (you can add later)
5. Click **"Create repository"**

### 4.2 Copy Repository URL
After creating, you'll see a page with setup instructions. Copy the repository URL:
- **HTTPS URL**: `https://github.com/YOUR-USERNAME/iravi-enterprises-website.git`
- (Replace `YOUR-USERNAME` with your actual GitHub username)

---

## Step 5: Upload Your Project to GitHub

### 5.1 Open PowerShell in Your Project Folder
1. Open **File Explorer**
2. Navigate to `c:\Iravi`
3. Right-click in the folder (not on a file)
4. Select **"Open in Terminal"** or **"Open PowerShell window here"**

### 5.2 Initialize Git Repository
Run these commands one by one:

```powershell
# Initialize git in your project
git init

# Add all files to staging
git add .

# Create your first commit
git commit -m "Initial commit: Iravi Enterprises Angular application"
```

### 5.3 Connect to GitHub and Push
Replace `YOUR-USERNAME` with your GitHub username:

```powershell
# Add remote repository (replace with your actual URL)
git remote add origin https://github.com/YOUR-USERNAME/iravi-enterprises-website.git

# Rename branch to main (GitHub's default)
git branch -M main

# Push your code to GitHub
git push -u origin main
```

### 5.4 Authentication
When you run `git push`, you'll be asked to authenticate:

**Option A: GitHub Personal Access Token (Recommended)**
1. Go to GitHub → Settings → Developer settings → Personal access tokens → Tokens (classic)
2. Click **"Generate new token"** → **"Generate new token (classic)"**
3. Give it a name: "Iravi Project"
4. Set expiration (30 days, 60 days, or No expiration)
5. Check these scopes:
   - ✅ **repo** (all)
   - ✅ **workflow**
6. Click **"Generate token"**
7. **COPY THE TOKEN IMMEDIATELY** (you won't see it again!)
8. When prompted in PowerShell:
   - Username: Your GitHub username
   - Password: **Paste the token** (not your GitHub password)

**Option B: GitHub Desktop (Easier)**
1. Download **GitHub Desktop**: https://desktop.github.com
2. Install and sign in with your GitHub account
3. Add your local repository: File → Add Local Repository
4. Select `c:\Iravi`
5. Click **"Publish repository"**

---

## Step 6: Verify Upload

1. Go to your GitHub repository in the browser
2. Refresh the page
3. You should see all your project files!

---

## Step 7: Future Updates

Whenever you make changes to your code, update GitHub:

```powershell
# Check what files changed
git status

# Add all changed files
git add .

# Commit with a message describing changes
git commit -m "Your change description"

# Push to GitHub
git push
```

---

## Common Issues and Solutions

### Issue: Git command not recognized
**Solution**: Restart PowerShell after installing Git, or restart your computer

### Issue: Permission denied (publickey)
**Solution**: Use HTTPS URL instead of SSH, or set up SSH keys

### Issue: Authentication failed
**Solution**: Use a Personal Access Token instead of your password

### Issue: Files too large
**Solution**: GitHub has a 100MB file limit. Check if you have large files in node_modules (should be in .gitignore)

---

## Best Practices

1. ✅ **Commit often** with clear messages
2. ✅ **Pull before push** if working with others: `git pull`
3. ✅ **Use .gitignore** to exclude node_modules, dist, .env files
4. ✅ **Write good commit messages**: "Add contact form validation" not "fixed stuff"
5. ✅ **Keep your repository updated** after major changes

---

## Next Steps After Upload

1. ✅ Add a LICENSE file (MIT License is common for open source)
2. ✅ Update README.md with project description and setup instructions
3. ✅ Enable GitHub Pages for free hosting (if desired)
4. ✅ Add repository link to your hosted website
5. ✅ Share your GitHub profile on LinkedIn/social media

---

## Quick Reference Commands

```powershell
# Check status
git status

# Add files
git add .                    # Add all files
git add filename.ts          # Add specific file

# Commit
git commit -m "Your message"

# Push to GitHub
git push

# Pull from GitHub
git pull

# View commit history
git log --oneline

# Create new branch
git checkout -b feature-name

# Switch branches
git checkout main
```

---

## Need Help?

- **GitHub Docs**: https://docs.github.com
- **Git Documentation**: https://git-scm.com/doc
- **GitHub Support**: https://support.github.com

---

## Your Project Details

- **Project Name**: Iravi Enterprises Website
- **Location**: c:\Iravi
- **Type**: Angular Application
- **Purpose**: Business website for solar and fabrication work

**Recommended Repository Name**: `iravi-enterprises-website`
**Recommended Description**: "Modern, responsive Angular website for Iravi Enterprises - Solar & Fabrication Work Solutions in Madurai, Tamil Nadu"

---

Good luck with your GitHub setup! 🚀
