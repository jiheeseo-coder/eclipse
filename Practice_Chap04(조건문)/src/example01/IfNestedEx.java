package example01;

import java.util.Scanner;

public class IfNestedEx {

	public static void main(String[] args) {
		
	// sc�� Resource�̱� ������ �ݾ���� �Ѵ�.
			Scanner sc = new Scanner(System.in);
			
			System.out.print("������ �Է��ϼ��� : ");
			int score = sc.nextInt();
			
			// ��ø if��(������������ ���� if���� �� �� �ִ�.
			// ����, ��ø if���� 2���� �ʰ����� �ʤ��� �ϴ°� ������ �������� ����.
			if(score >= 90) {
				if(score >= 95) {
					System.out.println("����� A+����Դϴ�.");
				}
				else {
					System.out.println("����� A0����Դϴ�.");
				}
			}else if(score >= 80) {
				if(score >= 85) {
					System.out.println("����� B+����Դϴ�.");
				}
				else {
					System.out.println("����� B0����Դϴ�.");
				}
			}
			
			
			sc.close();

	}

}
