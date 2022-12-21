import java.util.List;

// Originally this could have been a library class to access the database, now
// the code migrates to the NewDatabaseAccess class. This class is thus defined
// so that it uses the NewDatabaseAccess providing the same methods used before
// migration. In this way, this newly defined DatabaseAccess acts as an adapter
// (sometimes called a wrapper) and the client code (which may be several classes)
// need not to change.
public class DatabaseAccess {

    private NewDatabaseAccess db;

    public DatabaseAccess(String address) {
        // NewDatabaseAccess class doesn't connect in the constructor (as the old
        // DatabaseAccess did), but has a connect method.
        db = new NewDatabaseAccess();
        db.connect(address);
    }
    public Record[] query(String sqlQuery) {
        // New querying methods is split into submit and exec methods, but the
        // old DatabaseAccess had only query method which we now define so that
        // it adapts (and wraps) the new class.

        // the new class returns a List of Record rather than an array of Record,
        // when returning results we will transform it into an array (see below)
        List<Record> results = null;
        db.submit(sqlQuery);
        // The old method didn't have an exception mechanism, now we have
        try {
            results = db.exec();
        } catch(DBError r) {
            // Manage error
        }
        if (results != null) {
            Record[] out = new Record[results.size()];
            results.toArray(out);
            return out;
        }
        return null;
        
    }
}
