package oop;

import java.io.*;
import java.util.*;

public class UpdateStudentInfo2 {
    void updateInfo2()
    {
        String id = "", name = "", birthDate = "", section = "", cgpa = "", payment = "", vaccine = "", str1 = "", str2 = "";
        try {
            File dir = new File("Files");
            //dir.mkdir();
            String path = dir.getAbsolutePath();
            File file2 = new File(path + "/studentInfo.txt");
            Scanner scanner = new Scanner(file2);
            BufferedReader file3 = new BufferedReader(new FileReader(file2));
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
                        name = "";
                        name = input.next();
                        break;
                    case 2:
                        System.out.print("Enter the updated birthdate in Day-Month-Year format: ");
                        birthDate = "";
                        birthDate = input.next();
                        break;
                    case 3:
                        System.out.print("Enter the updated section: ");
                        section = "";
                        section = input.next();
                        break;
                    case 4:
                        System.out.print("Enter the updated CGPA: ");
                        cgpa = "";
                        cgpa = input.next();
                        break;
                    case 5:
                        System.out.print("Payment Completed? : ");
                        payment = "";
                        payment = input.next();
                        break;
                    case 6:
                        System.out.print("Is vaccinated? : ");
                        vaccine = "";
                        vaccine = input.next();
                        break;
                }
                str2 = id + " " + name + " " + birthDate + " " + section + " " + cgpa + " " + payment + " " + vaccine;
                // logic to replace lines in the string
                inputStr = inputStr.replace(str1, str2);
                // write the new string with the replaced line OVER the same file
                FileOutputStream fileOut = new FileOutputStream(file2);
                fileOut.write(inputStr.getBytes());
                fileOut.close();
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
