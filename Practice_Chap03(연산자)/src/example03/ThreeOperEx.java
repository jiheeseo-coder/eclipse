package example03;

import java.util.Scanner;

public class ThreeOperEx {

	public static void main(String[] args) {
		// ���׿����ڸ� ����ϴ� ����� ���������� �Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ϳ��� ������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		
		// (���ǽ�) ? 1 : 2
		char grade = (score >= 90) ? 'A' : 'B';
		System.out.println("����� ��� : " + grade);
		
		// ���׿����ڸ� ��ø
		grade = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');
		System.out.println("����� ��� : " + grade);
		
		sc.close();

	}

}
