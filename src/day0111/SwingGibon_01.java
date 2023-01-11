package day0111;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class SwingGibon_01 extends JFrame{	
	/* 1.생성자 만들어서 인자 보낸다.
	*2. 슈퍼에 인자 넣는다.
	*3. this.메서드 활용한다.
	*4. 안에 공간은 '컨테이너'*/
	
	Container cp; //컨테이너 얻기
	
	
	public SwingGibon_01(String title) {
		super(title);
		
		//시작 위치, 너비, 높이
		this.setBounds(500, 100, 300, 500);
		
		
		//색상
		//프레임 위의 컨테이너를 얻은 후 변경해야 한다
		cp=this.getContentPane();
		cp.setBackground(new Color(255,255,200)); 
		
		//프레임 보이게 하기
		this.setVisible(true);
				
	}
	
	public static void main(String[] args) {
		

		//생성자 호출, new만 써도 된다.
		new SwingGibon_01("스윙 기본");
		
	}

}
