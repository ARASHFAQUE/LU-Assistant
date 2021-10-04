package oop;

import java.io.*;
import java.util.*;

public class PrintStudentInfo {
    // This function is used to print students information
    void display(String sID)
    {
        String studentID = "", name = "", birthDate = "", section = "", cgpa = "", payment = "", vaccine = "";
        try {
            // In this file the information of enrolled students at Leading University are stored
            File dir = new File("Files");
            //dir.mkdir();
            String path = dir.getAbsolutePath();
            File file2 = new File(path + "/studentInfo.txt");
            Scanner scanner = new Scanner(file2);
            Scanner input = new Scanner(System.in);
            System.out.print("Please enter the student ID: ");
            String id = input.next();
            input.nextLine();
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
                System.out.println("Name: " + nameWithSpace);
                System.out.println("ID No.: " + id);
                System.out.println("Section: " + section);
                System.out.println("CGPA: " + cgpa);
                System.out.println("Is vaccinated?: " + vaccine);
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
            System.out.println("Can not read file!!!");
        }
    }
}
