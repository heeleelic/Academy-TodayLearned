package day0106;

import day0106_1.Test_03;

public class TestMain_03 {

	public static void main(String[] args) {
	
		//private 생성자일 경우
		//Test_03 t1=new Test_03(); -> 같은 클래스가 아니어서 안 된다.
		
		Test_03 t1=Test_03.getInstance();
		t1.writeMessage();

	}

}
