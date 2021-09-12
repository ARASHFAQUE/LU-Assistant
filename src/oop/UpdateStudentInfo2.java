package oop;

import java.io.*;
import java.util.Scanner;

public class UpdateStudentInfo2 {
    void updateInfo2()
    {
        String id, name, birthDate, section, cgpa, payment, vaccine, str1 = "", str2 = "";
        try {
            File file2 = new File("E:/Varsity/Semesters/Varsity-2_2/OOP/Project/Project-Practice/Files/studentInfo.txt");
            Scanner scanner = new Scanner(file2);
            BufferedReader file3 = new BufferedReader(new FileReader("E:/Varsity/Semesters/Varsity-2_2/OOP/Project/Project-Practice/Files/studentInfo.txt"));
            StringBuilder inputBuffer = new StringBuilder();
            String line;

            while ((line = file3.readLine()) != null) {
                inputBuffer.append(line);
                inputBuffer.append('\n');
            }
            file3.close();
            String inputStr = inputBuffer.toString();

            System.out.print("Enter the ID No. of the student you want to update: ");
            Scanner input = new Scanner(System.in);
            String newID = input.next();
            input.nextLine();
            String updatedID = "", updatedName = "", updatedBirthDate = "", updatedSection = "", updatedCgpa = "", updatedPayment = "", updatedVaccine = "";
            boolean found = false;
            while (scanner.hasNext())
            {
                id = scanner.next();
                if(id.equals(newID))
                {
                    name = scanner.next();
                    birthDate = scanner.next();
                    section = scanner.next();
                    cgpa = scanner.next();
                    payment = scanner.next();
                    vaccine = scanner.next();
                    str1 = id + " " + name + " " + birthDate + " " + section + " " + cgpa + " " + payment + " " + vaccine;
                    updatedID = id;
                    updatedName = name;
                    updatedBirthDate = birthDate;
                    updatedSection = section;
                    updatedCgpa = cgpa;
                    updatedPayment = payment;
                    updatedVaccine = vaccine;
                    found = true;
                    break;
                }
            }
            if(found)
            {
                // This gives options what the admin want to update
                System.out.println("************* What do you want to update? *************");
                System.out.println("1. Name? ");
                System.out.println("2. Birthdate? ");
                System.out.println("3. Section? ");
                System.out.println("4. CGPA? ");
                System.out.println("5. Is payment completed or not? ");
                System.out.println("6. Is vaccinated or not? ");

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
                        System.out.print("Enter the updated birthdate in Day-Month-Year format: ");
                        updatedBirthDate = "";
                        updatedBirthDate = input.next();
                        break;
                    case 3:
                        System.out.print("Enter the updated section: ");
                        updatedSection = "";
                        updatedSection = input.next();
                        break;
                    case 4:
                        System.out.print("Enter the updated CGPA: ");
                        updatedCgpa = "";
                        updatedCgpa = input.next();
                        break;
                    case 5:
                        System.out.print("Payment Completed? : ");
                        updatedPayment = "";
                        updatedPayment = input.next();
                        break;
                    case 6:
                        System.out.print("Is vaccinated? : ");
                        updatedVaccine = "";
                        updatedVaccine = input.next();
                        break;
                }
                //System.out.println("Updated Section: " + updatedSection);
                str2 = updatedID + " " + updatedName + " " + updatedBirthDate + " " + updatedSection + " " + updatedCgpa + " " + updatedPayment + " " + updatedVaccine;
                // logic to replace lines in the string
                inputStr = inputStr.replace(str1, str2);
                // write the new string with the replaced line OVER the same file
                FileOutputStream fileOut = new FileOutputStream("E:/Varsity/Semesters/Varsity-2_2/OOP/Project/Project-Practice/Files/studentInfo.txt");
                fileOut.write(inputStr.getBytes());
                fileOut.close();
                /*PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file2, true)));
                out.println(str2);
                out.close();*/
                System.out.println("Student Information Updated.");
            }
            else
            {
                System.out.println("Invalid student ID. Try again.");
                updateInfo2();
            }
        }catch (Exception e)
        {
            System.out.println("Can not read file.");
        }
    }
}
