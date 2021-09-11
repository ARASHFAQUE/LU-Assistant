package oop;

import java.util.Scanner;

public class StudentChoice {
    void choice()
    {
        int choice;
        while(true)
        {
            System.out.println("************* Please choose an option *************");
            System.out.println("1. Student Information");
            System.out.println("2. Teacher Information");
            System.out.println("3. Class Routine");
            System.out.println("4. Bus Schedule");
            System.out.println("5. Home");

            System.out.print("Enter any option you like: ");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    PrintStudentInfo printStudentInfo = new PrintStudentInfo();
                    printStudentInfo.display();
                    break;
                case 2:
                    StudentSignIn studentSignIn = new StudentSignIn();
                    studentSignIn.signIn();
                    break;
                case 3:
                    RoutineBusSchedule routine = new RoutineBusSchedule();
                    routine.routine();
                    break;
                case 4:
                    RoutineBusSchedule busSchedule = new RoutineBusSchedule();
                    busSchedule.schedule();
                    break;
                case 5:
                    Home home = new Home();
                    home.startOfEverything();
                    break;
            }
        }
    }
}
