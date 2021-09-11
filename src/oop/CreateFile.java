package oop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class CreateFile {
    void createFile() {
        File dir = new File("Files");
        dir.mkdir();
        String path = dir.getAbsolutePath();

        File file1 = new File(path + "/usernameAndPassword.txt");
        File file2 = new File(path + "/studentInfo.txt");
        File file3 = new File(path + "/adminPanel.txt");
        try {
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
            System.out.println("Files are created.");
        } catch (Exception e) {
            //System.out.println(e);
        }
    }
    /*void forUpdate(String name)
    {
        File dir = new File("Files");
        dir.mkdir();
        String path = dir.getAbsolutePath();

        File file3 = new File(path + "/" + name + ".txt");
        try {
            file3.createNewFile();
            System.out.println("File is created.");
        } catch (Exception e) {
            //System.out.println(e);
        }
    }*/
    /*void updateAndDelete()
    {
        CreateFile createFile = new CreateFile();
        createFile.createFile();
        createFile.forUpdate();

    }*/
}
