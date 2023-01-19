package day0119;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnectTest {
	
	//1.데이터베이스 연동 위해 url 생성
	//mysql 사용시 oracle 부분 바꿔주면 된다.
	static final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	
	
	public void connectSawon() {
		
		//2. 실행에 필요한 객체들 생성
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		//3. SQL문 작성
		String sql="select * from sawon order by num asc"; 
		
		try {
			
			//4. connection
			conn=DriverManager.getConnection(URL, "dragon", "a1234");
			System.out.println("오라클 서버 연결 성공했어요!");
			
			//5. statement
			stmt=conn.createStatement();
			
			//6. resultset
			rs=stmt.executeQuery(sql); //SQL문 DB 전달
			
			
			//7. 데이터 가져오기
			//여러 줄의 데이터 가져올 경우에는, while문 사용
			//rs.next() -> 다음 데이터(행 단위)로 이동하면서 true면 반환
			//더 이상 가져올 레코드 없으면 false를 반환
			
			while(rs.next()) {
				
				//7-1. DB에서 데이터 가져오기
				int num=rs.getInt(1); //sawon 컬럼 1번째 'num'
				String name=rs.getString(2); //sawon 컬럼 2번째 'name'
				String gender=rs.getString("gender"); //sawon 컬럼 3번째 'gender'
				String buseo=rs.getString("buseo"); //sawon 컬럼 4번째 'buseo'
				int pay=rs.getInt("pay"); //sawon 컬럼 5번째 'pay'
				
				//7-2. 출력하기
				System.out.println(num+"\t"+name+"\t"+gender+"\t"+buseo+"\t"+pay);
				
			}
						
			
		} catch (SQLException e) {			
			System.out.println("서버 연결에 실패했습니다."+e.getMessage());
		} finally {
			try {
				//8. 자원 반납
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	public void connectFood() {
		
		//객체 생성
		
		Connection conn1=null;
		Statement st1=null;
		ResultSet rs1=null;
			
		//sql문 작성
		String sql1="select f.fno, name, food, price, shop, loc, addr from food f,jumun j where f.fno=j.fno order by name asc"; 
		
		
		
		try {
			//c,s,r
			conn1=DriverManager.getConnection(URL,"dragon","a1234");
			System.out.println("연결에 성공했습니다");
			st1=conn1.createStatement();
			rs1=st1.executeQuery(sql1);
			
			System.out.println("주문번호\t주문자\t음식명\t가격\t상호명\t가게위치\t주문자위치");
		
			//데이터 가져오기
			while(rs1.next()) {
				
			int fno=rs1.getInt("fno");
			String name=rs1.getString("name");
			String food=rs1.getString("food");
			int price=rs1.getInt("price");
			String shop=rs1.getString("shop");
			String loc=rs1.getString("loc");
			String addr=rs1.getString("addr");
					
			
			//출력
			
			System.out.println(fno+"\t"+name+"\t"+food+"\t"+price+"\t"+shop+"\t"+loc+"\t"+addr);
			
			}
			
			
		} catch (SQLException e) {
			System.out.println("연결에 실패하였습니다."+e.getMessage());
			
		} finally {
			//자원 반납
			try {
				rs1.close();
				st1.close();
				conn1.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
			
		
	}
	
	
	public static void main(String[] args) {
		
		//9. 메서드 실행
		DbConnectTest dbConnectTest=new DbConnectTest();
		//dbConnectTest.connectSawon();
		dbConnectTest.connectFood();
		
	}

}
