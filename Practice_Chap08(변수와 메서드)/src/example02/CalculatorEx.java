package example02;

public class CalculatorEx {

	public static void main(String[] args) {
	
		// 인스턴스 메소드 호출
		Calculator cal = new Calculator();
		int addr = cal.add(100, 200);
		System.out.println("add: " + addr);
		
		// static 메소드 호출
		long mulr = Calculator.mul(100, 20);
		System.out.println("multiply: "+mulr);
		
		double divr = Calculator.div(100, 20);
		System.out.println("divide: " + divr);
		
		// static 메소드는 글씨가 기울어짐
		// 정적 메서드의 예시(선언부에 static제어자가 붙어있다.) -- 자바닥스에서 확인
		//Integer.parseInt("100");
		//Math.random();
		
	}

}
