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

	public int select(String name, String pin) {
		try {

			String sql_select = "select * from user";
			Class.forName(jdbcDriver);
			con = DriverManager.getConnection(dbUr1, username, password);
			System.out.println("DB 접속 완료");
			pstmt = con.prepareStatement(sql_select);
			
			rs = pstmt.executeQuery();
			
			
			while (rs.next()) {
				String s_pin = rs.getString("pin");
				System.out.println("Ppp"+pin);
				System.out.println("SSSSSSSS"+s_pin);
				if (pin.equals(s_pin)) {
					System.out.println("인증 성공");
					String s_cand = rs.getString("cand");
					// 인증이 성공되었으면 -> cand 확인
					// 투표로 보내주기
					if ( null == s_cand) {
						System.out.println("투표 아직 안하셨습니다");
						return 1;
					} else {
						System.out.println("이미 투표하셨습니다");
						return 2;
					}

				} else {
					//인증 실패
					System.out.println("qqqqq");
					
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null & !pstmt.isClosed()) {
					pstmt.close();

				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("인증 실패");
		return 3;
	}

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