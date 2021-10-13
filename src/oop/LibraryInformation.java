package oop;

import java.io.*;
import java.util.Scanner;

public class LibraryInformation {
    /**
     * This function provide Library membership form.
     */

    void libraryMembership()
    {
        System.out.println("\nClick here to download Library Membership Form.\n");
    }

    /**
     * This function is used to add information of newly enrolled Book at Central Library, Leading University
     */

    void addBookInformation()
    {
        int numberOfBook;
        String bookName = "", authorName = "", bookCategory = "", bookEdition="", name = "", author = "", category = "", edition= "" ;
        try{
            File dir = new File("Files");
            String path = dir.getAbsolutePath();
            File file6 = new File(path + "/bookInfo.txt");

            Scanner scanner = new Scanner(file6);
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the number of Book: ");
            numberOfBook = input.nextInt();
            System.out.print("\n");

            for (int i=1; i <= numberOfBook; i++)
            {
                System.out.println("Enter the information of Book no. " + i + ": ");

                System.out.print("Enter the Book Name: ");
                bookName = input.next();

                System.out.print("Enter the Author Name: ");
                authorName = input.next();

                System.out.print("Enter the Book Category: ");
                bookCategory = input.next();

                System.out.print("Enter the Book Edition: ");
                bookEdition = input.next();

                boolean exists = false;
                while (scanner.hasNext())
                {
                    name = scanner.next();
                    author = scanner.next();
                    category = scanner.next();
                    edition = scanner.next();

                    if(name.equalsIgnoreCase(bookName) && author.equalsIgnoreCase(authorName))
                    {
                        exists = true;
                        break;
                    }

                }
                if (exists)
                {
                    System.out.println("This information already exists. Please try again......");
                    i--;
                }
                else
                {
                    String str = bookName+" "+authorName+" "+bookCategory+" "+bookEdition;
                    try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file6, true)))) {
                        pw.println(str);
                    }
                    System.out.println("Book Information added successfully.\n");
                }
            }


        }catch(Exception e){
            System.out.println("File not found!!!.\n");

        }

    }

    /**
     * This function allows me to find information about Book by searching through Book category.
     */

    void searchBookInformation()
    {
        String bookCategory = "", name = "", author = "", category = "", edition= "" ;
        try{
            File dir = new File("Files");
            String path = dir.getAbsolutePath();
            File file6 = new File(path + "/bookInfo.txt");

            Scanner scanner = new Scanner(file6);
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the Book Category: ");
            bookCategory = input.next();
            System.out.print("\n");

            boolean found = false;
            while (scanner.hasNext())
            {
                name = scanner.next();
                author = scanner.next();
                category = scanner.next();
                edition = scanner.next();

                if(category.equalsIgnoreCase(bookCategory))
                {
                    StringBuilder bookNameWithSpace = new StringBuilder();
                    bookNameWithSpace.append(name.charAt(0));
                    for (int i = 1; i < name.length(); i++) {
                        char ch = name.charAt(i);
                        if (Character.isUpperCase(ch)) {
                            bookNameWithSpace.append(" ");
                        }
                        bookNameWithSpace.append(ch);
                    }

                    String str = "\nBook Name: "+bookNameWithSpace+"\n"+"Author Name: "+author+"\n"+"Book Category: "+category+"\n"+"Book Edition: "+edition+"\n";
                    System.out.println(str);
                    found = true;

                }
            }
            if (!found)
            {
                System.out.println("Record not found. Please try again....");
            }

        }catch (Exception e){
            System.out.println("Can't read file!!");

        }

    }

    // This function allows me to display the all Book information.

    void displayBookInformation()
    {
        String name = "", author = "", category = "", edition= "" ;
        try{
            File dir = new File("Files");
            String path = dir.getAbsolutePath();
            File file6 = new File(path + "/bookInfo.txt");

            Scanner scanner = new Scanner(file6);
            Scanner input = new Scanner(System.in);

            boolean found = false;
            while (scanner.hasNext())
            {
                name = scanner.next();
                author = scanner.next();
                category = scanner.next();
                edition = scanner.next();

                    StringBuilder bookNameWithSpace = new StringBuilder();
                    bookNameWithSpace.append(name.charAt(0));
                    for (int i = 1; i < name.length(); i++) {
                        char ch = name.charAt(i);
                        if (Character.isUpperCase(ch)) {
                            bookNameWithSpace.append(" ");
                        }
                        bookNameWithSpace.append(ch);
                    }

                    String str = "\nBook Name: "+bookNameWithSpace+"\n"+"Author Name: "+author+"\n"+"Book Category: "+category+"\n"+"Book Edition: "+edition+"\n";
                    System.out.println(str);
                    found = true;

                }

            if(found)
            {
                System.out.println("Display successfully");
            }

        }catch(Exception e){
            System.out.println("Can't read file!!");
        }
    }


}

// Abstract class

abstract class UpdateBook{
    // Abstract method (does not have a body)
    abstract void deleteBookInformation();

    /**
     * Regular method
     * This function allows me to update information about Book by searching through Book category and name
     */
    void updateBookInformation()
    {
        String bookName = "", bookCategory = "", name = "", author = "", category = "", edition= "", str1 = "", str2 = "" ;
        try{
            File dir = new File("Files");
            String path = dir.getAbsolutePath();
            File file6 = new File(path + "/bookInfo.txt");

            Scanner scanner = new Scanner(file6);
            StringBuilder inputBuffer;
            try (BufferedReader newFile = new BufferedReader(new FileReader(file6))) {
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
            System.out.print("Enter the Category you wanna update: ");
            String newCategory = input.next();

            System.out.print("Enter the Name you wanna update: ");
            String newName = input.next();

            boolean found = false;

            while (scanner.hasNext())
            {
                name = scanner.next();
                author = scanner.next();
                category = scanner.next();
                edition = scanner.next();

                if(category.equalsIgnoreCase(newCategory) && name.equalsIgnoreCase(newName))
                {
                    str1 = name+" "+author+" "+category+" "+edition;
                    found = true;
                    break;
                }
            }

            if (found) {
                System.out.println("************* Please choose an option *************");
                System.out.println("*************What do you wanna update?*************");
                System.out.println("1. Book Name");
                System.out.println("2. Author Name");
                System.out.println("3. Edition");
                System.out.println("Please choose any option you like: ");

                int choice = input.nextInt();
                System.out.print("\n");
                switch (choice) {
                    case 1:
                        System.out.println("Enter the updated Book Name: ");
                        name = input.next();
                        break;
                    case 2:
                        System.out.println("Enter the updated Author Name: ");
                        author = input.next();
                        break;
                    case 3:
                        System.out.println("Enter the updated Edition: ");
                        edition = input.next();
                        break;
                }

                str2 = name+" "+author+" "+category+" "+edition;

                inputStr = inputStr.replace(str1, str2);
                try (FileOutputStream fileOut = new FileOutputStream(file6)) {
                    fileOut.write(inputStr.getBytes());
                    fileOut.close();
                }

                System.out.println("Book Information Updated.\n");
            } else {
                System.out.println("Invalid Number. Please Try again.......\n");
                updateBookInformation();
            }


        }catch(Exception e){
            System.out.println("Can't read file!!");
        }
    }

}

// Sub class (inherit from UpdateBook)
class DeleteBook extends UpdateBook{

    void deleteBookInformation()
    {
        // The body of deleteBookInformation() is provided here
        String bookName = "", bookCategory = "", name = "", author = "", category = "", edition= "", str1 = "", str2 = "" ;
        try{
            File dir = new File("Files");
            String path = dir.getAbsolutePath();
            File file6 = new File(path + "/bookInfo.txt");

            Scanner scanner = new Scanner(file6);
            StringBuilder inputBuffer;
            try (BufferedReader newFile = new BufferedReader(new FileReader(file6))) {
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
            System.out.print("Enter the Category you wanna delete: ");
            String newCategory = input.next();

            System.out.print("Enter the Name you wanna delete: ");
            String newName = input.next();

            boolean found = false;

            while (scanner.hasNext())
            {
                name = scanner.next();
                author = scanner.next();
                category = scanner.next();
                edition = scanner.next();

                if(category.equalsIgnoreCase(newCategory) && name.equalsIgnoreCase(newName))
                {
                    str1 = name+" "+author+" "+category+" "+edition;
                    found = true;
                    break;
                }
            }

            if (found)
            {
                name = " ";
                author = " ";
                category = " ";
                edition = " ";

                str2 = name+" "+author+" "+category+" "+edition;

                inputStr = inputStr.replace(str1, str2);
                try (FileOutputStream fileOut = new FileOutputStream(file6)) {
                    fileOut.write(inputStr.getBytes());
                    fileOut.close();
                }

                System.out.println("Book Information Deleted.\n");
            } else {
                System.out.println("Invalid Number. Please Try again.......\n");
                deleteBookInformation();
            }


        }catch(Exception e){
            System.out.println("File not found!!");

        }

    }
}

class LibraryTime{

    // This function provide Time schedule of Central Library, Leading University.

    void libraryTime()
    {
        System.out.println("\n"+"Sunday to Friday: 9.00 am to 5.00 pm");
        System.out.println("Saturday: 11.00 am to 5.00 pm");
        System.out.println("NB: Check-out time from the library is 15 minutes prior to the library closes.\n");
    }
}
