package oop;

import java.io.File;
import java.util.Scanner;

public class StudentSignIn extends PrintStudentInfo{
    void signIn()
    {
        String userName, password;
        try{
            File file1 = new File("E:/Varsity/Semesters/Varsity-2_2/OOP/Project/Project-Practice/Files/usernameAndPassword.txt");
            Scanner scanner = new Scanner(file1);
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter the username: ");
            userName = input.next();
            System.out.print("Please enter the password: ");
            password = input.next();
            //System.out.println("Hello");
            boolean valid = false;
            while (scanner.hasNext())
            {
                String user = scanner.next();
                String pass = scanner.next();
                if(user.equals(userName) && pass.equals(password))
                {
                    valid = true;
                    break;
                }
            }
            if(valid)
            {
                //System.out.println("User Name: " + userName + "\tPassword: " + password);
                StudentChoice studentChoice = new StudentChoice();
                studentChoice.choice();
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
