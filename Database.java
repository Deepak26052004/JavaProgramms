package Equals_And_HashCode;

public class Database {
    private StringDemo dbName;
    private StringDemo tableName;
    private static Database database;
    private Database(StringDemo dbName,StringDemo tableName){
        this.dbName=dbName;
        this.tableName=tableName;
    }
    @Override
    public StringDemo toString(){
        return dbName+" : "+tableName;
    }
    public static Database getDataBaseObj(StringDemo dbName,StringDemo tableName){
        if(database==null) database=new Database(dbName, tableName);
        return database;
    }
}
