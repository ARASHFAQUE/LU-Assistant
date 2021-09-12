package oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintOwnInformation {
    void displayOwn(String id)
    {
        String studentID = "", name = "", birthDate = "", section = "", cgpa = "", payment = "", vaccine = "";
        try {
            // In this file the information of enrolled students at Leading University are stored
            File file2 = new File("E:/Varsity/Semesters/Varsity-2_2/OOP/Project/Project-Practice/Files/studentInfo.txt");
            Scanner scanner = new Scanner(file2);
            boolean valid = false;
            while (scanner.hasNext())
            {
                studentID = scanner.next();
                if(id.equals(studentID))
                {
                    name = scanner.next();
                    birthDate = scanner.next();
                    section = scanner.next();
                    cgpa = scanner.next();
                    payment = scanner.next();
                    vaccine = scanner.next();
                    valid = true;
                    break;
                }
            }
            if(valid)
            {
                StringBuilder nameWithSpace = new StringBuilder();
                nameWithSpace.append(name.charAt(0));
                for (int i = 1; i < name.length(); i++)
                {
                    char ch = name.charAt(i);
                    if(Character.isUpperCase(ch))
                    {
                        nameWithSpace.append(" ");
                    }
                    nameWithSpace.append(ch);
                }
                //System.out.println("Name: " + printName);
                System.out.println("Name: " + nameWithSpace);
                System.out.println("Birthdate: " + birthDate);
                System.out.println("ID No.: " + id);
                System.out.println("Section: " + section);
                System.out.println("CGPA: " + cgpa);
                System.out.print("Payment completed?: " + payment);
                if(payment.equals("NO"))
                {
                    System.out.println(". If you paid already. Please wait! It will be updated soon.");
                }
                else
                {
                    System.out.println();
                }
                System.out.print("Is vaccinated?: " + vaccine);
                if(vaccine.equals("NO"))
                {
                    System.out.println(". If you took the vaccine already. Please wait! It will be updated soon.");
                }
                else
                {
                    System.out.println();
                }
            }
            if(!valid)
            {
                System.out.println("Information is not added yet! Will be added soon.");
                StudentChoice studentChoice = new StudentChoice();
                studentChoice.choice(id);
            }
        }catch (FileNotFoundException e)
        {
            System.out.println("Can not read file!!!");
        }
    }
}
