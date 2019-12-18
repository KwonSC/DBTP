import java.sql.ResultSet;
import java.sql.SQLException;

public class DBControl {
    DBConnect db = new DBConnect();

    public boolean login (String id, String pw) throws SQLException {
        return true;
    }

    public boolean register (String id, String pw) throws SQLException {
        return true;
    }

    public boolean isAdmin (String id) throws SQLException {
        return true;
    }
}
