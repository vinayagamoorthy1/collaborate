# Iravi Enterprises - Create Shareable ZIP File
# This script creates a ZIP file without node_modules, dist, and other large folders

Write-Host "================================" -ForegroundColor Cyan
Write-Host "Iravi Enterprises ZIP Creator" -ForegroundColor Cyan
Write-Host "================================" -ForegroundColor Cyan
Write-Host ""

# Check if we're in the right directory
if (-not (Test-Path "package.json")) {
    Write-Host "ERROR: Please run this script from C:\Iravi folder!" -ForegroundColor Red
    Write-Host "Current location: $PWD" -ForegroundColor Yellow
    Write-Host ""
    Write-Host "To fix:" -ForegroundColor Yellow
    Write-Host "1. Open PowerShell" -ForegroundColor Yellow
    Write-Host "2. Run: cd C:\Iravi" -ForegroundColor Yellow
    Write-Host "3. Run this script again" -ForegroundColor Yellow
    pause
    exit
}

Write-Host "Creating clean ZIP file for sharing..." -ForegroundColor Green
Write-Host ""

# Output file
$outputZip = "C:\Iravi-Enterprises-Website-Share.zip"

# Remove old ZIP if exists
if (Test-Path $outputZip) {
    Write-Host "Removing old ZIP file..." -ForegroundColor Yellow
    Remove-Item $outputZip -Force
}

Write-Host "Collecting files (excluding node_modules, dist, .angular)..." -ForegroundColor Green

# Folders and patterns to EXCLUDE
$excludePatterns = @(
    '*\node_modules\*',
    '*\dist\*',
    '*\.angular\*',
    '*\.git\*',
    '*\coverage\*',
    '*\.vscode\*'
)

# Get all files except excluded ones
$filesToZip = Get-ChildItem -Path . -Recurse -File | Where-Object {
    $file = $_
    $shouldInclude = $true
    
    foreach ($pattern in $excludePatterns) {
        if ($file.FullName -like $pattern) {
            $shouldInclude = $false
            break
        }
    }
    
    $shouldInclude
}

Write-Host "Found $($filesToZip.Count) files to include" -ForegroundColor Green
Write-Host ""
Write-Host "Creating ZIP file..." -ForegroundColor Green

# Create temporary folder structure
$tempFolder = "C:\Temp_Iravi_Share"
if (Test-Path $tempFolder) {
    Remove-Item $tempFolder -Recurse -Force
}
New-Item -ItemType Directory -Path $tempFolder | Out-Null

# Copy files maintaining structure
foreach ($file in $filesToZip) {
    $relativePath = $file.FullName.Substring($PWD.Path.Length + 1)
    $destination = Join-Path $tempFolder $relativePath
    $destinationDir = Split-Path $destination -Parent
    
    if (-not (Test-Path $destinationDir)) {
        New-Item -ItemType Directory -Path $destinationDir -Force | Out-Null
    }
    
    Copy-Item $file.FullName -Destination $destination -Force
}

# Create ZIP from temp folder
Compress-Archive -Path "$tempFolder\*" -DestinationPath $outputZip -Force

# Calculate size
$zipSize = (Get-Item $outputZip).Length
$zipSizeMB = [math]::Round($zipSize / 1MB, 2)

# Clean up temp folder
Remove-Item $tempFolder -Recurse -Force

Write-Host ""
Write-Host "================================" -ForegroundColor Green
Write-Host "SUCCESS!" -ForegroundColor Green
Write-Host "================================" -ForegroundColor Green
Write-Host ""
Write-Host "ZIP file created: $outputZip" -ForegroundColor Cyan
Write-Host "Size: $zipSizeMB MB" -ForegroundColor Cyan
Write-Host ""

# Check size and give recommendations
if ($zipSizeMB -lt 25) {
    Write-Host "✅ Perfect! Small enough for email (under 25 MB)" -ForegroundColor Green
    Write-Host ""
    Write-Host "You can now:" -ForegroundColor Yellow
    Write-Host "1. Attach to email and send" -ForegroundColor Yellow
    Write-Host "2. Upload to Google Drive/OneDrive" -ForegroundColor Yellow
    Write-Host "3. Share via WeTransfer" -ForegroundColor Yellow
} elseif ($zipSizeMB -lt 50) {
    Write-Host "⚠️  Size is $zipSizeMB MB - might be too large for some email services" -ForegroundColor Yellow
    Write-Host ""
    Write-Host "Recommended:" -ForegroundColor Yellow
    Write-Host "1. Use Google Drive or OneDrive (upload and share link)" -ForegroundColor Yellow
    Write-Host "2. Use WeTransfer: https://wetransfer.com" -ForegroundColor Yellow
    Write-Host "3. Or compress images in public/assets/images/ folder" -ForegroundColor Yellow
} else {
    Write-Host "❌ Size is $zipSizeMB MB - TOO LARGE for email!" -ForegroundColor Red
    Write-Host ""
    Write-Host "RECOMMENDED:" -ForegroundColor Yellow
    Write-Host "1. Use GitHub instead (follow GITHUB_UPLOAD_CHECKLIST.md)" -ForegroundColor Yellow
    Write-Host "2. Use Google Drive/OneDrive and share link" -ForegroundColor Yellow
    Write-Host "3. Compress images using https://tinypng.com" -ForegroundColor Yellow
}

Write-Host ""
Write-Host "================================" -ForegroundColor Cyan
Write-Host "What's Included in the ZIP:" -ForegroundColor Cyan
Write-Host "================================" -ForegroundColor Cyan
Write-Host "✅ src/ folder (source code)" -ForegroundColor Green
Write-Host "✅ public/ folder (images, assets)" -ForegroundColor Green
Write-Host "✅ package.json (dependencies list)" -ForegroundColor Green
Write-Host "✅ Configuration files" -ForegroundColor Green
Write-Host "✅ Documentation (.md files)" -ForegroundColor Green
Write-Host ""
Write-Host "❌ node_modules/ (excluded - too large)" -ForegroundColor Red
Write-Host "❌ dist/ (excluded - auto-generated)" -ForegroundColor Red
Write-Host "❌ .angular/ (excluded - temporary files)" -ForegroundColor Red
Write-Host ""

Write-Host "================================" -ForegroundColor Cyan
Write-Host "For Recipient:" -ForegroundColor Cyan
Write-Host "================================" -ForegroundColor Cyan
Write-Host "Tell them to:" -ForegroundColor Yellow
Write-Host "1. Extract the ZIP file" -ForegroundColor Yellow
Write-Host "2. Open terminal/PowerShell in extracted folder" -ForegroundColor Yellow
Write-Host "3. Run: npm install" -ForegroundColor Yellow
Write-Host "4. Run: npm start" -ForegroundColor Yellow
Write-Host "5. Open browser: http://localhost:4200" -ForegroundColor Yellow
Write-Host ""

Write-Host "================================" -ForegroundColor Green
Write-Host "Need help sharing? Read:" -ForegroundColor Green
Write-Host "  HOW_TO_SHARE_PROJECT.md" -ForegroundColor Cyan
Write-Host ""
Write-Host "Better option? Use GitHub!" -ForegroundColor Green
Write-Host "  Read: GITHUB_UPLOAD_CHECKLIST.md" -ForegroundColor Cyan
Write-Host "================================" -ForegroundColor Green
Write-Host ""

pause
