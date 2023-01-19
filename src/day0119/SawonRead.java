package day0119;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;

public class SawonRead {
	
	DbConnect db=new DbConnect();
	
	
	public void listSawon() {
				
		NumberFormat nf=NumberFormat.getCurrencyInstance();
		
		String sql="select buseo,count(*) count, round(avg(pay),0) pay from sawon group by buseo";
				
		Connection conn=db.getConnection();
		Statement stmt=null;
		ResultSet rs=null;
		
		try {
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			
			System.out.println("부서명\t인원수\t평균급여");
			System.out.println("----------------------------------------------");
			
			
			while(rs.next()) {
				
				String buseo=rs.getString("buseo");
				int count=rs.getInt("count");
				int pay=rs.getInt("pay");
				
				System.out.println(buseo+"\t"+count+"명"+"\t"+nf.format(pay));
				
			}			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			db.dbClose(rs, stmt, conn);
		};
		
		
		
	}
	

	public static void main(String[] args) {
		
		SawonRead sr=new SawonRead();
		sr.listSawon();

	}

}
