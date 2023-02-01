
/*--------------------------------------------
    Program 1: Garrett's Popcorn Calorie Tracker
    Garrett's popcorn is looking to hire a developer to create a program that allows a customer to determine the total number of calories based on the 
    number of cups of popcorn the user enters. The nutritional facts state that there are 150 calories (54 calories from fat) per 1 cup (30 grams) of 
    Garrett's mixed popcorn. You will create a program that lets the customer enter the number of cups of popcorn consumed and then report:

    1) the total number of calories consumed 
    2) the total number of calories from fat 
    3) the amount of popcorn in grams consumed

    Calorie Information: https://www.nutritionix.com/i/garrett-popcorn-shops/garrett-mix/581d840270aa658137d9ddd6
	
	There will be five requirements for Program 1
	Requirement 1 - Variables declared and intialized; Constant variables declared; Properly utilized Scanner Object
                    
	Requirement 2 - Input/Output of all necessary information 
                    
    Requirement 3 - Correct calculations are made for cup to calorie conversion, calories from fat and cup to grams
    Requirement 4 - Style - Proper use of comments, spacing, in program; use of
                    descriptive variable names
    Requirement 5 - Program is submitted by the due date listed and pushed to assigned GitHub Repository; 
                    Repository contains a minimum of three commits.
	
    [REPLACE MY INFORMATION WITH YOURS]
    Course: COMP 170, Spring I 2023
    System: Visual Studio Code, Windows 10
    Author: R. Cordova
*/


import java.util.Scanner; //Scanner Class imported

public class Calories {
    public static void main(String[] args) throws Exception {
        
        //DECLARATIONS (Declare your variables below including your Scanner Object)
        
        //declare user input variables
        int numCups;
        String custName;
        
        //Declare variables needed for calculations per input
        int finalCalPerCup; 
        int finalFatPerCup; 
        int finalGramsPerCup; 

        //Initialize fixed variables for calculations
        final int CAL_PER_CUP = 150;
        final int FAT_PER_CUP = 54;
        final int GRAMS_PER_CUP = 30;

        Scanner scnr = new Scanner(System.in);

        
        //  Scanner inputScanner = new Scanner(System.in); //alternate attempt to fix issue by changing scanner name to inputscanner


        //INTRODUCTION
        System.out.println("Welcome to the Garrett's Popcorn Calorie Tracker!  This program will allow you to enter the total number of cups of Garrett's popcorn and provide you with the total number of calories consumed, the breakdown of calories from fat and the total number of grams per cup consumed.");
        System.out.println(" ");

        //INPUT AND OUTPUT 
        System.out.print("To get started, please enter the total amount of cups of popcorn you plan to eat: ");   //REQUEST: numCups consumed prompt
        numCups = Integer.parseInt(scnr.nextLine());           // input for number of cups

         
        System.out.print("Please enter your name: ");        //REQUEST: NAME prompt
        custName = scnr.nextLine();                             // input for user name
         


        //MAKE CALCULATIONS
        // equations based on input
        finalCalPerCup = (numCups * CAL_PER_CUP); //CALORIES PER CUPS ENTERED
        
        finalGramsPerCup = (numCups * GRAMS_PER_CUP); //GRAMS CONSUMED PER CUPS ENTERED

        finalFatPerCup = (numCups * FAT_PER_CUP); //FAT PER CUPS ENTERED

        
        
        

        //OUTPUT DATA TO CONSOLE
        System.out.println(custName + "your caloric intake of Garrett's Popcorn is listed below:"); // accept name and output first two lines of loop
        System.out.println("*******************************************************************************************************");
        System.out.println(" ");
        

        
        System.out.println(numCups + " cup(s) equates to " + finalCalPerCup + " calories"); 
        System.out.println(numCups + " cup(s) equates to " + finalGramsPerCup + " grams consumed"); 
        System.out.println("Out of " + finalCalPerCup + " total calories - " + finalFatPerCup + " is calories from fat"); 

        
         
    scnr.close();
    }
}
