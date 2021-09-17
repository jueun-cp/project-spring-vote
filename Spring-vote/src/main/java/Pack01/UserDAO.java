package Pack01;

import java.sql.*;

public class UserDAO {

	String jdbcDriver = "com.mysql.jdbc.Driver";
	String dbUr1 = "jdbc:mysql://localhost/vote?useSSL=false";
	String username = "root";
	String password = "1234";
	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;

	public String[] Select() {
		try {
			String sql1 = String.format("select count(*) from user group by cand order by cand desc");
			String [] count = new String [5];
			int i = 0;
			Class.forName(jdbcDriver);// .newInstance();
			con = DriverManager.getConnection(dbUr1, username, password);
			pstmt = con.prepareStatement(sql1);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("count(*)"));
				count[i++] = rs.getString("count(*)");
				System.out.println("count" + count[0]);
			}			
			con.close();
			return count;
		} catch (Exception e) {
		}
		return null;
		
	}
}