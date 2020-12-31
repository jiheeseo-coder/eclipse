package example02;

import java.util.Scanner;

public class InputGugudan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단을 출력합니다.");
		System.out.print("몇 단부터 출력할까요? : ");
		int start = sc.nextInt();
		
		System.out.print("끝 단은 얼마인가요?");
		int end = sc.nextInt();
		
		for (; start<=end; start++) {
			System.out.println("**** "+start+"단 ****");
			for (int j = 1; j<10; j++) {
				System.out.println(start+" * "+j+" = "+start*j);
			}
			System.out.println("************");
			System.out.println();
		}
		
		sc.close();
		
		// 이건 for의 무한loop
//		for(;;) {
//			System.out.println("----");
//		}
		
		// 이건 while의 무한 loop
		// 와 무한 loop아래에 코드 작성하면 도달하지 않는 코드라고 해서
		// 실행이 안되네 신기,,
//		while(true) {
//		
//		}
		
		

	}

}
