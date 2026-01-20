public class ComparableEg implements Comparable<ComparableEg> {

    int id;
    String name;
    String brand;
    Double price;

    public ComparableEg(int id, String name, String brand, Double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }
    // @Override
    // public int compareTo(ComparableEg other) {
    //     return other.price.compareTo(this.price);
    // }
    // @Override
    // public int compareTo(ComparableEg other){
    //     return other.brand.compareTo(this.brand);
    // }
    @Override
    public int compareTo(ComparableEg other){
        return other.id-this.id;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+brand+" "+price;
    }
}
