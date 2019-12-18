import java.sql.ResultSet;
import java.sql.SQLException;

public class DBControl {
    DBConnect db = new DBConnect();

    public boolean login (String id, String pw) throws SQLException {
        String sql = String.format("select count(*) from member where id = '%s' and password = '%s'", id, pw);
        String count = "";

        ResultSet rs = db.getResult(sql);
        while(rs.next()){
            count = rs.getString("count(*)");
        }
        if(count.equals("0"))
            return false;
        else
            return true;
    }

    public boolean register (String id, String pw ,String username, String email, String PhoneNo, int attribute) throws SQLException {
        ResultSet rs = db.getResult("INSERT INTO member (userid, password, username, email, phoneNo, attributecode) VALUES (%s, %s, %s, %s, %s, %d ),id,pw,username,email,PhoneNo,attribute");

        return true;
    }

    public boolean isAdmin (String id) throws SQLException {
        return true;
    }
}
