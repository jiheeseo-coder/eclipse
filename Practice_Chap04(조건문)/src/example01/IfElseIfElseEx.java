package example01;

import java.util.Scanner;

public class IfElseIfElseEx {

	public static void main(String[] args) {
		
		// sc�� Resource�̱� ������ �ݾ���� �Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		
		// score������ ���� ���� �Ʒ��� ���ǹ����� �бⰡ �Ͼ�� �ִ� ����
		// �� ������ �ٽ��Դϴ�.
		if(score >= 90) {
			System.out.println("������ 90~100�� �����Դϴ�.");
			System.out.println("����� A�Դϴ�.");
		}
		else if(score >= 80) {
			System.out.println("������ 80~89�� �����Դϴ�.");
			System.out.println("����� B�Դϴ�.");
		}
		else if(score >= 70) {
			System.out.println("������ 70~79�� �����Դϴ�.");
			System.out.println("����� C�Դϴ�.");
		}
		else {
			System.out.println("������ 70 �̸��Դϴ�.");
			System.out.println("����� D�Դϴ�.");
		}
		
		sc.close();
		
		
	}

}
