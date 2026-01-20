import java.util.Arrays;

public class Car {
    private String model;
    private double price;
    public Car(String model, double price){
        this.model=model;
        this.price=price;
    }
    public String toString(){
        return "Model:"+model+" : "+"Price:"+price;
    }
    public static void main(String[] args) {
        Car car=new Car("BMW", 123456);
        Car car2=new Car("TATA", 2345000);
        Car car3[]={car,car2};
        System.out.println(Arrays.toString(car3));
    }
}
