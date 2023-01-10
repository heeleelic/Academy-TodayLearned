package day0110;

import java.util.Scanner;



public class SawonMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
				
		System.out.println("사원명은?");
		String name=sc.nextLine();		
				
		System.out.println("기본급은?");
		int pay=Integer.parseInt(sc.nextLine());
		
		System.out.println("총 가족 수는?");
		int fam=Integer.parseInt(sc.nextLine());
		
		System.out.println("초과근무 시간 수는?");
		int over=Integer.parseInt(sc.nextLine());
		
		Sawon s=new Sawon(name, pay, fam, over);
		
		
		Sawon.printTitle();
		s.printInfo();
		

		}
		
		
		
		
		
		
	}


