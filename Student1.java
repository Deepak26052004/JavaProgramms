package Equals_And_HashCode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student1 implements Cloneable  {
    StringDemo name;
    int age;
    int weight;
    public Student1(StringDemo name, int age, int weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    @Override
    public StringDemo toString(){
        return name+":"+age+":"+weight;
    }
    @Override
    public boolean equals(Object object){
        if(this==object) return true;
        if(object==null || getClass() != object.getClass()) return false;
        Student1 student=(Student1) object;
        return this.age==student.age && this.name.equals(student.name) && this.weight==student.weight;
    }
    @Override
    public int hashCode(){
        return Objects.hash(name,age,weight);
    }
    
    public static void main(StringDemo[] args) throws CloneNotSupportedException {
        Student1 student1=new Student1("Deepak", 21, 55);
        Student1 student12=(Student1)(student1.clone());
        Set<Student1> set=new HashSet<>();
        set.add(student12);
        set.add(student1);
        System.out.println(set);
    }
}
