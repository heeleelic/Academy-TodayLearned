package day0119;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;

public class QuizSawonGroup {
	//성별  인원수  평균급여  최고급여  최저급여
	
	
	//DB연결
	DbConnect db=new DbConnect();
	

	public void connectSawon() {
		
		//포맷함수
		NumberFormat nf=NumberFormat.getCurrencyInstance();
		
		//SQL문 작성
		String sql="select gender, count(*) count, round(avg(pay),0) avgPay, max(pay) maxPay, min(pay) minPay from sawon group by gender";
		
		
		//c,s,r
		Connection conn=db.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		
		
		//데이터 읽어오기
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("성별\t인원수\t평균급여\t최고급여\t최저급여");
			System.out.println("----------------------------------------------------");
			
			
			while(rs.next()) {
				
				String gender=rs.getString("gender");
				int count=rs.getInt("count");
				String avgPay=nf.format(rs.getInt("avgPay"));						
				String maxPay=nf.format(rs.getInt("maxPay"));						
				String minPay=nf.format(rs.getInt("minPay"));
						
						
				System.out.println(gender+"\t"+count+"\t"+avgPay+"\t"+maxPay+"\t"+minPay);
				
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		};
		
		
		
		
		
	}
	
	

	
	public static void main(String[] args) {
		
		QuizSawonGroup quizSawonGroup=new QuizSawonGroup();
		quizSawonGroup.connectSawon();
		
		

	}

}
