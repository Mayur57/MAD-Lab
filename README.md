# MAD Lab 
MAD Lab stands for Mobile Application Development Lab and explores Android App Development using Java. It is a lab-only subject offered in semester 6 of CCE.

This repository contains all the lab question in the format of build-and-run apps and is meant for educational purpose. Just clone the repo and run any app you want using the steps given below. Don't forget to star the repository!

### Clone and Run
**Requirements**
- [Android Studio](https://developer.android.com/studio)
- Android SDK (Install through Android Studio)
- [Java Runtime and JDK](https://www.oracle.com/in/java/technologies/javase-jdk15-downloads.html) (You probably already have this)

**Steps to run the apps**
- Clone this repo to your device
- Open Android Studio and select *Open an Existing Project*
![step2.png](https://i.ibb.co/6Y5zxwB/Screenshot-2021-03-02-at-7-06-56-PM.png)
- Now, select the folder corresponding to the Lab/Evaluation you want the app of
 
 ### I just want the code
 Don't need to run the whole app and just need Java or XML code? You can find the Java files in the following directory for any given Lab folder: ```app/src/main/java/com/application/{App-Name-Here}/```
 
 Similarly, the UI XML files can be found here:
 ```app/src/main/res/layout/```
 
 ### Evaluations
 The evaluation questions are listed below:
 
  ##### Evaluation 1
  You are supposed to make an app which shows the users a text field where the user can input integers ranging from 1-10. The app should also maintain a *random integer seed* also ranging from 1-10. The screen also has a button that says "Guess". Upon, clicking the button, the app should compare the seed and the user input to check if they are same. If they are same, the app should show a toast saying "Guess was correct". Otherwise, it should show a toast saying whether the input was greater/smaller than the seed. Seed should be refreshed upon each button click.
  
  ##### Evaluation 2
  You are supposed to make an app which shows the users a list view containing 3 items: "Fruits", "Vegetables" and "Junk". On press of any of the list items the image corresponding to the list item should be shown. Note: The method to show the image is not clear and the solution is disputed. One of the possible ways is to change the background of the main activity to the image while the other method is to launch a new activity using an ```Intent```. The solution posted here uses the latter approach.
 
  ### Contribute
  Want to contribute? Awesome, fork the repo and open a pull request with your changes and I will merge it after reviewing as soon as possible.
