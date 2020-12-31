package example02;

public class Calculator {

	// 인스턴스 메서드
	// 인스턴스 메소드 특징: new 연산자로 인스턴스를 생성해야지만, <참조변수명.인스턴스메소드명>으로 접근가능
	public int add(int x, int y) {
		return x+y;
	}
	
	public int sub(int x, int y) {
		return x-y;
	}
	
	// static(정적) 메서드
	// static의 특성: 인스턴스 생성 없이 <클래스명.정적메소드>로 바로 접근이 가능하다.
	public static long mul(long x, long y) {
		//static 메서드는 이미 메모리 상단에 올라가있고 인스턴스 생성없이 접근이 가능해야되는데
		// 아래 코드는 인스턴스가 생성되어야지만 사용가능한 add()가 왔기 때문에 예외가 발생하는 것이다.
		// 인스턴스가 언제 생성될지 아무도 모르기 때문에 static메서드안에는 인스턴스 메소드가
		// 절대로 오면 안된다.
		//this.add(10,5);
		return x * y;
	}
	
	public static double div(double x, double y) {
		return x / y;
	}
}
