import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBHelper {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String database = "exam";
    private static final int port = 3306;
    private static final String url = "jdbc:mysql://localhost:"+port+"/"+database+"?serverTimezone=Asia/Seoul";
    private static final String id = "root";
    private static final String password = "mirim2";
    private static DBHelper instance;

    private Connection conn = null;

    public static DBHelper getInstance() {
        if(instance==null) {
            instance = new DBHelper();
        }
        return instance;
    }

    public Connection open() {
        try {
            //JDBC 드라이버 연결
            Class.forName(JDBC_DRIVER);
            //Database 서버와 연결
            conn = DriverManager.getConnection(url, id, password);
        } catch (ClassNotFoundException e) {
            System.err.println();
            e.printStackTrace();
        } catch (SQLException e) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, e);
        }
        return conn;
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
