package example02;

public class DefaultTypeEx {

	public static void main(String[] args) {
		
		byte b1 = 127;
		byte b2 = 1;
		
		char ch = 'A';		// 아스키코드 : 65
		
		float f1 = 15.5f;
		
		double d1 = 10.5;
		
		
		// b1 + b2가 integer 타입으로 바뀌어서 b3에 int가 들어감. 그래서 오류남.
		//byte b3 = b1 + b2;

		// 오류해결 1 : int 형으로 받아주면 된다.
		int a1 = b1 + b2;
		// 오류해결 2 : 강제 캐스팅 해야 한다. + 오버플로우 발생
		byte a2 = (byte)(b1+b2);
		
		int i1 = ch + b2;		//65 + 1
		
		// 정수형 + 실수형 --> 표현범위가 넓은 쪽으로 형변환 되어 연산이 이루어짐
		//int i2 = b1+f1;
		float i2 = b1+f1;
		
		//float i3 = f1 + d1 ; 하면 오류, 큰쪽으로 더하기 되기 때문에...이거 리눅스 시험에 나왔던거같음
		// 비트 수 세는건데 2바이트 + 8바이트 하면 2바이트도 8바이트로 친다고.
		double i3 = f1 + d1;
		
		System.out.println(a1 + ", "+a2+", "+i1);
		System.out.println(i2 + ", "+i3);
		
		
	}

}
