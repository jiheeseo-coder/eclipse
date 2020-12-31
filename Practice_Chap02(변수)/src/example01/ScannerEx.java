package example01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		// ctrl + shift + O 자동임포트 
		// Scanner 클래스는 입력을 받기 위한 클래스이고, 입력스트림
		// 자원(Resource)은 사용하고 나서 반드시 닫아줘야 된다.
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
//		System.out.print("정수 한자리를 입력하세요 : ");
//		int num = sc.nextInt();
//		System.out.println(num+"을 받았습니다.");
//		
//		System.out.print("\n실수를 입력하세요 : ");
//		double num1 = sc.nextDouble();
//		System.out.println(num1+"을 받았습니다.");
//		
//		System.out.print("문자를 입력하세요 : ");
//		String str = sc.next();		//공백을 기준으로 문자 입력을 받는다.(단어입력
//		System.out.println(str+"   을 받았습니다.");
//		
//		System.out.print("\n문장을 입력하세요 : ");
//		//nextLine()은  엔터키를 입력할 때까지 문자열들을 입력받는다.- 문장을 입력
//		String str1 = sc1.nextLine();
//		System.out.print(str1+"   을 받았습니다.");
//		
		
		
		int result = 100;
		System.out.print("숫자를 입력하세요 : ");
		String num = sc.nextLine();
		// Integer.parseInt() : 문자열로 입력받은 숫자들을 문자열이 아니라
		// 숫자로 바꿔주는 역할을 하는 메서드
		System.out.println(num + result);
		System.out.println(Integer.parseInt(num) + result);
		
		sc.close();		//입력스트림 닫아주는 코드 (처음써봄,,)
		sc1.close();
		
		
	}

}
