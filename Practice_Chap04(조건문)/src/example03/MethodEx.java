package example03;

// Ŭ���� ����
public class MethodEx {

	// �޼ҵ��� �����
	// 1. return Ÿ��(��ȯ��): int
	// 2. �޼ҵ� �̸�
	// 3. (): �Ű�����, ���ڰ�, Arguments <- å���� �ٸ�
	// �޼ҵ� ����� �߿䵵(98%), �޼ҵ� ������(���Ǻ�){}
	
	public static int add(int n1 , int n2) {
		System.out.println("add �޼ҵ� ȣ���");
		return n1 + n2;
	}
	
	public static int minus(int n1, int n2) {
		System.out.println("minus �޼ҵ� ȣ���");
		return n1 - n2;
	}
	
	public static int mul(int n1, int n2) {
		System.out.println("mul �޼ҵ� ȣ���");
		return n1 * n2;
	}
	
	public static int dev(int n1, int n2) {
		System.out.println("dev �޼ҵ� ȣ���");
		return n1 / n2;
	}
	
	// ���� �޼ҵ� ���
	public static void main(String[] args) {
		
		int num1 = 1023;
		int num2 = 0432;
		
		// static �� ���� �޼ҵ�� �긲ü�� ����.
		// ������ MethodEx.add() �̷��� ȣ���ؾ� �ϴµ� ���� Ŭ������ ���� ����
		// ���� ���� ����(call by value)
		int result = add(num1,num2);
		
		System.out.println("num1 + num2 : " + result);
		System.out.println("num1 + num2 : " + add(num1,num2));
		
		// ���� ���� ����(call by value)
		result = minus(num1, num2);
		System.out.println("num1 - num2 : " + result);
		
		// ���� ���� ����(call by value)
		result = mul(num1, num2);
		System.out.println("num1 - num2 : " + result);

		// ���� ���� ����(call by value)
		result = dev(num1, num2);
		System.out.println("num1 - num2 : " + result);
		
	}

}
