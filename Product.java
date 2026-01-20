public class Product {

    int id;
    String name;
    String brand;
    Double price;

    public Product(int id, String name, String brand, Double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+brand+" "+price;
    }
    
}
