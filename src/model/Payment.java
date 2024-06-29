package model;

import java.util.Date;

public abstract class Payment {
    private int payment_id;
    private Order order;
    private Date payment_day;
    private double amount;

    public Payment(int payment_id, Order order, Date payment_day, double amount) {
        this.payment_id = payment_id;
        this.order = order;
        this.payment_day = payment_day;
        this.amount = amount;
    }

    public int getPayment_id() {
        return payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Date getPayment_day() {
        return payment_day;
    }

    public void setPayment_day(Date payment_day) {
        this.payment_day = payment_day;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();
}
