package oop;

import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class UpdateStudentInfo {
    // This function is used to update any student information
    void updateInfo()
    {
        String id, name, section, cgpa, vaccine, str;
        try {
            File file2 = new File("E:/Varsity/Semesters/Varsity-2_2/OOP/Project/Project-Practice/Files/studentInfo.txt");
            Scanner scanner = new Scanner(file2);
            System.out.print("Enter the ID No. of the student you want to update: ");
            Scanner input = new Scanner(System.in);
            String newID = input.next();
            String updatedID = "", updatedName = "", updatedSection = "", updatedCgpa = "", updatedVaccine = "";
            boolean found = false;
            while (scanner.hasNext())
            {
                id = scanner.next();
                if(id.equals(newID)) // Checking if the given ID is available in database or not
                {
                    updatedID = "";
                    updatedName = "";
                    updatedSection = "";
                    updatedCgpa = "";
                    updatedVaccine = "";
                    name = scanner.next();
                    section = scanner.next();
                    cgpa = scanner.next();
                    vaccine = scanner.next();
                    updatedID = id;
                    updatedName = name;
                    updatedSection = section;
                    updatedCgpa = cgpa;
                    updatedVaccine = vaccine;
                    found = true;
                }
            }
            if(found)
            {
                // This gives options what the admin want to update
                System.out.println("************* What do you want to update? *************");
                System.out.println("1. Name? ");
                System.out.println("2. Section? ");
                System.out.println("3. CGPA? ");
                System.out.println("4. Is vaccinated or not? ");

                System.out.print("Enter an option: ");
                int choice;
                choice = input.nextInt();
                switch (choice)
                {
                    case 1:
                        System.out.print("Enter the updated name: ");
                        updatedName = "";
                        updatedName = input.next();
                        break;
                    case 2:
                        System.out.print("Enter the updated section: ");
                        updatedSection = "";
                        updatedSection = input.next();
                        break;
                    case 3:
                        System.out.print("Enter the updated CGPA: ");
                        updatedCgpa = "";
                        updatedCgpa = input.next();
                        break;
                    case 4:
                        System.out.print("Is vaccinated? : ");
                        updatedVaccine = "";
                        updatedVaccine = input.next();
                        break;
                }
                str = updatedID + " " + updatedName + " " + updatedSection + " " + updatedCgpa + " " + updatedVaccine;
                PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file2, true)));
                out.println(str);
                out.close();
                System.out.println("Student Information Updated.");
            }
            else
            {
                System.out.println("Invalid student ID. Try again.");
                updateInfo();
            }
        }
        catch (Exception e)
        {
            //System.out.println(e);
        }
    }
}
