package example01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		// ctrl + shift + O �ڵ�����Ʈ 
		// Scanner Ŭ������ �Է��� �ޱ� ���� Ŭ�����̰�, �Է½�Ʈ��
		// �ڿ�(Resource)�� ����ϰ� ���� �ݵ�� �ݾ���� �ȴ�.
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
//		System.out.print("���� ���ڸ��� �Է��ϼ��� : ");
//		int num = sc.nextInt();
//		System.out.println(num+"�� �޾ҽ��ϴ�.");
//		
//		System.out.print("\n�Ǽ��� �Է��ϼ��� : ");
//		double num1 = sc.nextDouble();
//		System.out.println(num1+"�� �޾ҽ��ϴ�.");
//		
//		System.out.print("���ڸ� �Է��ϼ��� : ");
//		String str = sc.next();		//������ �������� ���� �Է��� �޴´�.(�ܾ��Է�
//		System.out.println(str+"   �� �޾ҽ��ϴ�.");
//		
//		System.out.print("\n������ �Է��ϼ��� : ");
//		//nextLine()��  ����Ű�� �Է��� ������ ���ڿ����� �Է¹޴´�.- ������ �Է�
//		String str1 = sc1.nextLine();
//		System.out.print(str1+"   �� �޾ҽ��ϴ�.");
//		
		
		
		int result = 100;
		System.out.print("���ڸ� �Է��ϼ��� : ");
		String num = sc.nextLine();
		// Integer.parseInt() : ���ڿ��� �Է¹��� ���ڵ��� ���ڿ��� �ƴ϶�
		// ���ڷ� �ٲ��ִ� ������ �ϴ� �޼���
		System.out.println(num + result);
		System.out.println(Integer.parseInt(num) + result);
		
		sc.close();		//�Է½�Ʈ�� �ݾ��ִ� �ڵ� (ó���ẽ,,)
		sc1.close();
		
		
	}

}
