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

                    String str = "Book Name: "+bookNameWithSpace+"\n"+"Author Name: "+author+"\n"+"Book Category: "+category+"\n"+"Book Edition: "+edition+"\n";
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

    /**
     * This function provide Time schedule of Central Library, Leading University.
     */

    void libraryTime()
    {
        System.out.println("\nSunday to Friday: 9.00 am to 5.00 pm\nSaturday: 11.00 am to 5.00 pm\nNB: Check-out time from the library is 15 minutes prior to the library closes.\n");
    }


}
