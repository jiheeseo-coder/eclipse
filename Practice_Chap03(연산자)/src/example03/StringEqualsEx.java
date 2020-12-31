package example03;

public class StringEqualsEx {

	public static void main(String[] args) {
		// ������ Ÿ���� ==, !=�� ���ؼ� ������ �� �ִ�.

		// ���ͷ��� ��� ���� ���� �ִ���, ���� �޸� ����(heap)�� �ִ��� 
		// Ȯ���ϰ�, ���� �ִٸ� ���� �ּ� ����. ���ٸ� ���ο� ����
		// �ν��Ͻ��� ��������
		String str1 = "�ڹ�";
		String str2 = "�ڹ�";
		// new������ ���� ������ ���ο� �ν��Ͻ��� ������.
		String str3 = new String("�ڹ�");
		String str4 = "�ڹ�";		// �̰� 1�̶� 2�� ������ ����Ű�� str3�� false��� ����.
		
		//������ Ÿ�Կ��� ���� == �� �ּҺ񱳸� �ϰ� �ִ�.
		boolean result = (str1 == str2);
		System.out.println("str1 == str2 : "+result);

		result = (str1 == str3);
		System.out.println("str1 == str3 : "+result);

		
		
		//String Ŭ������ equals()�� �ּҿ� ������� ���� ���ٸ�,
		//������ true�� ������
		result = str1.equals(str2);
		System.out.println("str1.equals(str2) : "+result);
		
		result = str1.equals(str4);
		System.out.println("str1.equals(str3) : "+result);
		
		
		
	}

}
