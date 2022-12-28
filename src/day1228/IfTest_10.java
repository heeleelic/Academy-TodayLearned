package day1228;

public class IfTest_10 {

	public static void main(String[] args) {
		
		int score=88;
		String grade;
		
		/*if(score>89) grade="A";
		else if(score>79) grade="B";
		else if(score>69) grade="C";
		else if(score>59) grade="D";
		else grade="F";*/
		
		grade=score>89?"A":
			score>79?"B":
				score>69?"B":
					score>59?"D":"F";
			
		
		
		System.out.println(grade);

	}

}
