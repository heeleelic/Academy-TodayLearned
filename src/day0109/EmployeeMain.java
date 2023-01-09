package day0109;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
				
		int number;
		Employee[] employees;
		
		System.out.println("총 몇 명?");
		Scanner sc=new Scanner(System.in);
		number=Integer.parseInt(sc.nextLine());
		
		employees=new Employee[number];
		
		
		
		for(int i=0;i<number;i++) {
			
			employees[i]=new Employee();
			
			System.out.println("이름?");
			String name=sc.nextLine();
			
			System.out.println("급여?");
			int basicPay=Integer.parseInt(sc.nextLine());
			
			System.out.println("가족 수?");
			int famNum=Integer.parseInt(sc.nextLine());
			
			System.out.println("초과근무 시간?");
			int overTime=Integer.parseInt(sc.nextLine());
			
			
			employees[i].setName(name);
			employees[i].setBasicPay(basicPay);
			employees[i].setFamNum(famNum);
			employees[i].setOverTime(overTime);
			
		}
		
		Employee.printTitle();
		
		for(Employee e:employees) {
			e.printInfo();
		}

	}

}
