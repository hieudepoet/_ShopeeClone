package model.payment;

import java.util.Date;

import model.Order;
import model.Payment;

public class CreditCardPayment extends Payment{
    private String credit_card_number;
    private String card_holder_name;
    private String expiration_date;
    private String cvv;

    public CreditCardPayment(int payment_id, Order order, Date payment_day, double amount, String credit_card_number,
            String card_holder_name, String expiration_date, String cvv) {
        super(payment_id, order, payment_day, amount);
        this.credit_card_number = credit_card_number;
        this.card_holder_name = card_holder_name;
        this.expiration_date = expiration_date;
        this.cvv = cvv;
    }

    public String getCredit_card_number() {
        return credit_card_number;
    }

    public void setCredit_card_number(String credit_card_number) {
        this.credit_card_number = credit_card_number;
    }

    public String getCard_holder_name() {
        return card_holder_name;
    }

    public void setCard_holder_name(String card_holder_name) {
        this.card_holder_name = card_holder_name;
    }

    public String getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(String expiration_date) {
        this.expiration_date = expiration_date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment for amount: " + getAmount());
    }
    
}
