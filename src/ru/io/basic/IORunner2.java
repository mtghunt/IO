package ru.io.basic;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IORunner2 {

    public static void main(String[] args) throws IOException {

        // записать файл
        File f2 = new File("file/personDB2.txt");



        try( FileWriter fw = new FileWriter(f2)){
            Scanner sc = new Scanner(System.in);

            if (!f2.exists()) f2.createNewFile();


            fw.write(sc.nextLine());
            fw.flush();

            System.out.println("Работа завершена успешно");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Мы поймали ошибку");
        }
    }
}
