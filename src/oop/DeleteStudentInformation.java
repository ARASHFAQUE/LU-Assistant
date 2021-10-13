package oop;

import java.io.*;
import java.util.*;

public class DeleteStudentInformation {
    // This function allows me to delete information about Student by searching id.
    void deleteStudentInformation()
    {
        String id = "", name = "", birthDate = "", section = "", cgpa = "", payment = "", vaccine = "", str1 = "", str2 = "";
        try {
            File dir = new File("Files");

            String path = dir.getAbsolutePath();
            File file2 = new File(path + "/studentInfo.txt");
            Scanner scanner = new Scanner(file2);
            BufferedReader fileNew = new BufferedReader(new FileReader(file2));
            StringBuilder inputBuffer = new StringBuilder();
            String line;

            while ((line = fileNew.readLine()) != null) {
                inputBuffer.append(line);
                inputBuffer.append('\n');
            }
            fileNew.close();
            String inputStr = inputBuffer.toString();

            System.out.print("Enter the ID No. of the student you want to Delete: ");
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
                id= " ";
                name = " ";
                birthDate = " ";
                section = " ";
                cgpa = " ";
                payment = " ";
                vaccine = " ";

                str2 = id + " " + name + " " + birthDate + " " + section + " " + cgpa + " " + payment + " " + vaccine;

                inputStr = inputStr.replace(str1, str2);

                FileOutputStream fileOut = new FileOutputStream(file2);
                fileOut.write(inputStr.getBytes());
                fileOut.close();
                System.out.println("Student Information Delete.");
            }
            else
            {
                System.out.println("Invalid student ID. Try again.");
                deleteStudentInformation();
            }
        }catch (Exception e)
        {
            System.out.println("Can not read file.");
        }
    }
}
