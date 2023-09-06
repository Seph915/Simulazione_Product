public class Product {
    private String name;
    private String manufacture;
    private long id;
    private int quantity;

    public Product(String name, String manufacture, long id, int quantity) {
        this.name = name;
        this.manufacture = manufacture;
        this.id = id;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
}

