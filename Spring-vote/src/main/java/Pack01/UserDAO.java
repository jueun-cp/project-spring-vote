package Pack01;

import java.sql.*;

public class UserDAO {

	String jdbcDriver = "com.mysql.jdbc.Driver";
	// ���� �ٲ������
	String dbUr1 = "jdbc:mysql://localhost/vote?useSSL=false";
	String username = "root";
	String password = "1216";

	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;

	public int select(String name, String pin) {
		try {

			String sql_select = "select * from user";
			Class.forName(jdbcDriver);
			con = DriverManager.getConnection(dbUr1, username, password);
			System.out.println("DB ���� �Ϸ�");
			pstmt = con.prepareStatement(sql_select);
			
			rs = pstmt.executeQuery();
			
			
			while (rs.next()) {
				String s_pin = rs.getString("pin");
				System.out.println("Ppp"+pin);
				System.out.println("SSSSSSSS"+s_pin);
				if (pin.equals(s_pin)) {
					System.out.println("���� ����");
					String s_cand = rs.getString("cand");
					// ������ �����Ǿ����� -> cand Ȯ��
					// ��ǥ�� �����ֱ�
					if ( null == s_cand) {
						System.out.println("��ǥ ���� ���ϼ̽��ϴ�");
						return 1;
					} else {
						System.out.println("�̹� ��ǥ�ϼ̽��ϴ�");
						return 2;
					}

				} else {
					//���� ����
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
		System.out.println("���� ����");
		return 3;
	}

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