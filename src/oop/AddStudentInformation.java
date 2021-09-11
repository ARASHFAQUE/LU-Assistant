package oop;

import java.io.*;
import java.util.Scanner;

public class AddStudentInformation {
    void addInfo() {
        int numberOfStudent;
        String id, name, section, cgpa, vaccine, str;
        String studentID;
        try {
            //Formatter formatter = new Formatter("E:/Varsity/Semesters/Varsity-2_2/OOP/Project/Project-Practice/Files/usernameAndPassword.txt");
            File file2 = new File("E:/Varsity/Semesters/Varsity-2_2/OOP/Project/Project-Practice/Files/studentInfo.txt");
            Scanner scanner = new Scanner(file2);
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of students: ");
            numberOfStudent = input.nextInt();
            for (int i = 1; i <= numberOfStudent; i++)
            {
                System.out.println("Enter the information of " + i + " student: ");
                System.out.print("ID No.: ");
                id = input.next();
                boolean alreadyExists = false;
                while (scanner.hasNext())
                {
                    studentID = scanner.next();
                    if(id.equals(studentID))
                    {
                        alreadyExists = true;
                    }
                }
                if(!alreadyExists)
                {
                    System.out.print("Name: ");
                    name = input.next();
                    System.out.print("Section: ");
                    section = input.next();
                    System.out.print("CGPA: ");
                    cgpa = input.next();
                    System.out.print("Is Vaccinated?: ");
                    vaccine = input.next();
                    str = id + " " + name + " " + section + " " + cgpa + " " + vaccine;
                    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file2, true)));
                    out.println(str);
                    out.close();
                    System.out.println("Student Information Added.");
                }
                else
                {
                    System.out.println("This information already exists. Try again.");
                    i--;
                }
            }
        }
        catch (Exception e)
        {
            //System.out.println(e);
        }
    }
}