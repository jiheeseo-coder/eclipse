package example05;

public class FactorialEx {

	public static void main(String[] args) {
		
		System.out.println("5! = " + factorial(5L));
		// ����Ʈ �Լ��� ���� ����ǰ� ���丮���� �� ���� ���ÿ� ����
		// factorial() �Լ��� ����ǰ� ������ println()�Լ��� �����

	}
	
	public static long factorial(long n) {
	
		long result = 0L;
		
		// n�� 1�� �� ��, ���ȣ���� ������. f(1) = 1
		if (n==1)
			result = 1;
		else {
			System.out.println("result��: "+result+"n��: "+n);
			result =  n * factorial(n-1);		// ���ȣ���� �̷�����°�
		} 
		
		return result;
	}

}
