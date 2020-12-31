package example03;

import java.util.Arrays;

public class StringArrayEx {

	public static void main(String[] args) {
		// String 배열
//		String str = new String("자바");
//		System.out.println(str);
	
		// 객체(클래스) 배열	 --  2차원 배열
		String[] str = new String[] {
				"안녕", "홍길동", "김연아"
		};
		
		for(int i = 0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		str[0] = "가자";
		
		System.out.println("\n향상된 for문");
		// 향상된 for문
		for(String a :str) {
			System.out.println(a);
		}
		
		
		System.out.println();
		System.out.println(Arrays.toString(str));
		
		System.out.println();
		// 배열의 toString은 주소나옴!
		System.out.println("String 배열의 주소 : "+str.toString());
		// Object 클래스는 모든 클래스의 최고 조상
		// String 클래스는 Object클래스의 toString() 오버라이딩(재정의)@@!!
		System.out.println("String 배열의 주소 : "+str[0].toString());

	}

}
