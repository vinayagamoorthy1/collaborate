# Visual Step-by-Step Guide: Creating GitHub Account & Uploading Project

## Part 1: Create GitHub Account

### Step 1: Go to GitHub
📍 **Action**: Open browser and go to **https://github.com**

**What you'll see**: 
- GitHub homepage with "Sign up" button in top-right corner
- "Where the world builds software" heading

---

### Step 2: Start Sign Up
📍 **Action**: Click the green **"Sign up"** button

**What you'll see**:
- Email entry field
- "Welcome to GitHub!" or similar greeting

---

### Step 3: Enter Your Email
📍 **Action**: Type your email address
- Recommended: `iravigreenenergy@gmail.com` (your business email)
- Or use personal email

**Then**: Click "Continue" or press Enter

---

### Step 4: Create Password
📍 **Action**: Enter a strong password
- At least 15 characters, OR
- At least 8 characters with a number and lowercase letter

**Then**: Click "Continue"

---

### Step 5: Choose Username
📍 **Action**: Pick a unique username
- Suggestions:
  - `iravi-enterprises`
  - `iravi-greenenergy`
  - `iravienterprises`
  - `iravi-solar`

**Then**: Click "Continue"

---

### Step 6: Email Preferences
📍 **Action**: Choose whether you want GitHub updates
- Type "y" for yes or "n" for no

**Then**: Click "Continue"

---

### Step 7: Verify You're Human
📍 **Action**: Complete the CAPTCHA puzzle
- Follow the instructions (usually clicking images or solving puzzle)

**Then**: Click "Create account"

---

### Step 8: Verify Email
📍 **Action**: 
1. Check your email inbox
2. Open email from GitHub
3. Copy the 6-digit verification code
4. Return to GitHub and enter the code

---

### Step 9: Personalization (Optional)
📍 **Action**: Answer questions or click "Skip personalization"
- How many team members?
- Student or teacher?
- What do you want to use GitHub for?

**Recommendation**: You can skip this step

---

### Step 10: Choose Plan
📍 **Action**: Select the **"Free"** plan
- Perfect for your needs
- Unlimited public repositories
- Unlimited private repositories

**Then**: Click "Continue for free"

---

### 🎉 Success! You now have a GitHub account!

---

## Part 2: Install Git on Windows

### Step 1: Download Git
📍 **Action**: Go to **https://git-scm.com/download/win**

**What happens**: 
- Download starts automatically
- File: `Git-2.xx.x-64-bit.exe` (around 50 MB)

---

### Step 2: Run Installer
📍 **Action**: 
1. Open Downloads folder
2. Double-click the Git installer file
3. If Windows asks "Do you want to allow this app?", click **Yes**

---

### Step 3: Installation Wizard
📍 **Action**: Follow these steps:

**Screen 1 - License**: Click "Next"

**Screen 2 - Destination**: Keep default (`C:\Program Files\Git`), click "Next"

**Screen 3 - Components**: Keep all defaults checked, click "Next"

**Screen 4 - Start Menu**: Keep default, click "Next"

**Screen 5 - Default Editor**: Choose "Use Visual Studio Code" or keep default, click "Next"

**Screen 6 - Initial Branch**: Keep "Let Git decide", click "Next"

**Screen 7 - PATH Environment**: Keep "Git from the command line and also from 3rd-party software", click "Next"

**Screen 8 - SSH**: Keep default, click "Next"

**Screen 9 - HTTPS**: Keep default "Use the OpenSSL library", click "Next"

**Screen 10 - Line Endings**: Keep "Checkout Windows-style, commit Unix-style", click "Next"

**Screen 11 - Terminal**: Keep "Use MinTTY", click "Next"

**Screen 12 - Git Pull**: Keep default, click "Next"

**Screen 13 - Credential Helper**: Keep default, click "Next"

**Screen 14 - Extra Options**: Keep defaults, click "Next"

**Screen 15 - Experimental**: Leave unchecked, click "Install"

---

### Step 4: Wait for Installation
📍 **Action**: Wait 1-2 minutes while Git installs

---

### Step 5: Complete Installation
📍 **Action**: 
- Uncheck "View Release Notes" (optional)
- Click "Finish"

---

### Step 6: Verify Installation
📍 **Action**:
1. Press `Win + X` on keyboard
2. Click "PowerShell" or "Terminal"
3. Type: `git --version`
4. Press Enter

**What you should see**: `git version 2.43.0` (or similar)

✅ **If you see a version number, Git is installed successfully!**

---

## Part 3: Configure Git

### Open PowerShell in Your Project
📍 **Action**:
1. Open File Explorer
2. Navigate to `C:\Iravi`
3. Click in the address bar (where it shows the path)
4. Type `powershell` and press Enter

**What you'll see**: PowerShell opens with prompt showing `C:\Iravi>`

---

### Configure Your Name
📍 **Action**: Type this command and press Enter:

```powershell
git config --global user.name "Iravi Enterprises"
```

**What happens**: No output = success!

---

### Configure Your Email
📍 **Action**: Type this command and press Enter:

```powershell
git config --global user.email "iravigreenenergy@gmail.com"
```

**What happens**: No output = success!

---

### Verify Configuration
📍 **Action**: Type this command and press Enter:

```powershell
git config --global --list
```

**What you should see**:
```
user.name=Iravi Enterprises
user.email=iravigreenenergy@gmail.com
```

✅ **Git is now configured with your details!**

---

## Part 4: Create GitHub Repository

### Step 1: Go to GitHub
📍 **Action**: 
1. Open browser
2. Go to **https://github.com**
3. Make sure you're logged in

---

### Step 2: Create New Repository
📍 **Action**: 
1. Click the **"+"** icon in top-right corner
2. Click **"New repository"**

**What you'll see**: "Create a new repository" page

---

### Step 3: Fill Repository Details
📍 **Action**: Fill in these fields:

**Repository name**: `iravi-enterprises-website`
- Must be lowercase, can use hyphens
- Must be unique to your account

**Description**: `Modern, responsive website for Iravi Enterprises - Solar & Fabrication Work Solutions`

**Visibility**: Choose one:
- ⭕ **Public** (Free, anyone can view but only you can modify)
- ⭕ **Private** (Only you can view and modify)

**Initialize this repository with**:
- ❌ **DO NOT** check "Add a README file"
- ❌ **DO NOT** add .gitignore
- ❌ **DO NOT** choose a license
- Leave all checkboxes UNCHECKED

---

### Step 4: Create Repository
📍 **Action**: Click the green **"Create repository"** button

---

### Step 5: Copy Repository URL
📍 **Action**: 
1. You'll see a "Quick setup" page
2. Make sure **HTTPS** is selected (not SSH)
3. Copy the URL that looks like:
   ```
   https://github.com/YOUR-USERNAME/iravi-enterprises-website.git
   ```
4. **Write it down or keep the browser tab open!**

---

## Part 5: Upload Your Project

### Open PowerShell in Project Folder
📍 **Action**: (If not already open)
1. Open File Explorer
2. Go to `C:\Iravi`
3. Click address bar, type `powershell`, press Enter

**PowerShell prompt should show**: `C:\Iravi>`

---

### Initialize Git Repository
📍 **Action**: Type this command and press Enter:

```powershell
git init
```

**What you should see**: `Initialized empty Git repository in C:/Iravi/.git/`

✅ This creates a hidden `.git` folder in your project

---

### Add All Files
📍 **Action**: Type this command and press Enter:

```powershell
git add .
```

**What you should see**: No output or a list of files being added

✅ This stages all your files for commit (except those in .gitignore)

---

### Create First Commit
📍 **Action**: Type this command and press Enter:

```powershell
git commit -m "Initial commit: Iravi Enterprises Angular application"
```

**What you should see**: Summary of files added, like:
```
[main (root-commit) abc1234] Initial commit: Iravi Enterprises Angular application
 XX files changed, XXX insertions(+)
 create mode 100644 README.md
 create mode 100644 package.json
 ...
```

✅ Your files are now committed locally

---

### Connect to GitHub
📍 **Action**: Type this command (REPLACE with YOUR repository URL):

```powershell
git remote add origin https://github.com/YOUR-USERNAME/iravi-enterprises-website.git
```

**Example**:
```powershell
git remote add origin https://github.com/iravi-enterprises/iravi-enterprises-website.git
```

**What you should see**: No output = success!

---

### Rename Branch to Main
📍 **Action**: Type this command and press Enter:

```powershell
git branch -M main
```

**What you should see**: No output = success!

✅ Your default branch is now named "main" (GitHub's standard)

---

### Push to GitHub
📍 **Action**: Type this command and press Enter:

```powershell
git push -u origin main
```

**What happens**: You'll be asked to authenticate!

---

### Authentication Window
📍 **What you'll see**: A window pops up asking for credentials

**Option A - Sign in with GitHub (Easiest)**:
1. Click "Sign in with your browser"
2. Browser opens → Click "Authorize GitCredentialManager"
3. Return to PowerShell

**Option B - Personal Access Token**:
1. Username: Your GitHub username
2. Password: **Use Personal Access Token** (see next section)

---

### Create Personal Access Token (If Needed)

📍 **Action**:
1. Go to GitHub in browser
2. Click your profile picture (top-right)
3. Click **Settings**
4. Scroll down left sidebar → Click **Developer settings**
5. Click **Personal access tokens** → **Tokens (classic)**
6. Click **"Generate new token"** → **"Generate new token (classic)"**
7. Fill in:
   - **Note**: "Iravi Project"
   - **Expiration**: 90 days (or No expiration)
   - **Scopes**: Check ☑️ **repo** (all sub-items automatically check)
8. Scroll down, click **"Generate token"**
9. **COPY THE TOKEN IMMEDIATELY!** (green text starting with `ghp_...`)
10. Store it safely - you won't see it again!

**Use this token as your password when pushing to GitHub**

---

### Upload Progress
📍 **What you'll see**:
```
Enumerating objects: XXX, done.
Counting objects: 100% (XXX/XXX), done.
Delta compression using up to X threads
Compressing objects: 100% (XXX/XXX), done.
Writing objects: 100% (XXX/XXX), X.XX MiB | X.XX MiB/s, done.
Total XXX (delta XX), reused 0 (delta 0), pack-reused 0
To https://github.com/YOUR-USERNAME/iravi-enterprises-website.git
 * [new branch]      main -> main
Branch 'main' set up to track remote branch 'main' from 'origin'.
```

✅ **Success! Your code is now on GitHub!**

---

## Part 6: Verify Upload

### View Repository on GitHub
📍 **Action**:
1. Go to your repository URL in browser
2. Refresh the page

**What you should see**:
- All your project files and folders
- README.md content displayed at bottom
- Green "Code" button
- Your commit message
- File structure matching your local project

---

### ✅ Verification Checklist
- [ ] `src` folder visible with app, components, pages
- [ ] `public` folder visible with assets, images
- [ ] `package.json` visible
- [ ] `README.md` visible and displaying at bottom
- [ ] `.md` documentation files visible
- [ ] **NO** `node_modules` folder (should be ignored)
- [ ] **NO** `dist` folder (should be ignored)

---

## 🎉 Congratulations!

Your Iravi Enterprises project is now on GitHub!

### What You Can Do Now:
✅ Share your repository link with others  
✅ Deploy to Vercel/Netlify directly from GitHub  
✅ Collaborate with team members  
✅ Track all changes and versions  
✅ Showcase your work  

---

## Future Updates (Simple Steps)

Whenever you make changes to your code:

### In PowerShell (in C:\Iravi):

```powershell
# 1. Check what changed
git status

# 2. Add all changes
git add .

# 3. Commit with message
git commit -m "Description of what you changed"

# 4. Push to GitHub
git push
```

**Examples of commit messages**:
- `"Update contact phone number"`
- `"Add new solar images to carousel"`
- `"Fix enquiry form validation"`
- `"Update EmailJS configuration"`

---

## 📞 Get Help

**Common Commands**:
- `git status` - See what changed
- `git log --oneline` - See commit history
- `git remote -v` - See connected repositories

**Resources**:
- GitHub Help: https://docs.github.com
- Git Handbook: https://guides.github.com/introduction/git-handbook/

---

## Your Repository Details

**Repository Name**: iravi-enterprises-website  
**Repository URL**: https://github.com/YOUR-USERNAME/iravi-enterprises-website  
**Local Path**: C:\Iravi  
**Default Branch**: main  

---

**Total Time**: 30-45 minutes  
**Difficulty**: Beginner  
**Cost**: FREE  

---

You're all set! 🚀 Welcome to the world of version control!
