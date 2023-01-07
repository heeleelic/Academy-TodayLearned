package restTime;

public class Knight {

	public static void main(String[] args) {
		
		
		String str="a1";
		
		int row=str.charAt(1);
		//'1'은 49이다. 
		
		int column=str.charAt(0);
		// 'a'는 97이다.
		
		System.out.println("변경 전 row = "+row); //49
		System.out.println("변경 전 column = "+column); //97
		

		int row1=str.charAt(1)-'0'; 		
		//'0'은 int형으로 48이다. 
		//따라서 '1'(49)를 1로 만드려면 '0'(48)을 빼주면 된다.
		//'2'(50)를 2로 만드려면 '0'(48)을 빼주면 된다. 
		
		
		int column1=str.charAt(0)-'a'+1;
		//'a'는 int형으로 97이다.
		//따라서 'a'(97)를 1로 만드려면 'a'(97)를 뺴주고 1을 더하면 된다.
		//'b'(98)을 2로 만드려면 'a'(97)을 빼주고 1을 더하면 된다. 
		
			
		System.out.println();
		System.out.println("변경 후 row = "+row1); //1
		System.out.println("변경 후 column = "+column1); //1
		
		
		
	}

}
