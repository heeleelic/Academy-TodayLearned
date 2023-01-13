package day0113;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VectorBoard_08 {

	//클래스형으로 지정했으므로 데이터를 꺼내고 받을 때도 클래스형
	List<Board_08> list=new ArrayList<>();
	
	public void inputData() {
		
		Scanner sc=new Scanner(System.in);
		String writer,subject,content;
		
		System.out.println("작성자명을 입력해주세요.");
		writer=sc.nextLine();
		System.out.println("제목을 입력해주세요.");
		subject=sc.nextLine();
		System.out.println("내용을 입력해주세요.");
		content=sc.nextLine();
		
		//Board_08 data=new Board_08(writer, subject, content);
		//list.add(data);
		
		list.add(new Board_08(writer, subject, content));
		
		System.out.println("현재 데이터 개수: "+list.size()+"개");
		
	}
	
	
	public void writeData() {
		
		System.out.println("--게시판--");
		
		for(int i=0;i<list.size();i++) {
			
			Board_08 b=list.get(i);
			System.out.println("No. "+(i+1)+"\t작성자: "+b.getWriter()+"\t제목: "+b.getSubject());
			System.out.println("내용: "+b.getContent());
			System.out.println("-------------------------------------------");
			
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		VectorBoard_08 vectorBoard_08=new VectorBoard_08();
		Scanner sc=new Scanner(System.in);
		int n;
		
		while(true) {
			
			System.out.println("1.추가    2.전체 출력   9.종료");
			n=Integer.parseInt(sc.nextLine());
			
			switch (n) {
			case 1:
				vectorBoard_08.inputData();
				break;
			case 2:
				vectorBoard_08.writeData();
				break;
			case 9:
			    System.out.println("시스템을 종료합니다.");
				System.exit(0);
			default:
				System.err.println("유효하지 않은 번호입니다.");
				continue;
			}
			
			
		}
		
	}

}
