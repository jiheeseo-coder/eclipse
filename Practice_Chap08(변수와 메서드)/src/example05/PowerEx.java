package example05;

import java.util.Scanner;

public class PowerEx {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		int result = 0;
		
		System.out.print("밑수를 입력하시오: ");
		int x = s.nextInt();
		System.out.print("지수를 입력하시오: ");
		int n = s.nextInt();
		System.out.printf("%d의 %d제곱: %d",x,n,power(x,n));
		System.out.println();
		
		for(int i = 1; i<=n; i++)
			result += power(x, i);
		
		System.out.printf("%d의 %d제곱까지의 합: %d",x,n,result);
		
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
