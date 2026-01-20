public abstract class Device {
    private String brand;

    public Device(String brand){
        this.brand=brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }

    public abstract void switchOn();
}

class Laptop extends Device{
    public Laptop(String brand){
        super(brand);
    }

    @Override
    public void switchOn(){
        System.out.println("Laptop is ON");
        System.out.println("Laptop Brand Name:"+getBrand());
        System.out.println("**********************");
    }
}

class Mobile extends Device{
    public Mobile(String brand){
        super(brand);
    }

    @Override
    public void switchOn(){
        System.out.println("Mobile is ON");
        System.out.println("Mobile Brand Name:"+getBrand());
        System.out.println("**********************");
    }
}
class Main{
    public static void main(String[] args) {
        Laptop laptop=new Laptop("Acer");
        Mobile mobile=new Mobile("Vivo T4 Lite");
        laptop.switchOn();
        mobile.switchOn();
    }
}
