package Pack01;

import java.sql.*;
import java.util.LinkedList;

import org.springframework.web.bind.annotation.RequestMapping;


public class UserDAO {

	String jdbcDriver = "com.mysql.jdbc.Driver";
	// ø©±‚ πŸ≤„¡‡æﬂ«‘
//	String dbUr1 = "jdbc:mysql://112.162.204.185:9988/vote?useSSL=false";
//	String username = "user3";
//	String password = "1234";
	String dbUr1 = "jdbc:mysql://localhost/vote?useSSL=false";
	String username = "root";
	String password = "dydals0905";
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;

	public void update(String name, String pin, String cand) {
		try {
			System.out.println("1update");
			String sql1 = String.format("update user set cand='%s' where name ='%s' and pin = '%s'", cand, name, pin);
			Class.forName(jdbcDriver);// .newInstance();
			con = DriverManager.getConnection(dbUr1, username, password);
			pstmt = con.prepareStatement(sql1);
			pstmt.executeUpdate();
			System.out.println(sql1);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}