package model;

public class OrderItem {
    private int item_id;
    private Product product;
    private int quantity;

    public OrderItem(int item_id, Product product, int quantity) {
        this.item_id = item_id;
        this.product = product;
        this.quantity = quantity;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }    
}
