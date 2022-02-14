package ru.io.basic;

import ru.io.basic.model.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileWriterApp {

    private static String CATALOG_NAME = "file/";

    public static void main(String[] args) {

        System.out.println("Записать данные или выгрузить в БД?");
        System.out.println("1. Загрузить");
        System.out.println("2. Выгрузить и отобразить");

        Scanner sc = new Scanner(System.in);
        int choise = sc.nextInt();

        if (choise == 1 ) {
            System.out.println("Заполните Person для сохранения1");
            dbWrite(sc);
        } else if( choise == 2) {
            dbRead(sc);
        }

    }

    private static void dbWrite(Scanner sc) {
        String personName = sc.next();
        try (FileWriter fw = new FileWriter(CATALOG_NAME+personName, true)) {
            fw.write("name:"+sc.next() + " ");
            fw.write("age:"+sc.nextInt() + " ");
            fw.write("\n");

            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void dbRead(Scanner sc) {
        String fileName = sc.next();
        try (BufferedReader br = new BufferedReader(new FileReader(CATALOG_NAME+fileName))) {

            List<Person> listOfPerson = new ArrayList<>();
            
            String currentLine = "";
            while ((currentLine= br.readLine()) != null) {
                System.out.println(currentLine);
                if(currentLine!=null && !currentLine.isBlank())
                   listOfPerson.add(convertStringToPerson(currentLine));
            }

            System.out.println(listOfPerson);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Данная персона не найдена," + fileName + " введи ее повторно: ");
            dbRead(sc);
        }
    }

    private static Person convertStringToPerson(String currentLine) {

      String[] splitted =  currentLine.split(" ");  // name:Света,  age:22

        Person person = new Person();

        for (String s : splitted) {
            getNameAndSet(s, person);
            getAgeAndSet(s, person);
        }
        return person;
    }

    private static void getAgeAndSet(String s,  Person p) {   // age:22
        if(s!=null && s.contains("age:")) {
            p.setAge(Integer.valueOf(s.split(":")[1]));
        }
    }

    private static void getNameAndSet(String s,  Person p) { // name:Света
        if(s!=null && s.contains("name:")) {
            p.setFio(s.split(":")[1]);
        }
    }
}
