package oop;

import java.io.*;
import java.util.Scanner;

public class AddStudentInformation {
    // This function is used to add information of newly enrolled students at Leading University
    void addInfo() {
        int numberOfStudent;
        String id, name, birthDate, section, cgpa, payment, vaccine, str;
        String studentID;
        try {
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
                        break;
                    }
                }
                if(!alreadyExists)
                {
                    System.out.print("Name: ");
                    name = input.next();
                    System.out.print("Birthday in Day-Month-Year format: ");
                    birthDate = input.next();
                    System.out.print("Section: ");
                    section = input.next();
                    System.out.print("CGPA: ");
                    cgpa = input.next();
                    System.out.print("Payment Completed?: ");
                    payment = input.next();
                    System.out.print("Is Vaccinated?: ");
                    vaccine = input.next();
                    str = id + " " + name + " " + birthDate + " " + section + " " + cgpa + " " + payment + " " + vaccine;
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