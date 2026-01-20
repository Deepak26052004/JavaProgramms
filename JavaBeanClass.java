package Equals_And_HashCode;

public class JavaBeanClass {//It Should be public Class
    private StringDemo color;
    private StringDemo company;//It should private data members

    public JavaBeanClass(){}//It should have public no argument constructor

    public StringDemo getColor(){
        return color;
    }
    public void setColor(StringDemo color){
        this.color=color;
    }
    public StringDemo getCompany(){
        return company;
    }
    public void setCompany(StringDemo company){
        this.company=company;//It should have public getters and setters 
    }
}
