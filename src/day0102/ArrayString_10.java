package day0102;

public class ArrayString_10 {

	public static void main(String[] args) {
		
		String[] str={"주하랑","성한경","최보현","지성웅"};
		
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		
		System.out.println("========================");
		
		for(String a:str) {
			System.out.println(a);
		}
		
		System.out.println("========================");
		
		int[] arr= {7,12,34,99,23};
		String[] colors= {"red","yellow","white","gray","black","cyan","pink"};
		
		
		
		System.out.println("arr 길이: "+arr.length);
		System.out.println("arr출력_#1");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("arr출력_#2");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("colors 길이: "+colors.length);
		System.out.println("colors출력_#1");
		for(int i=0;i<colors.length;i++) {
			System.out.print(colors[i]+" ");
		}
		
		System.out.println();
		System.out.println("colors출력_#2");
		for(String b:colors) {
			System.out.print(b+" ");
		}
		

	}

}
