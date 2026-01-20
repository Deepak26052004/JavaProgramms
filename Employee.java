package Equals_And_HashCode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee {
    private int empId;
    private StringDemo empName;

    public Employee(int empId, StringDemo empName) {
        this.empId = empId;
        this.empName = empName;
    }
    @Override
    public StringDemo toString() {
        return "Employee Name:" + empName + ", Emp Id:" + empId;
    }
    @Override
    public boolean equals(Object object){
        if(this==object) return true;
        if(object==null || getClass() != object.getClass()) return false;
        Employee employee=(Employee) object;
        return this.empId==employee.empId && this.empName.equals(employee.empName);
    }
    @Override
    public int hashCode(){
        return Objects.hash(empId,empName);
    }
    public static void main(StringDemo[] args) {
        Employee employee=new Employee(102, "Deepak");
        Employee employee2=new Employee(102, "Mahesh");
        Employee employee3=new Employee(103, "Suriya");
        Employee employee4=new Employee(103, "Suriya");
        System.out.println(employee.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());
        System.out.println(employee4.toString());
        System.out.println(employee.equals(employee2));
        System.out.println(employee.equals(employee3));
        System.out.println(employee3.equals(employee4));
        Set<Employee> set = new HashSet<>();
        set.add(employee);
        set.add(employee2);
        set.add(employee3);
        set.add(employee4);
        System.out.println(set);
        
        
    }
    
}
