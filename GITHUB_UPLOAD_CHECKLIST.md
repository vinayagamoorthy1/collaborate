# GitHub Upload Checklist for Iravi Enterprises

## ✅ Pre-Upload Checklist

- [ ] All code is working and tested
- [ ] EmailJS is configured with your credentials
- [ ] Company logo and images are in place
- [ ] Contact information is correct everywhere
- [ ] node_modules is in .gitignore
- [ ] No sensitive information (API keys, passwords) in code

---

## 📋 Step-by-Step Upload Process

### Phase 1: GitHub Account (15 minutes)
- [ ] Go to https://github.com
- [ ] Click "Sign up"
- [ ] Enter email: _______________________
- [ ] Choose username: _______________________
- [ ] Create strong password
- [ ] Verify email
- [ ] Choose Free plan
- [ ] Profile setup (optional)

### Phase 2: Install Git (10 minutes)
- [ ] Download Git from https://git-scm.com/download/win
- [ ] Run installer (keep default settings)
- [ ] Open PowerShell
- [ ] Verify installation: `git --version`
- [ ] Configure name: `git config --global user.name "Iravi Enterprises"`
- [ ] Configure email: `git config --global user.email "iravigreenenergy@gmail.com"`

### Phase 3: Create GitHub Repository (5 minutes)
- [ ] Log in to GitHub
- [ ] Click "+" → "New repository"
- [ ] Repository name: `iravi-enterprises-website`
- [ ] Description: "Modern, responsive website for Iravi Enterprises - Solar & Fabrication Work Solutions"
- [ ] Choose Public or Private
- [ ] **DO NOT** initialize with README, .gitignore, or license
- [ ] Click "Create repository"
- [ ] Copy repository URL: _______________________

### Phase 4: Upload Project (10 minutes)
- [ ] Open PowerShell in c:\Iravi folder
- [ ] Run: `git init`
- [ ] Run: `git add .`
- [ ] Run: `git commit -m "Initial commit: Iravi Enterprises Angular application"`
- [ ] Run: `git remote add origin [YOUR-REPO-URL]`
- [ ] Run: `git branch -M main`
- [ ] Run: `git push -u origin main`
- [ ] Authenticate (use Personal Access Token)

### Phase 5: Verify Upload (2 minutes)
- [ ] Refresh GitHub repository page
- [ ] Check all files are visible
- [ ] Check folder structure is correct
- [ ] Verify README.md displays correctly

---

## 🔐 GitHub Personal Access Token Setup

If you need a token for authentication:

1. [ ] GitHub → Settings (your profile)
2. [ ] Scroll down → Developer settings
3. [ ] Personal access tokens → Tokens (classic)
4. [ ] Generate new token (classic)
5. [ ] Note: "Iravi Project"
6. [ ] Expiration: Choose duration
7. [ ] Scopes: Check **repo** and **workflow**
8. [ ] Generate token
9. [ ] **COPY TOKEN IMMEDIATELY**: _______________________
10. [ ] Store safely (you won't see it again!)

Use this token as your password when pushing to GitHub.

---

## 🚀 After Upload - Next Steps

- [ ] Add repository link to your website footer
- [ ] Share GitHub profile on LinkedIn
- [ ] Consider hosting on Vercel/Netlify (free with GitHub integration)
- [ ] Set up GitHub Actions for CI/CD (optional)
- [ ] Add LICENSE file (MIT recommended)
- [ ] Update README.md with live site link once hosted

---

## 📝 Quick Command Reference

```powershell
# Check current status
git status

# Make changes and update GitHub
git add .
git commit -m "Description of changes"
git push

# Pull latest changes (if working with team)
git pull

# View history
git log --oneline
```

---

## ⚠️ Common Issues

| Issue | Solution |
|-------|----------|
| Git not recognized | Restart PowerShell or computer after installing Git |
| Authentication failed | Use Personal Access Token, not password |
| Large files error | Check .gitignore includes node_modules and dist |
| Merge conflicts | Run `git pull` before `git push` |

---

## 📞 Need Help?

- GitHub Support: https://support.github.com
- Git Documentation: https://git-scm.com/doc
- Community Forums: https://stackoverflow.com/questions/tagged/git

---

## 📊 Your Project Info

**Project Name**: Iravi Enterprises Website  
**Path**: c:\Iravi  
**Framework**: Angular  
**Company**: Iravi Enterprises  
**Business**: Solar & Fabrication Work  
**Location**: Usilampatti, Madurai, Tamil Nadu  
**Email**: iravigreenenergy@gmail.com  
**Phone**: +91 98843 16657  

---

**Time Required**: ~40-45 minutes total  
**Difficulty**: Beginner-friendly  
**Cost**: Free  

---

Good luck! 🎉 Your project will be safely stored on GitHub and ready to share!
