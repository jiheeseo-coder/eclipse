package example03;

public class AssignOperEx {

	public static void main(String[] args) {
		// ���մ��� �����ڸ� ������ �� �ֵ��� ����.
		
		int result = 0;
		
		// ���մ��Կ����ڴ� ���� ������ų �� ���� ����Ѵ�.
		result += 10;		// result = result + 10;
		System.out.println("result : " + result);

		result -= 5;		// result = result - 5;
		System.out.println("result : " + result);

		result *= 5;		// result = result * 5;
		System.out.println("result : " + result);
		
		result /= 5;		// result = result / 5;
		System.out.println("result : " + result);

		result %= 5;		// result = result % 5;
		System.out.println("result : " + result);

		
	}

}
