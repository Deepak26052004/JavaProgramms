package Equals_And_HashCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
    private int rollNo;
    private StringDemo name;
    public Student(int rollNo, StringDemo name){
        this.rollNo=rollNo;
        this.name=name;
    }
    @Override
    public StringDemo toString(){
        return "Student Name:"+name+" : StudentRollNo:"+rollNo;
    }
    @Override
    public boolean equals(Object object){
        if(this==object) return true;
        if(object==null || getClass() != object.getClass()) return false;
        Student student=(Student) object;
        return this.rollNo==student.rollNo && this.name.equals(student.name);
    }
    @Override
    public int hashCode(){
        return Objects.hash(rollNo,name);
    }
    public static void main(StringDemo[] args) {
        Student student=new Student(1, "Akash");
        Student student2=new Student(2, "Ajay");
        Student student3=new Student(3, "Blessy");
        Set<Student> set=new HashSet<>();
        set.add(student);
        set.add(student2);
        set.add(student3);
        System.out.println(set);
    } 
}
