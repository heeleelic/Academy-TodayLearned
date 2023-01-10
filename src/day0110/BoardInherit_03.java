package day0110;

import java.util.Scanner;



//슈퍼 클래스
abstract class Board{
	public abstract void process();
}


//서브 클래스
class List extends Board{

	@Override
	public void process() {
		System.out.println("게시판의 전체 글을 출력합니다");
		
	}
	
}


class Write extends Board{

	@Override
	public void process() {
		System.out.println("게시판에 글을 쓰고 저장합니다");
		
	}
	
}



class Update extends Board{

	@Override
	public void process() {
		System.out.println("게시판의 글을 수정합니다");
		
	}
	
	
}


class Delete extends Board{

	@Override
	public void process() {
		System.out.println("게시판의 글을 삭제합니다");
		
	}
	
}




public class BoardInherit_03 {

	public static void main(String[] args) {
		

		//Board board=new Board(); //추상 클래스는 인스턴스 생성 못한다
		
		Scanner sc=new Scanner(System.in);
		int num;
		
		Board board=null;
		
		while(true) {
			System.out.println("1.쓰기 2.조회 3.수정 4.삭제 5.종료");
			num=sc.nextInt();
			
			switch(num) {
			
			case 1: 
				board=new Write();
				break;
			case 2:
				board=new List();
				break;
			case 3:
				board=new Update();
				break;
			case 4:
				board=new Delete();
				break;
			case 5:
				System.out.println("종료합니다.");
				System.exit(0); //강제 종료. break의 의미. 
			
			}
			
			
			//하나의 변수로 오버라이딩된 메서드 호출 가능 
			board.process();
			
		}
			
		
	}

}
