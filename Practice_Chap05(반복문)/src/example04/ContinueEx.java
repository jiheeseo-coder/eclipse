package example04;

import java.util.Scanner;

public class ContinueEx {

	public static void main(String[] args) {

		// 1~100 ���̿��� ¦���� ����ϴ� ���α׷�

//		for(int i = 1; i<= 100; i++) {
//			if(i%2 != 0) {
//				continue;
//			}
//			System.out.println("¦���� ��� : "+i);
//		}

//		for(int i = 1; i<= 100; i++) {
//			if(i%3 != 0 || i%2 != 0) {
//				continue;
//			}
//			System.out.println("2�� 3�� ����� : "+i);
//		}

		// �Ҽ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�
		Scanner sc = new Scanner(System.in);

		System.out.print("����� �Ҽ��� ���Ͻðڽ��ϱ�? : ");
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
