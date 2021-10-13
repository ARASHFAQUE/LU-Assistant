package oop;

import java.io.*;
import java.util.Scanner;

// Interface
interface CRInfo{
    // Interface method (does not have a body)
    public void addClassRepresentative();
    public void searchClassRepresentative();
    public void displayClassRepresentative();
    public void updateClassRepresentative();
    public void deleteClassRepresentative();

}

/**
 * ClassRepresentativeInfo implements the CRInfo interface
 */
public class ClassRepresentativeInfo implements CRInfo {
    /**
     * This function is used to add information of newly enrolled CR at Leading University
     */

    public void addClassRepresentative() {
        int numberOfClassRep;

        String crName = "", crID = "", crBatch = "", crSection = "", crNumber = "", crMail = "", name = "", id = "", batch = "", section = "", number = "", mail = "";
        try {
            File dir = new File("Files");
            String path = dir.getAbsolutePath();
            File file5 = new File(path + "/CRInfo.txt");

            Scanner scanner = new Scanner(file5);
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the number of CR: ");
            numberOfClassRep = input.nextInt();
            System.out.print("\n");

            for (int i = 1; i <= numberOfClassRep; i++) {

                System.out.println("Enter the information of CR no. " + i + ": ");

                System.out.print("Enter the CR Name: ");
                crName = input.next();

                System.out.print("Enter the CR ID: ");
                crID = input.next();

                System.out.print("Enter the CR Batch: ");
                crBatch = input.next();

                System.out.print("Enter the CR Section: ");
                crSection = input.next();

                System.out.print("Enter the CR Number: ");
                crNumber = input.next();

                System.out.print("Enter the CR E-mail: ");
                crMail = input.next();

                boolean exists = false;
                while (scanner.hasNext()) {
                    name = scanner.next();
                    id = scanner.next();
                    batch = scanner.next();
                    section = scanner.next();
                    number = scanner.next();
                    mail = scanner.next();

                    if (id.equals(crID)) {
                        exists = true;
                        break;
                    }
                }

                if (exists) {
                    System.out.println("This information already exists. Please try again......");
                    i--;
                } else {
                    String str = crName + " " + crID + " " + crBatch + " " + crSection + " " + crNumber + " " + crMail;
                    try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file5, true)))) {
                        pw.println(str);
                    }

                    System.out.println("CR Information added successfully.\n");
                }
            }


        } catch (Exception e) {
            System.out.println("File not found!!.\n");
        }

    }

    /**
     * This function allows me to find information about CR by searching through batch and section.
     */

    public void searchClassRepresentative()
    {
        String crBatch = "", crSection = "", name = "", id = "", batch = "", section = "", number = "", mail = "";
        try {
            File dir = new File("Files");
            String path = dir.getAbsolutePath();
            File file5 = new File(path + "/CRInfo.txt");

            Scanner scanner = new Scanner(file5);
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the CR Batch: ");
            crBatch = input.next();

            System.out.print("Enter the CR Section: ");
            crSection = input.next();

            System.out.print("\n");

            boolean exists = false;
            while (scanner.hasNext()) {
                name = scanner.next();
                id = scanner.next();
                batch = scanner.next();
                section = scanner.next();
                number = scanner.next();
                mail = scanner.next();

                if (batch.equals(crBatch) && section.equalsIgnoreCase(crSection)) {

                    StringBuilder crNameWithSpace = new StringBuilder();
                    crNameWithSpace.append(name.charAt(0));
                    for (int i = 1; i < name.length(); i++) {
                        char ch = name.charAt(i);
                        if (Character.isUpperCase(ch)) {
                            crNameWithSpace.append(" ");
                        }
                        crNameWithSpace.append(ch);
                    }

                    String str = "CR Name: " + crNameWithSpace + "\n" + "CR ID: " + id + "\n" + "Number: " + number + "\n" + "E-mail: " + mail + "\n";
                    System.out.println(str);
                    exists = true;
                }
            }

            if (!exists) {
                System.out.println("Record not found. Please try again....");
            }


        } catch (Exception e) {
            System.out.println("Can't read file!!");

        }

    }



    /**
     * This function allows me to display the all CR information.
     */

    public void displayClassRepresentative() {
        String name = "", id = "", batch = "", section = "", number = "", mail = "";
        try {
            File dir = new File("Files");
            String path = dir.getAbsolutePath();
            File file5 = new File(path + "/CRInfo.txt");

            Scanner scanner = new Scanner(file5);
            Scanner input = new Scanner(System.in);


            boolean exists = false;
            while (scanner.hasNext()) {
                name = scanner.next();
                id = scanner.next();
                batch = scanner.next();
                section = scanner.next();
                number = scanner.next();
                mail = scanner.next();

                StringBuilder crNameWithSpace = new StringBuilder();
                crNameWithSpace.append(name.charAt(0));
                for (int i = 1; i < name.length(); i++) {
                    char ch = name.charAt(i);
                    if (Character.isUpperCase(ch)) {
                        crNameWithSpace.append(" ");
                    }
                    crNameWithSpace.append(ch);
                }

                String str = "\nCR Name: " + crNameWithSpace + "\n" + "CR ID: " + id + "\n"+ "Batch: "+ batch+ "\n"+ "Section: " +section+ "\n" + "Number: " + number + "\n" + "E-mail: " + mail + "\n";
                System.out.println(str);
                exists = true;
            }

            if (exists) {
                System.out.println("Display Successfully.\n");
            }


        } catch (Exception e) {
            System.out.println("Can't read file!!");

        }

    }

    /**
     * This function allows me to update information about CR by searching through ID.
     */

    public void updateClassRepresentative() {
        String name = "", id = "", batch = "", section = "", number = "", mail = "", str1 = "", str2 = "";
        try {
            File dir = new File("Files");
            String path = dir.getAbsolutePath();
            File file5 = new File(path + "/CRInfo.txt");

            Scanner scanner = new Scanner(file5);

            StringBuilder inputBuffer;
            try (BufferedReader newFile = new BufferedReader(new FileReader(file5))) {
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
            System.out.print("Enter the ID you wanna update: ");
            String newID = input.next();
            input.nextLine();

            boolean found = false;

            while (scanner.hasNext()) {
                name = scanner.next();
                id = scanner.next();
                batch = scanner.next();
                section = scanner.next();
                number = scanner.next();
                mail = scanner.next();

                if (id.equals(newID)) {
                    str1 = name + " " + id + " " + batch + " " + section + " " + number + " " + mail;
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("************* Please choose an option *************");
                System.out.println("*************What do you wanna update?*************");
                System.out.println("1. Name");
                System.out.println("2. ID");
                System.out.println("3. Batch");
                System.out.println("4. Section");
                System.out.println("5. Number");
                System.out.println("6. E-mail");
                System.out.println("Please choose any option you like: ");

                int choice = input.nextInt();
                System.out.print("\n");
                switch (choice) {
                    case 1:
                        System.out.println("Enter the updated Name: ");
                        name = input.next();
                        break;
                    case 2:
                        System.out.println("Enter the updated ID: ");
                        id = input.next();
                        break;
                    case 3:
                        System.out.println("Enter the updated Batch: ");
                        batch = input.next();
                        break;
                    case 4:
                        System.out.println("Enter the updated Section: ");
                        section = input.next();
                        break;
                    case 5:
                        System.out.println("Enter the updated Number: ");
                        number = input.next();
                        break;
                    case 6:
                        System.out.println("Enter the updated E-mail: ");
                        mail = input.next();
                        break;
                }

                str2 = name + " " + id + " " + batch + " " + section + " " + number + " " + mail;

                inputStr = inputStr.replace(str1, str2);
                try (FileOutputStream fileOut = new FileOutputStream(file5)) {
                    fileOut.write(inputStr.getBytes());
                    fileOut.close();
                }

                System.out.println("CR Information Updated.\n");
            } else {
                System.out.println("Invalid Number. Please Try again.......\n");
                updateClassRepresentative();
            }


        } catch (Exception e) {

            System.out.println("File not found!!.\n");
        }

    }

    /**
     * This function allows me to delete information about CR by searching id.
     */

    public void deleteClassRepresentative() {
        String name = "", id = "", batch = "", section = "", number = "", mail = "", str1 = "", str2 = "";
        try {
            File dir = new File("Files");
            String path = dir.getAbsolutePath();
            File file5 = new File(path + "/CRInfo.txt");

            Scanner scanner = new Scanner(file5);

            StringBuilder inputBuffer;
            try (BufferedReader newFile = new BufferedReader(new FileReader(file5))) {
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
            System.out.print("Enter the ID you wanna delete: ");
            String newID = input.next();
            input.nextLine();

            boolean found = false;

            while (scanner.hasNext()) {
                name = scanner.next();
                id = scanner.next();
                batch = scanner.next();
                section = scanner.next();
                number = scanner.next();
                mail = scanner.next();

                if (id.equals(newID)) {
                    str1 = name + " " + id + " " + batch + " " + section + " " + number + " " + mail;
                    found = true;
                    break;
                }
            }

            if (found) {
                name = " ";
                id = " ";
                batch = " ";
                section = " ";
                number = " ";
                mail = " ";

                str2 = name + " " + id + " " + batch + " " + section + " " + number + " " + mail;

                inputStr = inputStr.replace(str1, str2);
                try (FileOutputStream fileOut = new FileOutputStream(file5)) {
                    fileOut.write(inputStr.getBytes());
                    fileOut.close();
                }

                System.out.println("CR Information Deleted.\n");

            }else
            {
                System.out.println("Invalid Number. Please Try again.......\n");
                deleteClassRepresentative();
            }


        } catch (Exception e) {
            System.out.println("File not found!!.\n");

        }
    }
}







