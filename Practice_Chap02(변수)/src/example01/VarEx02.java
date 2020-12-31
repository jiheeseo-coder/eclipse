package example01;

public class VarEx02 {
	
	// 클래스속 변수  : 전역변수
	int a; // 자동으로 초기화 됨 0으로.
	
	//메소드 를 한 블럭으로 봄.
	public static void main(String[] args) {
		
		//메소드속 변수 : 지역변수
		
		int number;		// 4바이트만큼 변수를 메모리(스택)을 할당함. 선언
		number = 200;	// 초기화
		int number2 = 500;	// 선언과 동시에 초기화
		
		// 예약어에 값을 주면 안돼
		// double int = a;
		double dum = 10.1;
		
		
		// 상수(변하지 않는 값)은 선언과 동시에 초기화를 한 후
		// 다시 그 상수값을 변경시키는 코드가 들어가면 안된다.
		final int MAX_NUMBER = 100;
		// MAX_NUMBER = 300;
		// 상수에는 더이상 할당할 수 없다.
		
		System.out.println(number);
		System.out.println(number2);
		System.out.println("상수 :" +MAX_NUMBER);
		System.out.println("실수 :"+ dum);
		
		String str = new String("붕어빵");
		System.out.println(str);
		
		//null은 '없다' (원래 있던 주소(붕어빵 가리키는 주소))
		// 			      는 사라지고 아무것도 가리키지 않음)
		str = null;
		System.out.println(str);
				
		
		
	}

}
