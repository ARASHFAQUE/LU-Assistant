package oop;

import java.util.Scanner;

public class StudentChoice {
    // After signing in this page occurs which provides students to access information they want
    void choice(String id)  {
        int choice;
        while(true)
        {
            System.out.println("************* Please choose an option *************");
            System.out.println("1. Your Information");
            System.out.println("2. Other Student Information");
            System.out.println("3. Teacher Information");
            System.out.println("4. CR Information");
            System.out.println("5. Class Routine");
            System.out.println("6. Bus Schedule");
            System.out.println("7. Library Information");
            System.out.println("8. Home");

            System.out.print("Enter any option you like: ");
            Scanner input = new Scanner(System.in);
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    PrintOwnInformation printOwnInformation = new PrintOwnInformation();
                    printOwnInformation.displayOwn(id);
                    break;
                case 2:
                    PrintStudentInfo printStudentInfo = new PrintStudentInfo();
                    printStudentInfo.display(id);
                    break;
                case 3:
                    System.out.println("************* Please choose an option *************");
                    System.out.println("1. Search Teacher Information");
                    System.out.println("2. Display Teacher Information");

                    System.out.print("Enter any option you like: ");

                    choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            SearchTeacherInfo searchTeacherInformation = new SearchTeacherInfo();
                            searchTeacherInformation.SearchOrDisplayTeacherInfo();
                            break;
                        case 2:
                            SearchTeacherInfo displayTeacherInformation = new DisplayTeacherInfo();
                            displayTeacherInformation.SearchOrDisplayTeacherInfo();
                            break;
                        }
                    break;
                case 4:
                    System.out.println("************* Please choose an option *************");
                    System.out.println("1. Search CR Information");
                    System.out.println("2. Display CR Information");

                    System.out.print("Enter any option you like: ");

                    choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            ClassRepresentativeInformation searchClassRepresentativeInformation = new ClassRepresentativeInformation();
                            searchClassRepresentativeInformation.searchClassRepresentative();
                            break;
                        case 2:
                            ClassRepresentativeInformation displayClassRepresentativeInformation = new ClassRepresentativeInformation();
                            displayClassRepresentativeInformation.displayClassRepresentative();
                            break;
                    }
                    break;
                case 5:
                    RoutineBusSchedule routine = new RoutineBusSchedule();
                    routine.routine();
                    break;
                case 6:
                    RoutineBusSchedule busSchedule = new RoutineBusSchedule();
                    busSchedule.schedule();
                    break;
                case 7:
                    System.out.println("************* Please choose an option *************");
                    System.out.println("1. Library Membership Form");
                    System.out.println("2. Book Information");
                    System.out.println("3. Library Time");
                    System.out.println("4. Contact Library");

                    System.out.print("Enter any option you like: ");

                    choice = input.nextInt();
                    switch (choice)
                    {
                        case 1:
                            LibraryInformation libraryMembership = new LibraryInformation();
                            libraryMembership.libraryMembership();
                            break;
                        case 2:
                            System.out.println("************* Please choose an option *************");
                            System.out.println("1. Search Book Information");
                            System.out.println("2. Display Book Information");

                            System.out.print("Enter any option you like: ");

                            choice = input.nextInt();
                            switch (choice)
                            {
                                case 1:
                                    LibraryInformation searchLibraryInformation = new LibraryInformation();
                                    searchLibraryInformation.searchBookInformation();
                                    break;
                                case 2:
                                    /*LibraryInformation addLibraryInformation = new LibraryInformation();
                                    addLibraryInformation.addBookInformation();
                                    break;*/
                            }
                            break;
                        case 3:
                            LibraryInformation libraryTime = new LibraryInformation();
                            libraryTime.libraryTime();
                            break;
                        case 4:
                            Librarian librarian = new Librarian("Librarian",250);
                            SectionOfficer sectionOfficer = new SectionOfficer("Section Officer","so.libray@lus.ac.bd",251);
                            LibraryContact libraryContact = new LibraryContact(librarian,sectionOfficer,"librarian@lus.ac.bd");
                            libraryContact.libraryContact();
                            break;
                    }
                    break;
                case 8:
                    Home home = new Home();
                    home.startOfEverything();
                    break;
            }
        }
    }
}
