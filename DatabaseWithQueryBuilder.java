interface Database {
    
    void connect();
    
    class QueryBuilder {
        public static String buildSelect(String table) {
            return "SELECT * FROM " + table;
        }
        
        public String buildInsert(String table, String[] columns) {
            return "INSERT INTO " + table + " (" + String.join(",", columns) + ") VALUES (?,?)";
        }
    }
}

class MySQL implements Database {
    @Override
    public void connect() {
        System.out.println("Connected to MySQL");
    }
}

public class DatabaseWithQueryBuilder {
    public static void main(String[] args) {
        String select = Database.QueryBuilder.buildSelect("users");
        System.out.println(select);
        
        Database.QueryBuilder builder = new Database.QueryBuilder();
        String insert = builder.buildInsert("users", new String[]{"name", "age"});
        System.out.println(insert);
        
        MySQL db = new MySQL();
        db.connect();
    }
}