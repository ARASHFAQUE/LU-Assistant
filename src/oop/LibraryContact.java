package oop;

/**
 * This classes provide Contact Information of Librarian and Section Officer.
 * The Aggregation concept is used here.
 * position1 means Librarian position.
 * position2 means Section Officer position.
 */

public class LibraryContact {

    Librarian librarian;
    SectionOfficer sectionOfficer;
    String librarianEmail;

    LibraryContact(Librarian librarian, SectionOfficer sectionOfficer, String librarianEmail)
    {
        this.librarian = librarian;
        this.sectionOfficer = sectionOfficer;
        this.librarianEmail = librarianEmail;
    }

    void libraryContact()
    {
        System.out.println("\n"+ librarian.position1);
        System.out.println("Email: "+ librarianEmail);
        System.out.println("Ext: "+ librarian.librarianExt);

        System.out.println("\n"+ sectionOfficer.position2);
        System.out.println("Email: "+ sectionOfficer.sectionOfficerEmail);
        System.out.println("Ext: "+ sectionOfficer.sectionOfficerExt+"\n");

    }

}

class Librarian {
    String position1;
    int librarianExt;
    Librarian(String position1, int librarianExt)
    {
        this.position1 = position1;
        this.librarianExt = librarianExt;
    }

}

class SectionOfficer {
    String position2, sectionOfficerEmail;
    int sectionOfficerExt;
    SectionOfficer(String position2, String sectionOfficerEmail, int sectionOfficerExt)
    {
        this.position2 = position2;
        this.sectionOfficerEmail = sectionOfficerEmail;
        this.sectionOfficerExt = sectionOfficerExt;
    }

}
