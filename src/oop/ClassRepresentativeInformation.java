package oop;

import java.io.*;
import java.util.Scanner;

public class ClassRepresentativeInformation {
    /**
     * This function is used to add information of newly enrolled CR at Leading University
     */
    void addClassRepresentativeInformation()
    {
        int numberOfClassRep;
        String crName="", crID="", crBatch="", crSection="", crNumber="", crMail="", name="", id="", batch="", section="", number="",mail="";
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
                }
                else
                {
                    String str = crName + " " + crID + " " + crBatch + " " + crSection + " " + crNumber + " " + crMail;
                    try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file5, true)))) {
                        pw.println(str);
                    }

                    System.out.println("CR Information added successfully.\n");
                }
            }



        }catch (Exception e){
            System.out.println("File not found!!.\n");
        }

    }

    /**
     * This function allows me to find information about CR by searching through batch and section.
     */

    void searchClassRepresentative()
    {
        String crBatch="", crSection="", name="", id="", batch="", section="", number="",mail="";
        try{
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
                        for (int i = 1; i < name.length(); i++)
                        {
                            char ch = name.charAt(i);
                            if(Character.isUpperCase(ch))
                            {
                                crNameWithSpace.append(" ");
                            }
                            crNameWithSpace.append(ch);
                        }

                        String str = "CR Name: "+crNameWithSpace+"\n"+"CR ID: "+id+"\n"+"Number: "+number+"\n"+"E-mail: "+mail+"\n";
                        System.out.println(str);
                        exists = true;
                    }
                }

                if (!exists) {
                    System.out.println("Record not found. Please try again....");
                }


        }catch(Exception e){
            System.out.println("Can't read file!!");

        }

    }

}
