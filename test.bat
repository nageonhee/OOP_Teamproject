@echo off
rem Compile src and test, then run shop.ShopTest
chcp 65001 > nul
cd /d "%~dp0"
if exist out rmdir /s /q out
powershell -NoProfile -Command "Get-ChildItem src,test -Recurse -Filter *.java | Resolve-Path -Relative | ForEach-Object { $_ -replace '\\','/' }" > sources.txt
javac -encoding UTF-8 -d out @sources.txt
if errorlevel 1 (del sources.txt & exit /b 1)
del sources.txt
java -cp out shop.ShopTest
