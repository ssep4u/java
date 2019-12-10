import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectExam {
  private static DBHelper dbHelper;
  private static Connection conn;

  public static void main(String[] args) {
    dbHelper = DBHelper.getInstance();
    conn = dbHelper.open();
    if (conn != null) {
      System.out.println("DB 연결 success!!!");
    } else {
      System.out.println("DB 연결 fail ㅠㅠ");
    }

    dbHelper.insert("김친구", 3, 31, "0331", "010-1234-1234", 3, 9, 3, 4);
    ResultSet rs = dbHelper.select();
    try {
      while (rs.next()) {
        System.out.println(rs.getString("name") + "\t" + rs.getInt("month") + "\t" + rs.getInt("day"));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
