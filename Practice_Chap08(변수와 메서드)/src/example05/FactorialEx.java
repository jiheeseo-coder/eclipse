package example05;

public class FactorialEx {

	public static void main(String[] args) {
		
		System.out.println("5! = " + factorial(5L));
		// 프린트 함수가 먼저 실행되고 팩토리얼이 그 다음 스택에 쌓임
		// factorial() 함수가 종료되고 다음에 println()함수가 종료됨

	}
	
	public static long factorial(long n) {
	
		long result = 0L;
		
		// n이 1이 될 때, 재귀호출이 끝난다. f(1) = 1
		if (n==1)
			result = 1;
		else {
			System.out.println("result값: "+result+"n값: "+n);
			result =  n * factorial(n-1);		// 재귀호출이 이루어지는곳
		} 
		
		return result;
	}

}
