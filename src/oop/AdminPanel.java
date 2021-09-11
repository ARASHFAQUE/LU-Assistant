package oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdminPanel {
    // This is admin panel of this application. From here the control panel can access any information like add new student information, update information
    void controlServer()
    {
        String userName, password;
        try{
            // In this file the username and password of admins are stored
            File file1 = new File("E:/Varsity/Semesters/Varsity-2_2/OOP/Project/Project-Practice/Files/adminPanel.txt");
            Scanner scanner = new Scanner(file1);
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter the admin username: ");
            userName = input.next();
            System.out.print("Please enter the admin password: ");
            password = input.next();
            boolean valid = false;
            while (scanner.hasNext())
            {
                String user = scanner.next();
                String pass = scanner.next();
                if(user.equals(userName) && pass.equals(password)) // Checking if the admins username and password is valid or not
                {
                    valid = true;
                    break;
                }
            }
            if(valid)
            {
                int choice;
                while(true)
                {
                    // This gives the admins the options what they want to do
                    System.out.println("************* Please choose an option *************");
                    System.out.println("1. Add New Student Information");
                    System.out.println("2. Update Student Information");
                    System.out.println("3. Add New Teacher Information");
                    System.out.println("4. Update Teacher Information");
                    System.out.println("5. Update Class Routine");
                    System.out.println("6. Update Bus Schedule");
                    System.out.println("7. Home");

                    System.out.print("Enter any option you like: ");
                    choice = input.nextInt();
                    switch (choice)
                    {
                        case 1:
                            AddStudentInformation addStudentInformation = new AddStudentInformation();
                            addStudentInformation.addInfo();
                            break;
                        case 2:
                            UpdateStudentInfo updateStudentInfo = new UpdateStudentInfo();
                            updateStudentInfo.updateInfo();
                            break;
                        case 3:
                            /*AddStudentInformation addStudentInformation = new AddStudentInformation();
                            addStudentInformation.addInfo();*/
                            break;
                        case 4:
                            /*UpdateStudentInfo updateStudentInfo = new UpdateStudentInfo();
                            updateStudentInfo.updateInfo();*/
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
            else
            {
                System.out.println("Wrong Information! Please try again.");
                Home home = new Home();
                home.startOfEverything();
            }
        }catch (FileNotFoundException e)
        {
            //System.out.println(e);
        }
    }
}
