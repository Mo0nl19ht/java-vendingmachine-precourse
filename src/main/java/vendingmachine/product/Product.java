package vendingmachine.product;

public class Product {
    private final String name;
    private final int price;
    private final int stock;

    public Product(String name,int price,int stock){
        this.name=name;
        this.price=price;
        this.stock=stock;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

}