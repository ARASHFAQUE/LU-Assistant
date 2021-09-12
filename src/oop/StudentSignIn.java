package oop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class StudentSignIn extends PrintOwnInformation{
    // This function is used for student sign in
    void signIn()
    {
        String userName = "", password = "", studentID = "";
        try{
            // In this file the username and password of the registered students are stored
            File file1 = new File("E:/Varsity/Semesters/Varsity-2_2/OOP/Project/Project-Practice/Files/usernameAndPassword.txt");
            Scanner scanner = new Scanner(file1); // Scanner class is called to read the file
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter the username: ");
            userName = input.next();
            System.out.print("Please enter the password: ");
            password = input.next();
            boolean valid = false;
            while (scanner.hasNext())
            {
                String user = scanner.next();
                String pass = scanner.next();
                String id = scanner.next();
                if(user.equals(userName) && pass.equals(password)) // Checking if the given username and password is valid or not
                {
                    studentID = id;
                    valid = true;
                    break;
                }
            }
            if(valid)
            {
                System.out.println("Signed In Successfully.");
                StudentChoice studentChoice = new StudentChoice();
                studentChoice.choice(studentID);
            }
            else
            {
                System.out.println("Wrong Information! Please try again.");
                Home home = new Home();
                home.startOfEverything();
            }
        }catch (Exception e)
        {
            System.out.println("File not found!!!");
        }
    }
    void forgotPassword()
    {
        String userName = "", password = "", studentID = "", str1 = "", str2 = "";
        try{
            // In this file the username and password of the registered students are stored
            File file1 = new File("E:/Varsity/Semesters/Varsity-2_2/OOP/Project/Project-Practice/Files/usernameAndPassword.txt");
            Scanner scanner = new Scanner(file1); // Scanner class is called to read the file
            BufferedReader file3 = new BufferedReader(new FileReader("E:/Varsity/Semesters/Varsity-2_2/OOP/Project/Project-Practice/Files/usernameAndPassword.txt"));
            StringBuilder inputBuffer = new StringBuilder();
            String line;

            while ((line = file3.readLine()) != null) {
                inputBuffer.append(line);
                inputBuffer.append('\n');
            }
            file3.close();
            String inputStr = inputBuffer.toString();

            Scanner input = new Scanner(System.in);
            System.out.print("Please enter your User Name: ");
            userName = input.next();
            boolean valid = false;
            while (scanner.hasNext())
            {
                String user = scanner.next();
                String pass = scanner.next();
                String id = scanner.next();
                if(user.equals(userName)) // Checking if the given username and password is valid or not
                {
                    str1 = user + " " + pass + " " + id;
                    userName = user;
                    password = "";
                    studentID = id;
                    valid = true;
                    break;
                }
            }
            if(valid)
            {
                while(true)
                {
                    System.out.print("Please enter the new password: ");
                    password = input.next();
                    boolean duplicate = false;
                    while (scanner.hasNext())
                    {
                        String user = scanner.next();
                        String pass = scanner.next();
                        String userID = scanner.next();
                        if(pass.equals(password))
                        {
                            duplicate = true;
                            break;
                        }
                    }
                    if(!duplicate)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Password is duplicate. Please try again.");
                    }
                }
                str2 = userName + " " + password + " " + studentID;
                inputStr = inputStr.replace(str1, str2);
                // write the new string with the replaced line OVER the same file
                FileOutputStream fileOut = new FileOutputStream("E:/Varsity/Semesters/Varsity-2_2/OOP/Project/Project-Practice/Files/usernameAndPassword.txt");
                fileOut.write(inputStr.getBytes());
                fileOut.close();
                System.out.println("Password Updated. You can sign in now.");
                Home home = new Home();
                home.startOfEverything();
            }
            else
            {
                System.out.println("Your are not registered. Please sign up first.");
                Home home = new Home();
                home.startOfEverything();
            }
        }catch (Exception e)
        {
            System.out.println("File not found!!!");
        }
    }
}
