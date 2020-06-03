package scope;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDAO { // ~DAO(Data Access Object : DB작업 담당)
	// JDBC (Java DataBase Connection)
	// 1. 클래스 드라이버 로드
	// 2. DB서버와 커넥션(DB서버 IP주소 / userid / userpassword)
	// 3. Statement 객체 생성 => sql 구문 전송하기 위해 필요
	// 4. sql 처리 결과를 받기(int - update/delete/insert. ResultSet - select)
	// 5. sql 처리 결과에 따라 자바 코드 실행
	
	static {
		try {
			//oracle.jdbc.driver.OracleDriver
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		Connection con = null;
		
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String userid="javadb";
		String password="12345";
		try {
			con = DriverManager.getConnection(url,userid,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	//selectOne
	public MemberVO getUser(int no) {
		
		
		String sql = "select * from memberTBL where no=?";
		MemberVO vo = null;
		try(Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement(sql);) {
			
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				vo = new MemberVO();
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setAge(rs.getInt(3));
				vo.setGender(rs.getString(4));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vo;
	}

}
