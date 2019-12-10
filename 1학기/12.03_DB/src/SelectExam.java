import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
    ArrayList<t1> t1List = dbHelper.select();
    for (t1 item:t1List) {
      System.out.println(item);
    }
  }
}
