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
            File dir = new File("Files");
            //dir.mkdir();
            String path = dir.getAbsolutePath();
            File file1 = new File(path + "/adminPanel.txt");
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
                    System.out.println("1. Student Section");
                    System.out.println("2. Teacher Section");
                    System.out.println("3. CR Section");
                    System.out.println("4. Class Routine & Bus Schedule Section");
                    System.out.println("5. Library Section");
                    System.out.println("6. Home");

                    System.out.print("Enter any option you like: ");
                    choice = input.nextInt();
                    switch (choice)
                    {
                        case 1:
                            System.out.println("****** Please choose an option *******");
                            System.out.println("1. Add New Student Information");
                            System.out.println("2. Update Student Information");
                            System.out.println("3. Delete Student Information");

                            System.out.print("Enter any option you like: ");
                            choice = input.nextInt();
                            switch (choice){
                                case 1:
                                    AddStudentInformation addStudentInformation = new AddStudentInformation();
                                    addStudentInformation.addInfo();
                                    break;
                                case 2:
                                    UpdateStudentInfo2 updateStudentInfo2 = new UpdateStudentInfo2();
                                    updateStudentInfo2.updateInfo2();
                                    break;
                                case 3:
                                    DeleteStudentInformation deleteStudentInformation = new DeleteStudentInformation();
                                    deleteStudentInformation.deleteStudentInformation();
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("****** Please choose an option *******");
                            System.out.println("1. Add New Teacher Information");
                            System.out.println("2. Update Teacher Information");
                            System.out.println("3. Delete Teacher Information");

                            System.out.print("Enter any option you like: ");
                            choice = input.nextInt();
                            switch (choice)
                            {
                                case 1:
                                    TeacherInformation addTeacherInformation = new TeacherInformation();
                                    addTeacherInformation.addTeacherInformation();
                                    break;
                                case 2:
                                    TeacherInformation updateTeacherInformation = new TeacherInformation();
                                    updateTeacherInformation.updateTeacherInformation();
                                    break;
                                case 3:
                                    TeacherInformation deleteTeacherInformation = new TeacherInformation();
                                    deleteTeacherInformation.deleteTeacherInformation();
                                    break;
                            }
                            break;
                        case 3:
                            System.out.println("****** Please choose an option *******");
                            System.out.println("1. Add New CR Information");
                            System.out.println("2. Update CR Information");
                            System.out.println("3. Delete CR Information");

                            System.out.print("Enter any option you like: ");
                            choice = input.nextInt();

                            switch (choice)
                            {
                                case 1:
                                    ClassRepresentativeInformation addClassRepresentativeInformation = new ClassRepresentativeInformation();
                                    addClassRepresentativeInformation.addClassRepresentativeInformation();
                                    break;
                                case 2:
                                    ClassRepresentativeInformation updateClassRepresentativeInformation = new ClassRepresentativeInformation();
                                    updateClassRepresentativeInformation.updateClassRepresentative();
                                    break;
                                case 3:
                                    ClassRepresentativeInformation deleteClassRepresentativeInformation = new ClassRepresentativeInformation();
                                    deleteClassRepresentativeInformation.deleteClassRepresentative();
                                    break;
                            }
                            break;
                        case 4:
                            System.out.println("****** Please choose an option *******");
                            System.out.println("1. Update Class Routine");
                            System.out.println("2. Update Bus Schedule");

                            System.out.print("Enter any option you like: ");
                            choice = input.nextInt();

                            switch (choice)
                            {
                                case 1:
                                    RoutineBusSchedule routine = new RoutineBusSchedule();
                                    routine.routine();
                                    break;
                                case 2:
                                    RoutineBusSchedule busSchedule = new RoutineBusSchedule();
                                    busSchedule.schedule();
                                    break;
                            }
                            break;
                        case 5:
                            System.out.println("****** Please choose an option *******");
                            System.out.println("1. Add New Book Information");
                            System.out.println("2. Update Book Information");
                            System.out.println("3. Delete Book Information");

                            System.out.print("Enter any option you like: ");
                            choice = input.nextInt();
                            switch (choice)
                            {
                                case 1:
                                    LibraryInformation addBookInfo = new LibraryInformation();
                                    addBookInfo.addBookInformation();
                                    break;
                            }
                            break;
                        case 6:
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
            System.out.println("Can not read file!!!");
        }
    }
}
