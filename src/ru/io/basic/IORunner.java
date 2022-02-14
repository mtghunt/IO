package ru.io.basic;

import java.io.*;

public class IORunner {

    public static void main(String[] args) throws IOException {


        FileReader fr = null;

        FileWriter fw = null;

        try {

            File f = new File("file/personDB.txt");

            // читаем файл
            fr = new FileReader(f);
            StringBuilder s = new StringBuilder();

            int i = 0;
            while ( (i = fr.read()) != -1) {
                s.append((char)i);
            }

            // выводи файл
            System.out.println(s);

            // записать файл

            File f2 = new File("file/personDB2.txt");

            if (!f2.exists()) f2.createNewFile();

            fw = new FileWriter(f2);
            fw.write(s.toString());
            //fw.flush();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fr.close();
            fw.close();
        }
    }
}
