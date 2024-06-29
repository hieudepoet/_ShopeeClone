package model.payment;

import java.util.Date;

import model.Order;
import model.Payment;

public class BankTransferPayment extends Payment{
    private String bank;
    private String bank_account;
    private String bank_username;

    public BankTransferPayment(int payment_id, Order order, Date payment_day, double amount, String bank,
            String bank_account, String bank_username) {
        super(payment_id, order, payment_day, amount);
        this.bank = bank;
        this.bank_account = bank_account;
        this.bank_username = bank_username;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getBank_account() {
        return bank_account;
    }

    public void setBank_account(String bank_account) {
        this.bank_account = bank_account;
    }

    public String getBank_username() {
        return bank_username;
    }

    public void setBank_username(String bank_username) {
        this.bank_username = bank_username;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing " + getBank() + " payment for amount: " + getAmount());
    }
}
