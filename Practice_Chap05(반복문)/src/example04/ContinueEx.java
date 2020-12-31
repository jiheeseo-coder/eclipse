package example04;

import java.util.Scanner;

public class ContinueEx {

	public static void main(String[] args) {

		// 1~100 사이에서 짝수만 출력하는 프로그램

//		for(int i = 1; i<= 100; i++) {
//			if(i%2 != 0) {
//				continue;
//			}
//			System.out.println("짝수만 출력 : "+i);
//		}

//		for(int i = 1; i<= 100; i++) {
//			if(i%3 != 0 || i%2 != 0) {
//				continue;
//			}
//			System.out.println("2와 3의 공배수 : "+i);
//		}

		// 소수를 구하는 프로그램을 작성하시오
		Scanner sc = new Scanner(System.in);

		System.out.print("몇까지 소수를 구하시겠습니까? : ");
		int n = sc.nextInt();

		int ncount = 0;
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}

			}
			if (count == 2) {
				System.out.print(i);
				System.out.print("\t");
				ncount++;
				if (ncount%4 ==0)
					System.out.println();
			}
		}

		sc.close();
	}

}
