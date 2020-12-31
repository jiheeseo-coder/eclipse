package example03;

public class AccuracyEx {

	public static void main(String[] args) {
		// CPU의 연산의 오차를 설명한다.
		
		int apple = 1;
		double unit = 0.1;
		int number = 7;
		
		double result = apple - (number * unit);
		double result2 = (number * unit);
		System.out.println(result2);
		
		System.out.println("사과 한 개에서 ");
		System.out.println("0.7 조각을 빼면, ");
		// CPU의 연산 오차.
		System.out.println(result + " 조각이 남는다.");
		
		/*
		 * 왜 연산 오차가 생길까?
		 * double은 수의 범위가 넓어서 이게 다나오는데
		 * 우리는 int만 하고 그러니까 눈속임을 하는 것임.
		 * */

	}

}
