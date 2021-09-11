package oop;

import java.io.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class UpdateStudentInfo {
    void updateInfo()
    {
        String id, name, section, cgpa, vaccine, str;
        try {
            File file2 = new File("E:/Varsity/Semesters/Varsity-2_2/OOP/Project/Project-Practice/Files/studentInfo.txt");
            Scanner scanner = new Scanner(file2);
            System.out.print("Enter the ID No. of the student you want to update: ");
            Scanner input = new Scanner(System.in);
            String newID = input.next();
            boolean found = false;
            while (scanner.hasNext())
            {
                id = scanner.next();
                if(id.equals(newID))
                {
                    name = scanner.next();
                    section = scanner.next();
                    cgpa = scanner.next();
                    vaccine = scanner.next();
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
                            name = input.next();
                            break;
                        case 2:
                            System.out.print("Enter the updated section: ");
                            section = input.next();
                            break;
                        case 3:
                            System.out.print("Enter the updated CGPA: ");
                            cgpa = input.next();
                            break;
                        case 4:
                            System.out.print("Is vaccinated? : ");
                            vaccine = input.next();
                            break;
                    }
                    str = id + " " + name + " " + section + " " + cgpa + " " + vaccine;
                    PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file2, true)));
                    out.println(str);
                    out.close();
                    System.out.println("Student Information Updated.");
                    found = true;
                    break;
                }
            }
            if(!found)
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
