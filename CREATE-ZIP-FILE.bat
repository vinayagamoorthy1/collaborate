@echo off
echo ================================
echo Iravi Enterprises ZIP Creator
echo ================================
echo.
echo This will create a shareable ZIP file WITHOUT:
echo - node_modules (too large)
echo - dist (auto-generated)
echo - .angular (temporary files)
echo.
echo Creating ZIP file...
echo.

PowerShell -ExecutionPolicy Bypass -File "%~dp0create-zip.ps1"

pause
