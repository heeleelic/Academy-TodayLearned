package day0106;

public class MemberMain_04 {

	public static void main(String[] args) {
		
		Member_04 mem1=new Member_04();
		mem1.setData("송혜교","여자","서울");
		Member_04.acd="JAVA반";
		mem1.writeData();
		
		System.out.println("================");
		Member_04 mem2=new Member_04();
		mem2.setData("김지석","남자","인천");
		Member_04.acd="JAVA반";
		mem2.writeData();
		
		System.out.println("================");
		Member_04 mem3=new Member_04();
		mem3.setData("이수연","여자","서울");
		Member_04.acd="JAVA반";
		mem3.writeData();

	}

}
