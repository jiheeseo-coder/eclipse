package example03;

public class LogicalOperEx {

	public static void main(String[] args) {
		// �������� (&&, ||)�� ���ؼ� �ڵ�� �����Ѵ�.
		
		boolean result = false;
		int i = 10;
		char ch = 'b';
		
		result = (i > 5);
		System.out.println("(i > 5) : "+result);

		result = (i >= 9) && (i < -8);
		System.out.println("(i >= 9) && (i < -8) : "+result);
		
		result = (i >= 9) || (i < -8);
		System.out.println("(i >= 9) || (i < -8) : "+result);
		
		// ���ĺ� �ҹ������� Ȯ���ϴ� ��
		result = (ch >= 'a' && ch <= 'z');
		System.out.println("(ch >= 'a' && ch <= 'z') : "+result);
		
		// ch�� ����� ���� ���ĺ����� Ȯ���ϴ� ��
		result = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'B');
		System.out.println("���ĺ� : "+result);
		
		
		
	}

}
