package ru.exception;

public class CardNumberInvalidExpection extends Exception {

    private String cardNumber;

   public CardNumberInvalidExpection(String message, String cardNumber){
       super(message);
       this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }
}
