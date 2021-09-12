package oop;

import java.util.Scanner;

public class StudentChoice {
    // After signing in this page occurs which provides students to access information they want
    void choice(String id)
    {
        int choice;
        while(true)
        {
            System.out.println("************* Please choose an option *************");
            System.out.println("1. Your Information");
            System.out.println("2. Any Student Information");
            System.out.println("3. Teacher Information");
            System.out.println("4. Class Routine");
            System.out.println("5. Bus Schedule");
            System.out.println("6. Home");

            System.out.print("Enter any option you like: ");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    PrintOwnInformation printOwnInformation = new PrintOwnInformation();
                    printOwnInformation.displayOwn(id);
                    break;
                case 2:
                    PrintStudentInfo printStudentInfo = new PrintStudentInfo();
                    printStudentInfo.display(id);
                    break;
                case 3:
                    StudentSignIn studentSignIn = new StudentSignIn();
                    studentSignIn.signIn();
                    break;
                case 4:
                    RoutineBusSchedule routine = new RoutineBusSchedule();
                    routine.routine();
                    break;
                case 5:
                    RoutineBusSchedule busSchedule = new RoutineBusSchedule();
                    busSchedule.schedule();
                    break;
                case 6:
                    Home home = new Home();
                    home.startOfEverything();
                    break;
            }
        }
    }
}
