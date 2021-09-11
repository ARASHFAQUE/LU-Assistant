package oop;

import java.io.File;
import java.util.Scanner;

public class StudentSignIn extends PrintOwnInformation{
    // This function is used for student sign in
    void signIn()
    {
        String userName, password;
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
                    valid = true;
                    break;
                }
            }
            if(valid)
            {
                System.out.println("Signed In Successful.");
                StudentChoice studentChoice = new StudentChoice();
                studentChoice.choice(userName, password);
            }
            else
            {
                System.out.println("Wrong Information! Please try again.");
                Home home = new Home();
                home.startOfEverything();
            }
        }catch (Exception e)
        {
            //System.out.println(e);
        }
    }
}
