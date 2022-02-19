package ru.exception;

import ru.io.basic.model.Person;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ThrowExceptionApp {

    public static void main(String[] args)  {


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер банкоской карты");
        String cardNumber  = sc.next();

        try {
         proccesCardNumber(cardNumber);
        } catch (CardNumberInvalidExpection expection) {

         System.out.println(expection.getMessage());
         System.out.println("Номер карты: " + expection.getCardNumber());
         expection.printStackTrace();
         processAccountNumber(sc);
        }

    }

    private static void processAccountNumber(Scanner sc) {
        System.out.println("Введите номер банковского счета");
        String accountNumber  = sc.next();
        proccesAccountNumber(accountNumber);
    }


    private static boolean proccesCardNumber(String cardNumber) throws CardNumberInvalidExpection {

            if (cardNumber.length() > 16) {
                throw new CardNumberInvalidExpection("Введенный номер карты привышает 16 симповолов: " + cardNumber.length(), cardNumber);
            } else if (cardNumber.length() < 16) {
                throw new CardNumberInvalidExpection("Введенный номер карты меньше 16 симповолов: " + cardNumber.length(), cardNumber);
            }
            System.out.println("Вы вошли в систему по номеру карты: " + cardNumber);

        return false;
    }


    private static void proccesAccountNumber(String accountNumber) {
        System.out.println("Введенный номер счета: " + accountNumber);
    }
}
