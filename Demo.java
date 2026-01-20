package Equals_And_HashCode;

public class Demo {
    static int c=0;
    @Override
    public void finalize(){
        System.out.println((c+1)+" .Garbage Removed");
        c++;
    }
    public static void main(StringDemo[] args) throws Exception {
        Demo demo=new Demo();
        Demo demo2=new Demo();
        Demo demo3=new Demo();
        new Demo();
        new Demo();
        new Demo();
        new Demo();
        new Demo();
        new Demo();
        System.gc();
        Thread.sleep(2000);

    }
}
