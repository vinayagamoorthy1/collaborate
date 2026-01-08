# 🚀 GitHub Quick Start Commands - Iravi Enterprises

## ⚡ First Time Setup (Do Once)

### 1. Install Git
- Download: https://git-scm.com/download/win
- Run installer, keep defaults
- Restart PowerShell

### 2. Configure Git
```powershell
git config --global user.name "Iravi Enterprises"
git config --global user.email "iravigreenenergy@gmail.com"
```

### 3. Create GitHub Account
- Go to: https://github.com
- Click "Sign up"
- Follow the steps
- Verify email

---

## 📤 Upload Project to GitHub (First Time)

### Open PowerShell in C:\Iravi, then run:

```powershell
# Initialize repository
git init

# Add all files
git add .

# Create first commit
git commit -m "Initial commit: Iravi Enterprises Angular application"

# Connect to GitHub (replace YOUR-USERNAME)
git remote add origin https://github.com/YOUR-USERNAME/iravi-enterprises-website.git

# Rename branch to main
git branch -M main

# Push to GitHub
git push -u origin main
```

**When prompted**: Use your GitHub username and Personal Access Token (not password)

---

## 🔄 Update GitHub After Making Changes

### Every time you make changes to your code:

```powershell
# See what changed
git status

# Add all changes
git add .

# Commit with description
git commit -m "Your change description here"

# Push to GitHub
git push
```

---

## 💡 Example Workflows

### Example 1: Updated Contact Information
```powershell
git add .
git commit -m "Update contact phone number and address"
git push
```

### Example 2: Added New Images
```powershell
git add .
git commit -m "Add new solar panel installation images"
git push
```

### Example 3: Fixed Form Bug
```powershell
git add .
git commit -m "Fix enquiry form email validation issue"
git push
```

### Example 4: Updated Styling
```powershell
git add .
git commit -m "Improve responsive design for mobile devices"
git push
```

---

## 🔑 Personal Access Token Setup

### When/If You Need Authentication:

1. **GitHub.com** → Profile → **Settings**
2. Left sidebar → **Developer settings**
3. **Personal access tokens** → **Tokens (classic)**
4. **Generate new token** → **Generate new token (classic)**
5. Note: "Iravi Project"
6. Expiration: 90 days or No expiration
7. Scopes: Check ✅ **repo**
8. **Generate token**
9. **COPY IMMEDIATELY** (you won't see it again!)

**Use token as password when Git asks for authentication**

---

## 🛠️ Useful Commands

```powershell
# Check Git version
git --version

# Check configuration
git config --global --list

# See commit history
git log --oneline

# See remote repository
git remote -v

# See changed files
git status

# See what was changed in files
git diff

# Undo last commit (keep changes)
git reset --soft HEAD~1

# Pull latest from GitHub
git pull
```

---

## 📁 Before First Push - Verify These Files Exist

```
c:\Iravi\.gitignore     ✅ (Excludes node_modules, dist)
c:\Iravi\README.md      ✅ (Project description)
c:\Iravi\package.json   ✅ (Dependencies)
```

**Make sure these folders are NOT uploaded**:
- ❌ node_modules (too large, auto-generated)
- ❌ dist (build output, auto-generated)
- ❌ .angular/cache (temporary files)

These should be in your `.gitignore` file already! ✅

---

## 🎯 Your Repository Info

**Recommended Name**: `iravi-enterprises-website`  
**Description**: Modern, responsive website for Iravi Enterprises - Solar & Fabrication Work Solutions  
**Visibility**: Public (or Private if you prefer)  
**Local Path**: C:\Iravi  

---

## ⚠️ Troubleshooting

| Issue | Solution |
|-------|----------|
| `git: command not found` | Restart PowerShell after installing Git |
| Authentication failed | Use Personal Access Token instead of password |
| Large file error | Make sure .gitignore includes node_modules |
| `fatal: not a git repository` | Run `git init` first |
| Permission denied | Make sure you own the repository |
| Merge conflict | Run `git pull` before `git push` |

---

## 🌐 After Upload - Deploy Your Site

### Option 1: Vercel (Recommended)
1. Go to https://vercel.com
2. Sign up with GitHub
3. Import your repository
4. Deploy automatically!

### Option 2: Netlify
1. Go to https://netlify.com
2. Sign up with GitHub
3. New site from Git
4. Select repository
5. Deploy!

### Option 3: GitHub Pages
1. GitHub repo → Settings
2. Pages (left sidebar)
3. Source: Deploy from branch
4. Branch: main
5. Save

---

## 📊 Git Workflow Diagram

```
Your Computer (C:\Iravi)
         ↓
    git add .  ← Stage changes
         ↓
   git commit  ← Save snapshot
         ↓
    git push   ← Upload to GitHub
         ↓
      GitHub
         ↓
  Vercel/Netlify ← Auto-deploy
         ↓
   Live Website!
```

---

## ✅ Success Checklist

After following the guide, you should have:

- [x] GitHub account created
- [x] Git installed on Windows
- [x] Git configured with your name/email
- [x] GitHub repository created
- [x] Project uploaded to GitHub
- [x] Repository visible at github.com
- [ ] (Optional) Deployed to Vercel/Netlify
- [ ] (Optional) Custom domain connected

---

## 📚 Learn More

- **Git Basics**: https://git-scm.com/book/en/v2/Getting-Started-Git-Basics
- **GitHub Guides**: https://guides.github.com
- **Markdown Guide**: https://www.markdownguide.org

---

## 💪 You're Ready!

With these commands, you can:
✅ Save your code safely on GitHub  
✅ Track all changes over time  
✅ Collaborate with others  
✅ Deploy your website easily  
✅ Showcase your portfolio  

---

**Questions?** Check the detailed guides:
- `GIT_ACCOUNT_AND_UPLOAD_GUIDE.md` - Complete guide
- `VISUAL_GITHUB_GUIDE.md` - Step-by-step with descriptions
- `GITHUB_UPLOAD_CHECKLIST.md` - Checklist format

---

Good luck! 🎉 Your Iravi Enterprises project is ready for GitHub!
