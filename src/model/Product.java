package model;

public abstract class Product {
    private int product_id;
    private String name;
    private String description;
    private double price;
    private int stock;

    public Product(int product_id, String name, String description, double price, int stock) {
        this.product_id = product_id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public int getProductID() {
        return product_id;
    }

    public void setProductID(int product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public abstract void addProduct();

    public abstract void updateProduct();

    public abstract void reomveProduct();
}
