package example02;

public class BitOperatorEx {

	public static void main(String[] args) {


		// &, |, ^ 3개를 비트연산자 라고 한다.
		
		// 8 : 100
		//-8 : 11111111111111111111111111111000 (2의 보수)
		int x = 8;
		int y = 5;
		
		System.out.println("x를 이진수로 변환 결과 : "+Integer.toBinaryString(x));
		System.out.println("y를 이진수로 변환 결과 : "+Integer.toBinaryString(y));

		// AND 연산은 둘 다 1일때 1을 준다.
		// OR 연산은 하나다로 1이면 1을 준다.
		// XOR(exclusive or)배타적 논리합 : 서로 다를 때 1을 준다
		System.out.println("x와 y를 비트 &(AND)연산 결과 : " + (x & y));
		System.out.println("x와 y를 비트 |(OR)연산 결과 : " + (x | y));
		System.out.println("x와 y를 비트 ^(XOR)연산 결과 : " + (x ^ y));
		
		
		
		
	}

}
