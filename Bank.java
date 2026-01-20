import java.util.Arrays;

public class Bank {
    private String name;
    private String branch;

    public Bank(String name, String branch) {
        this.name = name;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Bank Name: " + name + ", Branch: " + branch;
    }

    public static void main(String[] args) {
        Bank bank1 = new Bank("Indian Bank", "Pudhupalayam");
        Bank bank2 = new Bank("SBI", "Vadapalani");
        Bank bank3 = new Bank("ICICI", "Arumbakkam");
        Book book=new Book();

        // Bank[] banks = {bank1, bank2, bank3};
        // System.out.println(Arrays.toString(banks));
        System.out.println(bank1.getClass());
        System.out.println(bank2.getClass());
        System.out.println(getClass());
    }
}
