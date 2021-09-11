package oop;

import java.io.*;
import java.util.*;
import java.util.Formatter;
import java.util.Scanner;

public class StudentSignUp {
    void signUp()
    {
        String userName, password, str;
        try{
            //Formatter formatter = new Formatter("E:/Varsity/Semesters/Varsity-2_2/OOP/Project/Project-Practice/Files/usernameAndPassword.txt");
            File file1 = new File("E:/Varsity/Semesters/Varsity-2_2/OOP/Project/Project-Practice/Files/usernameAndPassword.txt");
            Scanner scanner = new Scanner(file1);
            //formatter.close();
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter your username: ");
            userName = input.next();
            System.out.print("Please enter your password: ");
            password = input.next();
            boolean duplicate = false;
            while (scanner.hasNext())
            {
                String user = scanner.next();
                String pass = scanner.next();
                if(user.equals(userName))
                {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate)
            {
                str = userName + " " + password;
                PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file1, true)));
                out.println(str);
                out.close();
                System.out.println("Sign up successful. Please sign in now.");
            }
            else
            {
                System.out.println("Username must be unique. Please try again.");
                signUp();
            }
            /*formatter.format("%s %s\r\n", user, pass);
            formatter.close();*/
            /*//System.out.println("Account has been created. Please sign in.");
            System.out.println("************* Please choose an option *************");
            System.out.println("1. Sign Up As Student");
            System.out.println("2. Sign In As Student");
            System.out.println("3. Sign In As Admin");

            int choice;
            System.out.print("Enter any option you like: ");
            //Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            if(choice == 1)
            {
                StudentSignUp studentSignUp = new StudentSignUp();
                studentSignUp.signUp();
            }
            else
            {
                formatter.close();
            }*/

        }catch (Exception e)
        {
            //System.out.println(e);
        }
    }
}
