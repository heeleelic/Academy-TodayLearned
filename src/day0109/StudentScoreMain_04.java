package day0109;

import java.util.Scanner;

public class StudentScoreMain_04 {
	
	//출력 메서드
	public static void printStu(StudentScore_04[] stu) {
		System.out.println("학교명: 쌍용고등학교");
		System.out.println("이름\tJAVA\tHTML\t총점\t평균\t평가");
		
		for(StudentScore_04 s:stu) {
			System.out.println(s.getName()+"\t"+s.getJava()+"\t"+s.getHtml()+"\t"+s.getTotal()+"\t"+s.getAverage()+"\t"+s.getEvaluation());
		}
	}

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		
		int number;
		StudentScore_04[] students;
		
		
		System.out.println("총 몇 명?");
		number=Integer.parseInt(sc.nextLine());
		
		students=new StudentScore_04[number];
		
		
		for(int i=0;i<number;i++) {
			
			students[i]=new StudentScore_04();
			
			System.out.println("이름?");
			String name=sc.nextLine();
			
			System.out.println("java?");
			int java=Integer.parseInt(sc.nextLine());
			
			System.out.println("html?");
			int html=Integer.parseInt(sc.nextLine());
			
			students[i].setName(name);
			students[i].setJava(java);
			students[i].setHtml(html);
			
			System.out.println();
		}
		
		printStu(students);
		
		

	}

}
