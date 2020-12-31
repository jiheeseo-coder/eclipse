package example03;

// 클래스 영역
public class MethodEx {

	// 메소드의 선언부
	// 1. return 타입(반환값): int
	// 2. 메소드 이름
	// 3. (): 매개변수, 인자값, Arguments <- 책마다 다름
	// 메소드 선언부 중요도(98%), 메소드 구현부(정의부){}
	
	public static int add(int n1 , int n2) {
		System.out.println("add 메소드 호출됨");
		return n1 + n2;
	}
	
	public static int minus(int n1, int n2) {
		System.out.println("minus 메소드 호출됨");
		return n1 - n2;
	}
	
	public static int mul(int n1, int n2) {
		System.out.println("mul 메소드 호출됨");
		return n1 * n2;
	}
	
	public static int dev(int n1, int n2) {
		System.out.println("dev 메소드 호출됨");
		return n1 / n2;
	}
	
	// 메인 메소드 블록
	public static void main(String[] args) {
		
		int num1 = 1023;
		int num2 = 0432;
		
		// static 이 붙은 메소드는 흘림체로 나옴.
		// 원래는 MethodEx.add() 이렇게 호출해야 하는데 같은 클래스라서 생략 가능
		// 값에 의한 복사(call by value)
		int result = add(num1,num2);
		
		System.out.println("num1 + num2 : " + result);
		System.out.println("num1 + num2 : " + add(num1,num2));
		
		// 값에 의한 복사(call by value)
		result = minus(num1, num2);
		System.out.println("num1 - num2 : " + result);
		
		// 값에 의한 복사(call by value)
		result = mul(num1, num2);
		System.out.println("num1 - num2 : " + result);

		// 값에 의한 복사(call by value)
		result = dev(num1, num2);
		System.out.println("num1 - num2 : " + result);
		
	}

}
