package day0106;

class MyStuInfo{
	
	private String stuName;
	private String hp;
	private int score;
	
	//3중 생성자
	public MyStuInfo(String stuName,String hp,int score) {
		this.stuName=stuName;
		this.hp=hp;
		this.score=score;
	}
	
	//출력 메서드
	public void writeInfo() {
		System.out.println("이름: "+stuName);
		System.out.println("연락처: "+hp);
		System.out.println("성적: "+score);
	}
}



public class ArrayConst_09 {

	public static void main(String[] args) {
		
		//5명의 데이터를 넣기 위해 배열 사용
		
		/*MyStuInfo[] stu=new MyStuInfo[3];
		stu[0]=new MyStuInfo("아이린", "010", 85);
		stu[1]=new MyStuInfo("웬디", "010", 95);
		stu[2]=new MyStuInfo("조이", "010", 97);*/
		
		MyStuInfo[] stu= {
				new MyStuInfo("아이린", "010", 85),
				new MyStuInfo("웬디", "010", 95),
				new MyStuInfo("조이", "010", 97)			
		};
		
		
		//출력
		
		/*stu[0].writeInfo();
		stu[1].writeInfo();
		stu[2].writeInfo();*/
		
		/*for(int i=0;i<stu.length;i++) {
			stu[i].writeInfo();
		}*/
		
		for(MyStuInfo a:stu) {
			a.writeInfo();
		}
		
		
		
		

	}

}
