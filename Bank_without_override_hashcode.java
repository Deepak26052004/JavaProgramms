public class Bank_without_override_hashcode {
    String bName;
    public Bank_without_override_hashcode(String bName){
        this.bName=bName;
    }
    public static void main(String[] args) {
        Bank_without_override_hashcode b1=new Bank_without_override_hashcode("SBI");
        Bank_without_override_hashcode b2=new Bank_without_override_hashcode("SBI");
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }
}
