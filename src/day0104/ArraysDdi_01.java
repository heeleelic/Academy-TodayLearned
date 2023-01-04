package day0104;

import java.util.Scanner;

public class ArraysDdi_01 {

	public static void main(String[] args) {
		//이름과 태어난 연도를 입력받고 
			
		
		String[] ddi= {"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양"};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 이름은?");		
		String name=sc.nextLine();
		
		System.out.println("태어난 연도는?");
		int year=Integer.parseInt(sc.nextLine());
		
		
		for(int i=0;i<ddi.length;i++) {
			if(year%12==i) System.out.println(name+"님은 "+ddi[i]+"띠입니다.");
		}
					
		
	}

}
