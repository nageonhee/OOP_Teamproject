@echo off
rem Compile every .java under src, then run shop.Main
chcp 65001 > nul
cd /d "%~dp0"
if exist out rmdir /s /q out
powershell -NoProfile -Command "Get-ChildItem src -Recurse -Filter *.java | Resolve-Path -Relative | ForEach-Object { $_ -replace '\\','/' }" > sources.txt
javac -encoding UTF-8 -d out @sources.txt
if errorlevel 1 (del sources.txt & exit /b 1)
del sources.txt
java -cp out shop.Main
