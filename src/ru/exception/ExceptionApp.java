package ru.exception;

public class ExceptionApp {

    public static void main(String[] args) {
        System.out.println("Начало работы программы");
        populateArray();
        System.out.println("Конец работы программы");
    }

    private static void populateArray() {

        int[] clients = new int[3];

        clients[5] = 56;

    }


}
