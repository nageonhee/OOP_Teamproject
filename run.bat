@echo off
chcp 65001 > nul
cd /d "%~dp0"
if not exist out mkdir out
javac -encoding UTF-8 -d out src\*.java
if errorlevel 1 exit /b 1
if not exist out\Main.class (
  echo Main.java 구현 후 실행할 수 있습니다.
  exit /b 1
)
java -cp out Main
