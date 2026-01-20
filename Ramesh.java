public class Ramesh {
    int age=23;
    String name="Mahesh";
    @Override
    public String toString(){
        return name+":"+age;
    }
    public static void main(String[] args) {
        Object object=new Ramesh();
        System.out.println(object.toString());
    }    
}