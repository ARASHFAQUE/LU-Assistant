package oop;

import java.io.File;

public class CreateFile {
    // This createFile function is used only when we need to create a new file to store data
    void createFile() {
        File dir = new File("Files");
        dir.mkdir();
        String path = dir.getAbsolutePath();

        File file1 = new File(path + "/usernameAndPassword.txt");
        File file2 = new File(path + "/studentInfo.txt");
        File file3 = new File(path + "/adminPanel.txt");
        File file4 = new File(path + "/teacherInfo.txt");
        try {
            file1.createNewFile();
            file2.createNewFile();
            file3.createNewFile();
            file4.createNewFile();
            System.out.println("Files are created.");
        } catch (Exception e) {
            //System.out.println(e);
        }
    }
}
