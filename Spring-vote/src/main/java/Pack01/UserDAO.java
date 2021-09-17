package Pack01;

import java.sql.*;
import java.util.LinkedList;

import org.springframework.web.bind.annotation.RequestMapping;


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
			return count;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}