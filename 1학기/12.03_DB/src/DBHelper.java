import java.sql.*;
import java.util.ArrayList;

public class DBHelper {
  //데이터베이스 접속에 필요한 정보
  private static final String hostname = "localhost";
  private static final int port = 3306;
  private static final String database = "myjavadb";
  private static final String charset = "utf8";
  private static final String username = "root";
  private static final String password = "mirim2";
  ArrayList<t1> t1List = new ArrayList<>();

  //접속 처리를 위한 객체 선언
  private Connection conn = null;

  //싱글톤 객체
  private static DBHelper instance = null;

  public static DBHelper getInstance() {
    if (instance == null) {
      instance = new DBHelper();
    }
    return instance;
  }

  public void freeInstance() {
    instance = null;
  }

  public Connection open() {
    if (conn != null)
      return conn;
    String urlFormat = "jdbc:mysql://%s:%d/%s?serverTimezone=Asia/Seoul&charsetEncoding=%s";
    String url = String.format(urlFormat, hostname, port, database, charset);

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      conn = DriverManager.getConnection(url, username, password);
      System.out.println("Database connect Success");
    } catch (ClassNotFoundException e) {
      System.out.println("Database connect Fail");
      System.out.println(e.getMessage());
      e.printStackTrace();
    } catch (SQLException e) {
      System.out.println("Database connect Fail");
      System.out.println(e.getMessage());
    }
    return conn;
  }

  public void close() {
    if (conn == null)
      return;
    try {
      conn.close();
      System.out.println("Database disconnect Success");
    } catch (SQLException e) {
      System.out.println("Database disconnect Fail");
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
    conn = null;
  }

  public ArrayList<t1> select() {
    String sql = "SELECT * FROM t1;";
    Statement stmt = null;
    ResultSet rs = null;
    try {
      stmt = conn.createStatement();
      rs = stmt.executeQuery(sql);
      while (rs.next()) {
        t1 newT1 = new t1();
        newT1.setName(rs.getString("name"));
        newT1.setMonth(rs.getInt("month"));
        newT1.setDay(rs.getInt("day"));
        newT1.setBirth_option(rs.getString("birth_option"));
        newT1.setPhone(rs.getString("phone"));
        newT1.setGroup1(rs.getInt("group1"));
        newT1.setGroup2(rs.getInt("group2"));
        newT1.setGroup3(rs.getInt("group3"));
        newT1.setGroup4(rs.getInt("group4"));
        t1List.add(newT1);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return t1List;
  }
  public int insert(t1 item) {
    insert(item.getName(), item.getMonth(), item.getDay(), item.getBirth_option(), item.getPhone(), item.getGroup1(), item.getGroup2(), item.getGroup3(), item.getGroup4());
  }

  public int insert(String name, int month, int day, String birth_option, String phone, int group1, int group2, int group3, int group4) {
    int result = 0;
    String sql = "insert into t1 values (?, ?, ?, ?, ?, ?, ?, ?, ?);";
    PreparedStatement pstmt = null;
    try {
      pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, name);
      pstmt.setInt(2, month);
      pstmt.setInt(3, day);
      pstmt.setString(4, birth_option);
      pstmt.setString(5, phone);
      pstmt.setInt(6, group1);
      pstmt.setInt(7, group2);
      pstmt.setInt(8, group3);
      pstmt.setInt(9, group4);
      result = pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return result;
  }
}
