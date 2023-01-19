package day0119;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {
	
	
	static final String ORACLE_URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	//오라클 연결(connection)
	public Connection getConnection() {
		
		Connection conn=null;
		
		try {
			conn=DriverManager.getConnection(ORACLE_URL,"dragon","a1234");			
			
		} catch (SQLException e) {
			System.out.println("오라클 연결에 실패했습니다. "+e.getMessage());
		}
		
		
		return conn;
	}
	
	
	//자원 반납 1번(conn,stmt,rs)
	public void dbClose(ResultSet rs,Statement stmt,Connection conn) {
		
		try {
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
			
			
		} catch (SQLException e) {
			System.out.println("자원 반납에 실패했습니다. "+e.getMessage());
		}
	}
		
    //자원 반납 2번(conn,prestmt,rs)
	public void dbClose(ResultSet rs,PreparedStatement pstmt,Connection conn) {
			
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
				
				
			} catch (SQLException e) {
				System.out.println("자원 반납에 실패했습니다. "+e.getMessage());
			}
		
		
	}
	
	
	//자원 반납 3번(conn,stmt)
	public void dbClose(Statement stmt,Connection conn) {
		
		try {
			
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
			
			
		} catch (SQLException e) {
			System.out.println("자원 반납에 실패했습니다. "+e.getMessage());
		}
	}
	
	
	//자원 반납 4번(conn,pstmt)
	public void dbClose(PreparedStatement pstmt,Connection conn) {
		
		try {
			
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
			
			
		} catch (SQLException e) {
			System.out.println("자원 반납에 실패했습니다. "+e.getMessage());
		}
	}
	
	
	
	

}
