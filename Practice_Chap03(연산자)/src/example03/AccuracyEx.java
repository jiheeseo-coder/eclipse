package example03;

public class AccuracyEx {

	public static void main(String[] args) {
		// CPU�� ������ ������ �����Ѵ�.
		
		int apple = 1;
		double unit = 0.1;
		int number = 7;
		
		double result = apple - (number * unit);
		double result2 = (number * unit);
		System.out.println(result2);
		
		System.out.println("��� �� ������ ");
		System.out.println("0.7 ������ ����, ");
		// CPU�� ���� ����.
		System.out.println(result + " ������ ���´�.");
		
		/*
		 * �� ���� ������ �����?
		 * double�� ���� ������ �о �̰� �ٳ����µ�
		 * �츮�� int�� �ϰ� �׷��ϱ� �������� �ϴ� ����.
		 * */

	}

}
