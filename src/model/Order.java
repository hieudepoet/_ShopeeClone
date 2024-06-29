package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.order.OrderStatus;
import model.user.Customer;

public class Order {
    private int order_id;
    private Customer customer;
    private Date oder_date;
    private List<OrderItem> order_items;
    private OrderStatus status;
    
    public Order(int order_id, Customer customer, Date oder_date) {
        this.order_id = order_id;
        this.customer = customer;
        this.oder_date = oder_date;
        order_items = new ArrayList<>();
        this.status = OrderStatus.NEW;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getOder_date() {
        return oder_date;
    }

    public void setOder_date(Date oder_date) {
        this.oder_date = oder_date;
    }

    public List<OrderItem> getOrder_items() {
        return order_items;
    }

    public void setOrder_items(List<OrderItem> order_items) {
        this.order_items = order_items;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addOrderItem(OrderItem item) {
        order_items.add(item);
    }

    public List<OrderItem> getOderItems() {
        return order_items;
    }

    public void reomveOrderItem(OrderItem item) {
        order_items.remove(item);
    }

    public double calculateTotal() {
        double total = 0.0;
        for (OrderItem item : order_items) {
            total += item.getProduct().getPrice() * item.getQuantity();
        }
        return total;
    }

    public void placeOrder() throws Exception {
        //Check if the stock is sufficient for each product in the order
        for(OrderItem item : order_items) {
            Product product = item.getProduct();
            int requiredQuantity = item.getQuantity();
            if (product.getStock() < requiredQuantity) {
                throw new Exception("Not enough stock for product: " + product.getName());
            }
        }

        //Reduce the stock for each product in the order
        for(OrderItem item : order_items) {
            Product product = item.getProduct();
            int requiredQuantity = item.getQuantity();
            product.setStock(product.getStock() - requiredQuantity);
        }

        //Update the order status to "PLACED"
        this.status = OrderStatus.PLACED;
        
    }

    public void cancelOrder() {
        //Restore the stock for each product in the order
        for(OrderItem item : order_items) {
            Product product = item.getProduct();
            int requiredQuantity = item.getQuantity();
            product.setStock(product.getStock() - requiredQuantity);
        }

        //Update the order status to "CANCELLED"
        this.status = OrderStatus.CANCELED;
    }
}  
