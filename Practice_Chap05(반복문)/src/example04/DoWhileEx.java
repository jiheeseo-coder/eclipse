package example04;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하시려면, q를 입력하세요");
		
		String str = null;
		
		// do-while문은 최소 한번 이상 무조건 수행을 하는 반복문이다.
		// 이유는 조건문이 뒷부분에 존재하기 때문이다.
		do {
			System.out.print("> ");
			
			// String 클래스 next()메소드는 공백만날때까지만 그 값을 리턴
			// next() : 한 단어 받을 때
			// nextLine() : 공백 포함하여 엔터키를 입력할때까지 문장을 리턴
			str = sc.nextLine();
			System.out.println("입력받은 메시지 : "+ str);
		}while(!str.equals("q"));
		
		System.out.println("프로그램 종료");
		sc.close();

	}

}
