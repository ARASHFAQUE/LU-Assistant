package oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintStudentInfo {
    // This function is used to print students information
    void display(String sID)
    {
        String studentID, name, birthDate, section, cgpa, payment, vaccine;
        try {
            // In this file the information of enrolled students at Leading University are stored
            File file2 = new File("E:/Varsity/Semesters/Varsity-2_2/OOP/Project/Project-Practice/Files/studentInfo.txt");
            Scanner scanner = new Scanner(file2);
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter the student ID: ");
            String id = input.next();
            input.nextLine();
            String printID = "", printName = "", printBirthDate = "", printSection = "", printCgpa = "", printPayment = "", printVaccine = "";
            boolean valid = false;
            while (scanner.hasNext())
            {
                studentID = scanner.next();
                if(id.equals(studentID))
                {
                    printID = "";
                    printName = "";
                    printSection = "";
                    printCgpa = "";
                    printVaccine = "";
                    //System.out.println("Found");
                    name = scanner.next();
                    birthDate = scanner.next();
                    section = scanner.next();
                    cgpa = scanner.next();
                    payment = scanner.next();
                    vaccine = scanner.next();
                    printID = studentID;
                    printName = name;
                    printSection = section;
                    printCgpa = cgpa;
                    printVaccine = vaccine;
                    valid = true;
                }
            }
            if(valid)
            {
                StringBuilder nameWithSpace = new StringBuilder();
                nameWithSpace.append(printName.charAt(0));
                for (int i = 1; i < printName.length(); i++)
                {
                    char ch = printName.charAt(i);
                    if(Character.isUpperCase(ch))
                    {
                        nameWithSpace.append(" ");
                    }
                    nameWithSpace.append(ch);
                }
                //System.out.println("Name: " + printName);
                System.out.println("Name: " + nameWithSpace);
                System.out.println("ID No.: " + printID);
                System.out.println("Section: " + printSection);
                System.out.println("CGPA: " + printCgpa);
                System.out.println("Is vaccinated?: " + printVaccine);
                StudentChoice studentChoice = new StudentChoice();
                studentChoice.choice(sID);
            }
            if(!valid)
            {
                System.out.println("ID No. is not correct! Please try again.");
                StudentChoice studentChoice = new StudentChoice();
                studentChoice.choice(sID);
            }
        }catch (FileNotFoundException e)
        {
            //System.out.println(e);
        }
    }

    /*void displayOwn(String id)
    {

    }*/
}
