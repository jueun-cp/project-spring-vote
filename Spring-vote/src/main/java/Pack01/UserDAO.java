package Pack01;

import java.sql.*;

public class UserDAO {

	String jdbcDriver = "com.mysql.jdbc.Driver";
	// ø©±‚ πŸ≤„¡‡æﬂ«‘
	String dbUr1 = "jdbc:mysql://112.162.204.185:9988/vote?useSSL=false";
	String username = "user3";
	String password = "1234";
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;

	public void insert(String usrID, String usrPIN) {
		try {
			String sql1 = String.format("insert into user2 values('%s','%s')", usrID, usrPIN);
			Class.forName(jdbcDriver);// .newInstance();
			con = DriverManager.getConnection(dbUr1, username, password);
			pstmt = con.prepareStatement(sql1);
			pstmt.executeUpdate();
			con.close();
		} catch (Exception e) {
		}
	}
}