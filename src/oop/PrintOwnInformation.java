package oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintOwnInformation {
    void displayOwn(String id)
    {
        String studentID, name, birthDate, section, cgpa, payment, vaccine;
        try {
            // In this file the information of enrolled students at Leading University are stored
            File file2 = new File("E:/Varsity/Semesters/Varsity-2_2/OOP/Project/Project-Practice/Files/studentInfo.txt");
            Scanner scanner = new Scanner(file2);
            String printID = "", printName = "", printBirthDate = "", printSection = "", printCgpa = "", printPayment = "", printVaccine = "";
            boolean valid = false;
            while (scanner.hasNext())
            {
                studentID = scanner.next();
                if(id.equals(studentID))
                {
                    printID = "";
                    printName = "";
                    printBirthDate = "";
                    printSection = "";
                    printCgpa = "";
                    printPayment = "";
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
                    printBirthDate = birthDate;
                    printSection = section;
                    printCgpa = cgpa;
                    printPayment = payment;
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
                System.out.println("Birthdate: " + printBirthDate);
                System.out.println("ID No.: " + printID);
                System.out.println("Section: " + printSection);
                System.out.println("CGPA: " + printCgpa);
                System.out.println("Payment completed?: " + printPayment);
                System.out.println("Is vaccinated?: " + printVaccine);
            }
            if(!valid)
            {
                System.out.println("Information is not added yet! Will be added soon.");
                StudentChoice studentChoice = new StudentChoice();
                studentChoice.choice(id);
            }
        }catch (FileNotFoundException e)
        {
            //System.out.println(e);
        }
    }
}