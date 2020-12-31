package example05;

import java.util.Scanner;

public class PowerEx {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		int result = 0;
		
		System.out.print("�ؼ��� �Է��Ͻÿ�: ");
		int x = s.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		int n = s.nextInt();
		System.out.printf("%d�� %d����: %d",x,n,power(x,n));
		System.out.println();
		
		for(int i = 1; i<=n; i++)
			result += power(x, i);
		
		System.out.printf("%d�� %d���������� ��: %d",x,n,result);
		
		s.close();
		
	}
	
	public static long power(int x, int n) {
		
		long result = 0;
		if (n==1) {
			result = x;
		}
		else {
			result = x * power(x, n-1);
		}
		return result;
	}

}
