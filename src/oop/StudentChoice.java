package oop;

import java.util.Scanner;
import java.io.*;

public class StudentChoice {
    // After signing in this page occurs which provides students to access information they want
    void choice(String id)  {
        int choice;
        while(true)
        {
            System.out.println("************* Please choose an option *************");
            System.out.println("1. Your Information");
            System.out.println("2. Other Student Information");
            System.out.println("3. Teacher Information");
            System.out.println("4. CR Information");
            System.out.println("5. Class Routine");
            System.out.println("6. Bus Schedule");
            System.out.println("7. Home");

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
                    System.out.println("************* Please choose an option *************");
                    System.out.println("1. Search Teacher Information");
                    System.out.println("2. Display Teacher Information");

                    System.out.print("Enter any option you like: ");

                    choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            TeacherInformation searchTeacherInformation = new TeacherInformation();
                            searchTeacherInformation.searchTeacherInformation();
                            break;
                        case 2:
                            TeacherInformation displayTeacherInformation = new TeacherInformation();
                            displayTeacherInformation.displayTeacherInformation();
                            break;
                        }
                    break;
                case 4:
                    System.out.println("************* Please choose an option *************");
                    System.out.println("1. Search CR Information");
                    System.out.println("2. Display CR Information");

                    System.out.print("Enter any option you like: ");

                    choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            ClassRepresentativeInformation searchClassRepresentativeInformation = new ClassRepresentativeInformation();
                            searchClassRepresentativeInformation.searchClassRepresentative();
                            break;
                        case 2:

                            //break;
                    }
                    break;
                case 5:
                    RoutineBusSchedule routine = new RoutineBusSchedule();
                    routine.routine();
                    break;
                case 6:
                    RoutineBusSchedule busSchedule = new RoutineBusSchedule();
                    busSchedule.schedule();
                    break;
                case 7:
                    Home home = new Home();
                    home.startOfEverything();
                    break;
            }
        }
    }
}
