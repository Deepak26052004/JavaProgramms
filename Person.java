public class Person {
    int age;
    double height;
    public Person(int age, double height){
        this.age=age;
        this.height=height;
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof Person) {
            Person person = (Person) o;
            return this.age == person.age && this.height == person.height;
        }
        return false;
    }
    public static void main(String[] args) {
        Person person=new Person(23, 135.5);
        Person person2=new Person(23, 135.5);
        System.out.println(person.equals(person2));
    }
}

