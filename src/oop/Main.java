package oop;

import java.util.Scanner;

public class Main extends Home{

    public static void main(String[] args) {
        /*StudentSignUp studentSignUp = new StudentSignUp();
        studentSignUp.createFile();
        StudentSignIn studentSignIn = new StudentSignIn();
        studentSignIn.signIn();
        CreateFile createFile = new CreateFile();
        createFile.createFile();*/
        Home home = new Home();
        home.startOfEverything();
        /*int choice;
        while(true)
        {
            System.out.println("************* Please choose an option *************");
            System.out.println("1. Sign Up As Student");
            System.out.println("2. Sign In As Student");
            System.out.println("3. Sign In As Admin");

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
                *//*case 1:
                    AdminPanel adminPanel = new AdminPanel();
                    adminPanel.controlServer();
                    break;
                case 2:
                    StudentSignIn studentSignIn = new StudentSignIn();
                    studentSignIn.signIn();
                    break;*//*
            }
        }*/
    }
}
