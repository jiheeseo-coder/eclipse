package example01;

public class VarEx03 {

	public static void main(String[] args) {


		byte b1 = 127;
		//byte b2 = b1 + 2; 	//오버플로우 발생
		byte b2 = (byte)(b1 + 4);
		
		System.out.println(b1);
		// 127 이후로 -128, -127,... 순으로 올라감
		System.out.println("강제캐스팅 후 : "+b2);
		
		int i = b1;		//자동캐스팅(형변환코드 생략 가능)
		System.out.println("자동캐스팅 후 : "+i);
		
		byte b3;
		int i2 = 350;
		b3 = (byte)i2;	//강제캐스팅 (큰 바이트 -> 작은 바이트(데이터 손실))
		System.out.println(b3);
		
		//정수와 실수간의 캐스팅(저장하는 방식이 틀리기 때문에
		//반드시 데이터 손실이 있고 아울러 명시적 캐스팅 코드가 들어가야함)
		int i3 = 100;
		float f1 = (float)i3;	//형변환 생략 가능
		System.out.println("정수->실수 : "+f1);
		
		
		float f2 = 10.25F;
		int i4 = (int)f2;
		System.out.println(f2);
		System.out.println("실수->정수 : "+i4);		//0.55데이터 손실 일어남

		char ch = 'a';
		int i5 = ch;
		//문자값을 정수타입으로 바꾸게 되면,
		//아스키코드 값으로 바뀌어져서 출력하게 된다.
		
		System.out.println(ch);
		System.out.println("문자->정수 : "+i5);
		
		int i6 = 100;
		String str = "자바 " + i6;	//문자열 + anytype => 문자열 타입
		System.out.println(str);
		
		
	}

}
