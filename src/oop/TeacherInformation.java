package oop;

import java.io.*;
import java.util.*;

/**
 * This class is Teacher information class.
 */
public class TeacherInformation {

    int numberOfTeacher;

    /**
     * This function is used to add information of newly enrolled Teacher at Leading University.
     */
    void addTeacherInformation()
    {

        String teacherName = "", teacherFaculty = "", teacherPosition = "", teacherNumber = "", teacherMail = "", tVaccine="" , name = "", faculty = "", position = "", number = "", mail = "", vaccine="";
        try {
            File dir = new File("Files");
            String path = dir.getAbsolutePath();
            File file4 = new File(path + "/teacherInfo.txt");

            Scanner scanner = new Scanner(file4);
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the number of Teacher: ");
            numberOfTeacher = input.nextInt();

            for (int i = 1; i <= numberOfTeacher; i++) {

                System.out.println("Enter the information of Teacher no. " + i + ": ");

                System.out.print("Enter the Teacher Name: ");
                teacherName = input.next();

                System.out.print("Enter the Faculty: ");
                teacherFaculty = input.next();

                System.out.print("Enter the Position: ");
                teacherPosition = input.next();

                System.out.print("Enter the Teacher number: ");
                teacherNumber = input.next();

                System.out.print("Enter the Teacher Mail: ");
                teacherMail = input.next();

                System.out.print("Is Vaccinated? ");
                tVaccine = input.next();

                boolean exists = false;
                while (scanner.hasNext()) {
                    name = scanner.next();
                    faculty = scanner.next();
                    position = scanner.next();
                    number = scanner.next();
                    mail = scanner.next();
                    vaccine = scanner.next();

                    if (number.equals(teacherNumber)) {
                        exists = true;
                        break;
                    }
                }

                if (exists) {
                    System.out.println("This information already exists. Please try again......");
                    i--;
                }
                else
                {
                    String str = teacherName + " " + teacherFaculty + " " + teacherPosition + " " + teacherNumber + " " + teacherMail+ " " + tVaccine;
                    try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file4, true)))) {
                        pw.println(str);
                    }

                    System.out.println("Information added successfully.\n");
                }
            }

        }catch(Exception e){
            System.out.println("File not found!!!");

        }
    }

    /**
     * This function allows me to update information about Teacher by searching through Email.
     */

    static void updateTeacherInformation()
    {
        String name="", faculty="", position="", number="", mail="", vaccine="",str1="",str2="";
        try{
            File dir = new File("Files");
            String path = dir.getAbsolutePath();
            File file4 = new File(path + "/teacherInfo.txt");

            Scanner scanner = new Scanner(file4);

            StringBuilder inputBuffer;
            try (BufferedReader newFile = new BufferedReader(new FileReader(file4))) {
                inputBuffer = new StringBuilder();
                String line;
                while ((line = newFile.readLine()) != null) {
                    inputBuffer.append(line);
                    inputBuffer.append('\n');
                }
                newFile.close();
            }
            String inputStr = inputBuffer.toString();

            Scanner input = new Scanner(System.in);
            System.out.print("Enter the E-mail you wanna update: ");
            String newMail = input.next();
            input.nextLine();

            boolean found = false;
            while (scanner.hasNext())
            {
                name = scanner.next();
                faculty = scanner.next();
                position = scanner.next();
                number = scanner.next();
                mail = scanner.next();
                vaccine = scanner.next();

                if (mail.equals(newMail)) {
                    str1 = name + " " + faculty + " " + position + " " + number + " " + mail + " " + vaccine;
                    found = true;
                    break;
                }
            }

            if(found)
            {
                System.out.println("************* Please choose an option *************");
                System.out.println("*************What do you wanna update?*************");
                System.out.println("1. Name");
                System.out.println("2. Faculty");
                System.out.println("3. Position");
                System.out.println("4. Number");
                System.out.println("5. Vaccine Status");
                System.out.println("Please choose any option you like: ");

                int choice = input.nextInt();
                System.out.print("\n");
                switch (choice) {
                    case 1:
                        System.out.println("Enter the updated Name: ");
                        name = input.next();
                        break;
                    case 2:
                        System.out.println("Enter the updated Faculty: ");
                        faculty = input.next();
                        break;
                    case 3:
                        System.out.println("Enter the updated Position: ");
                        position = input.next();
                        break;
                    case 4:
                        System.out.println("Enter the updated Number: ");
                        number = input.next();
                        break;
                    case 5:
                        System.out.println("Enter the updated Vaccine status: ");
                        vaccine = input.next();
                        break;
                }

                str2 = name+" "+faculty+" "+position+" "+number+" "+mail+" "+vaccine;

                inputStr = inputStr.replace(str1, str2);
                try (FileOutputStream fileOut = new FileOutputStream(file4)) {
                    fileOut.write(inputStr.getBytes());
                    fileOut.close();
                }

                System.out.println("Teacher Information Updated.\n");
            }
            else
            {
                System.out.println("Invalid Number. Please Try again.......\n");
                updateTeacherInformation();
            }




        }catch (Exception e){
            System.out.println("File not found!!!");
        }
    }

    /**
     * This function allows me to Delete information about Teacher by searching through Email.
     */

    static void deleteTeacherInformation()
    {
        String name="", faculty="", position="", number="", mail="", vaccine="",str1="",str2="";
        try{
            File dir = new File("Files");
            String path = dir.getAbsolutePath();
            File file4 = new File(path + "/teacherInfo.txt");

            Scanner scanner = new Scanner(file4);

            StringBuilder inputBuffer;
            try (BufferedReader newFile = new BufferedReader(new FileReader(file4))) {
                inputBuffer = new StringBuilder();
                String line;
                while ((line = newFile.readLine()) != null) {
                    inputBuffer.append(line);
                    inputBuffer.append('\n');
                }
                newFile.close();
            }
            String inputStr = inputBuffer.toString();

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the E-mail you wanna Delete: ");
            String newMail = input.next();
            input.nextLine();

            boolean found = false;
            while (scanner.hasNext())
            {
                name = scanner.next();
                faculty = scanner.next();
                position = scanner.next();
                number = scanner.next();
                mail = scanner.next();
                vaccine = scanner.next();

                if (mail.equals(newMail)) {
                    str1 = name + " " + faculty + " " + position + " " + number + " " + mail + " " + vaccine;
                    found = true;
                    break;
                }
            }

            if(found)
            {
                name = " ";
                faculty = " ";
                position = " ";
                number = " ";
                mail = " ";
                vaccine = " ";

                str2 = name+" "+faculty+" "+position+" "+number+" "+mail+" "+vaccine;

                inputStr = inputStr.replace(str1, str2);
                try (FileOutputStream fileOut = new FileOutputStream(file4)) {
                    fileOut.write(inputStr.getBytes());
                    fileOut.close();
                }

                System.out.println("Teacher Information Deleted.\n");
            }
            else
            {
                System.out.println("Invalid Number. Please Try again.......\n");
                deleteTeacherInformation();
            }



        }catch (Exception e){
            System.out.println("File not found!!!");
        }
    }


}

/**
 * This class is sub class of TeacherInformation class.
 * This class is parent class of DisplayTeacherInfo class.
 * The Method Overriding in Polymorphism concept is used here.
 */

class SearchTeacherInfo{

    /**
     * This function allows me to find information about Teacher by searching through Faculty.
     */
    void SearchOrDisplayTeacherInfo()
    {
        String teacherFaculty, name, faculty, position, number, mail, vaccine;
        try{
            File dir = new File("Files");
            String path = dir.getAbsolutePath();
            File file4 = new File(path + "/teacherInfo.txt");

            Scanner scanner = new Scanner(file4);
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the Faculty: ");
            teacherFaculty = input.next();
            System.out.print("\n");

            boolean found = false;

            while(scanner.hasNext())
            {
                name = scanner.next();
                faculty = scanner.next();
                position = scanner.next();
                number = scanner.next();
                mail = scanner.next();
                vaccine = scanner.next();
                if (teacherFaculty.equalsIgnoreCase(faculty))
                {
                    StringBuilder teacherNameWithSpace = new StringBuilder();
                    teacherNameWithSpace.append(name.charAt(0));
                    for (int i = 1; i < name.length(); i++)
                    {
                        char ch = name.charAt(i);
                        if(Character.isUpperCase(ch))
                        {
                            teacherNameWithSpace.append(" ");
                        }
                        teacherNameWithSpace.append(ch);
                    }

                    String str = "Teacher Name: "+teacherNameWithSpace+"\n"+"Faculty: "+faculty+"\n"+"Position: "+position+"\n"+"Number: "+number+"\n"+"E-mail: "+mail+"\n"+"Is Vaccinated? "+vaccine+"\n";
                    System.out.println(str);
                    found=true;

                }
            }

            if(!found)
            {
                System.out.println("Record not found. Please try again....\n");
            }

        }catch (Exception e){
            System.out.println("Can't read file!!!");
        }

    }
}

/**
 *This class is Child class of SearchTeacherInfo class.
 */
class DisplayTeacherInfo extends SearchTeacherInfo{

    /**
     * This function allows me to display the all Teacher information.
     */

    @Override
    void SearchOrDisplayTeacherInfo()
    {
        String teacherFaculty, name, faculty, position, number, mail, vaccine;
        try{
            File dir = new File("Files");
            String path = dir.getAbsolutePath();
            File file4 = new File(path + "/teacherInfo.txt");

            Scanner scanner = new Scanner(file4);
            Scanner input = new Scanner(System.in);

            boolean found = false;

            while(scanner.hasNext())
            {
                name = scanner.next();
                faculty = scanner.next();
                position = scanner.next();
                number = scanner.next();
                mail = scanner.next();
                vaccine = scanner.next();

                StringBuilder teacherNameWithSpace = new StringBuilder();
                teacherNameWithSpace.append(name.charAt(0));
                for (int i = 1; i < name.length(); i++) {
                    char ch = name.charAt(i);
                    if (Character.isUpperCase(ch)) {
                        teacherNameWithSpace.append(" ");
                    }
                    teacherNameWithSpace.append(ch);
                }
                System.out.print("\n");
                String str = "Teacher Name: "+teacherNameWithSpace+"\n"+"Faculty: "+faculty+"\n"+"Position: "+position+"\n"+"Number: "+number+"\n"+"E-mail: "+mail+"\n"+"Is Vaccinated? "+vaccine;
                System.out.println(str);
                found=true;

            }


            if(found)
            {
                System.out.println("\nDisplay Successfully.\n");
            }

        }catch (Exception e){
            System.out.println("Can't read file!!!");
        }

    }
}
