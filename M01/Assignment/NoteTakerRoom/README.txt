Albert Yakubov Note Taking Room 

Debugger

Initial issue:
Upon launching the debugger, the default launching activity is not found
Added Activities to manifest, and set the intent filter to main activity

Issue 2:
C:\Users\Owner\Desktop\GitProjects\week8\Sprint-Android-Code-Quality-Assignments\
M01\Assignment\NoteTakerRoom\app\src\main\res\layout\activity_edit.xml:8: AAPT: 
error: attribute layout_constraintBottom_toTopOf 
(aka com.lambdaschool.notetakerroom:layout_constraintBottom_toTopOf) not found.

Problem was in build.gradle, Implemented right libraries