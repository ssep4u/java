import java.sql.*;

public class SelectExam {
    public static void main(String[] args) {
        DBHelper dbHelper = DBHelper.getInstance();
        Connection conn = dbHelper.open();

        Statement stmt = null;
        try {
            stmt = conn.createStatement();
        } catch(SQLException e) {
            System.err.println("작업 처리 객체 생성 실패");
        }

        ResultSet rs = null;
        try {
//            rs = stmt.executeQuery("SELECT * FROM t1");
            String sql = "SELECT * from t1 WHERE name like ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "%친구");
//            System.out.println(pstmt);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getString("name")+"-"+rs.getString("month")+"-"+rs.getString("day"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
