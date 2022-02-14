package ru.io.file;

import java.io.File;
import java.io.IOException;

public class FileAPP {

    public static void main(String[] args) throws IOException {
        File f = new File("file/personDB.txt");

        if(f.exists()) {
            File parentDir = new File(f.getParent());

            System.out.println("Files in DIR (" + parentDir.getName() + ") found: ");
            for (File cur : parentDir.listFiles(new MyFileNameFilter())) {
                System.out.print(cur.getName());

                if(cur.isDirectory()) {
                    System.out.println("  Представлен каталог");
                }  else
                    System.out.println("  Представлен файл");
            }
        } else {
            System.out.println("File created: " + f.getName());
            f.createNewFile();
        }

    }
}
