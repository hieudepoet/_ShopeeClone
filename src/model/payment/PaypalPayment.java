package model.payment;

import java.util.Date;

import model.Order;
import model.Payment;

public class PaypalPayment extends Payment{
    private String paypal_email_account;

    public PaypalPayment(int payment_id, Order order, Date payment_day, double amount, String paypal_email_account) {
        super(payment_id, order, payment_day, amount);
        this.paypal_email_account = paypal_email_account;
    }

    public String getPaypal_email_account() {
        return paypal_email_account;
    }

    public void setPaypal_email_account(String paypal_email_account) {
        this.paypal_email_account = paypal_email_account;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Paypal payment for amount: " + getAmount());
    }
}
