public class Main {
    public static void main(String[] args) {
        // client code was written to use methods of the DatabaseAccess class.
        // When migration to the new/better class NewDatabaseAccess this code
        // should change (and any other code accessing the database).
        // However, using the adapter pattern we can simply create our version
        // of DatabaseAccess class and leave this code untouched.
        String dbAddress = "db.domain.org";
        DatabaseAccess db = new DatabaseAccess(dbAddress);
        String sql = "SELECT * from PRODUCTS WHERE price < 100;";
        for (Record r : db.query(sql)) {
            System.out.println(r);
        }
    }
}
