package Equals_And_HashCode;

public class DataBaseObj {
    public static void main(StringDemo[] args) {
        Database database=Database.getDataBaseObj("Sql", "Employee Table");
        Database database2=Database.getDataBaseObj("Oracle", "Department Table");
        System.out.println(database.toString());
        System.out.println(database2.toString());
    }
}
