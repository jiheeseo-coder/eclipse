package example01;

public class VarEx01 {

	public static void main(String[] args) {

		char ch = 'A';	// char ch = 'AB'; �̷��� x, �� ���ڸ� ���� ����
		int year = 0;
		int age = 22;
		long result = 10; // ����� L �Ⱥٿ�����(�ٵ� ���̴°� ���Űǰ��� ����)
		float result2 = 10.1f; // double�� �ٲٰų� f�� �ٿ���(�ȱ׷� ��������)
		double d = 0.23;
		
		// sys�� ġ�� ctrl + space ������ �ڵ��ϼ� ����� ����ȴ�.
		// ���ڸ����� ���
		
		System.out.println("���ڿ� ���� : "+ch);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(d);
		
		
		System.out.println(year+age);
		
		String str = new String("�ڹ�");
		System.out.println(str+"�� �����մϴ�.");
		System.out.println(str.toString());
		
		// ����� ���� Ŭ���� �̰ų� toSgring() �����Ǹ� ���� ����
		// Ŭ������ ���������� ����ϰ� �Ǹ�, �ڱ��� Ŭ����Ÿ�� @ 16���� �ּ�
		// ���´�.
		Object obj1 = new Object();
		System.out.println(obj1 + "�ڹ�");

	}

}
