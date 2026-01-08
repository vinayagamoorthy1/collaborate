# Quick GitHub Upload - Simple Steps

## 🎯 Follow These Exact Steps

---

## STEP 1: Create GitHub Account (5 minutes)

1. Open browser → Go to: **https://github.com**
2. Click **"Sign up"** button
3. Enter:
   - Email: `iravigreenenergy@gmail.com`
   - Password: (create strong password)
   - Username: `iravi-green-energy` (or your choice)
4. Click **"Continue"**
5. Verify email (check inbox)
6. Choose **"Free"** plan
7. ✅ Done! You have GitHub account

---

## STEP 2: Check If Git Is Installed

Open PowerShell and type:
```powershell
git --version
```

**If you see version number** → ✅ Skip to STEP 4

**If you see error** → Continue to STEP 3

---

## STEP 3: Install Git (If Needed)

1. Go to: **https://git-scm.com/download/win**
2. Download starts automatically
3. Run the downloaded file
4. Click "Next" through all steps
5. Click "Install"
6. Click "Finish"
7. **Close and reopen PowerShell**
8. Test: `git --version`
9. ✅ Should see version number now

---

## STEP 4: Open PowerShell in Your Project

**Option A: From File Explorer**
1. Open File Explorer
2. Go to: `C:\Iravi`
3. Hold **Shift** + Right-click in empty area
4. Click "Open PowerShell window here"

**Option B: Type this**
```powershell
cd C:\Iravi
```

---

## STEP 5: Configure Git (One Time Only)

Copy and paste these commands one by one:

```powershell
git config --global user.name "Iravi Green Energy"
```

```powershell
git config --global user.email "iravigreenenergy@gmail.com"
```

✅ Git is configured!

---

## STEP 6: Initialize Git Repository

```powershell
git init
```

✅ You should see: "Initialized empty Git repository"

---

## STEP 7: Add All Files

```powershell
git add .
```

Wait a few seconds...
✅ Files are ready to upload

---

## STEP 8: Create First Commit

```powershell
git commit -m "Initial commit - Iravi Green Energy website"
```

✅ Files are committed!

---

## STEP 9: Rename Branch to Main

```powershell
git branch -M main
```

✅ Branch renamed to main!

---

## STEP 10: Create Repository on GitHub

1. Go to: **https://github.com**
2. Click **"+"** (top right) → **"New repository"**
3. Fill in:
   - Repository name: `iravi-green-energy`
   - Description: `Solar and fabrication services website`
   - Select: **Public**
   - **DO NOT** check any boxes below
4. Click **"Create repository"**
5. ✅ Repository created!

---

## STEP 11: Connect to Your GitHub Repository

After creating repository, GitHub shows you a page.

Copy YOUR repository URL (looks like):
```
https://github.com/YOUR_USERNAME/iravi-green-energy.git
```

Then in PowerShell, type (replace YOUR_USERNAME with your actual username):

```powershell
git remote add origin https://github.com/YOUR_USERNAME/iravi-green-energy.git
```

**Example**: If your username is `iravi-enterprises`:
```powershell
git remote add origin https://github.com/iravi-enterprises/iravi-green-energy.git
```

✅ Connected to GitHub!

---

## STEP 12: Push Your Code to GitHub

```powershell
git push -u origin main
```

**You'll be asked:**
- Username: (type your GitHub username)
- Password: (type your GitHub password)

**If password doesn't work**, continue to STEP 13.

**If it works**, ✅ **DONE! Your code is on GitHub!** 🎉

---

## STEP 13: Create Token (If Password Didn't Work)

1. Go to: **https://github.com/settings/tokens**
2. Click **"Generate new token"** → **"Generate new token (classic)"**
3. Note: `Iravi Project`
4. Check: ✅ **repo** (all options under it)
5. Scroll down → Click **"Generate token"**
6. **COPY THE TOKEN** (starts with `ghp_`)
7. **Save it somewhere** (you won't see it again!)

Now run push again:
```powershell
git push -u origin main
```

- Username: (your GitHub username)
- Password: (paste the token `ghp_xxx...`)

✅ **DONE! Your code is on GitHub!** 🎉

---

## STEP 14: Verify on GitHub

1. Go to: `https://github.com/YOUR_USERNAME/iravi-green-energy`
2. You should see all your files!
3. ✅ **SUCCESS!**

---

## 🎉 Congratulations!

Your code is now on GitHub!

**Your GitHub repository URL:**
```
https://github.com/YOUR_USERNAME/iravi-green-energy
```

---

## 🚀 Next: Deploy Your Website

Now that your code is on GitHub, you can deploy to:

### **Option 1: Vercel (Easiest)**
1. Go to: **https://vercel.com**
2. Click "Sign up with GitHub"
3. Click "New Project"
4. Select "iravi-green-energy"
5. Click "Deploy"
6. ✅ Your website is LIVE in 3 minutes!

### **Option 2: Cloudflare Pages (Fastest)**
1. Go to: **https://pages.cloudflare.com**
2. Sign up (free)
3. "Create a project"
4. Connect GitHub
5. Select "iravi-green-energy"
6. Deploy!
7. ✅ Your website is LIVE!

---

## 📱 Update Code Later

When you make changes:

```powershell
# 1. Add changes
git add .

# 2. Commit
git commit -m "Updated contact info"

# 3. Push
git push
```

✅ Updates will automatically deploy to your live website!

---

## ❓ Problems?

### "git is not recognized"
→ Restart PowerShell after installing Git

### "Permission denied"
→ Use Personal Access Token (STEP 13)

### "fatal: not a git repository"
→ Make sure you're in C:\Iravi folder

### "Repository not found"
→ Check URL has your correct username

---

## ✅ Complete Command List (Copy & Paste)

```powershell
# Navigate to project
cd C:\Iravi

# Configure Git (first time only)
git config --global user.name "Iravi Green Energy"
git config --global user.email "iravigreenenergy@gmail.com"

# Initialize and commit
git init
git add .
git commit -m "Initial commit - Iravi Green Energy website"
git branch -M main

# Connect to GitHub (replace YOUR_USERNAME)
git remote add origin https://github.com/YOUR_USERNAME/iravi-green-energy.git

# Push to GitHub
git push -u origin main
```

---

**Ready? Start with STEP 1!** 🚀
