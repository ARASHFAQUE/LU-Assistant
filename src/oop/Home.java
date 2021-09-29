package oop;

import java.util.Scanner;

public class Home extends AdminPanel{
    // This is the home page of this application
    void startOfEverything()
    {
        int choice;
        while(true)
        {
            System.out.println("********************* Welcome *********************");
            System.out.println("************* Please choose an option *************");
            System.out.println("1. Sign Up As Student");
            System.out.println("2. Sign In As Student");
            System.out.println("3. Forget Password");
            System.out.println("4. Sign In As Admin");
            System.out.println("5. Exit");

            System.out.print("Enter any option you like: ");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    StudentSignUp studentSignUp = new StudentSignUp();
                    studentSignUp.signUp();
                    break;
                case 2:
                    StudentSignIn studentSignIn = new StudentSignIn();
                    studentSignIn.signIn();
                    break;
                case 3:
                    StudentSignIn studentSignIn2 = new StudentSignIn();
                    studentSignIn2.forgotPassword();
                    break;
                case 4:
                    AdminPanel adminPanel = new AdminPanel();
                    adminPanel.controlServer();
                    break;
                case 5:
                    System.out.println("Application Exited.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice.");
                    startOfEverything();
            }
        }
    }
}
