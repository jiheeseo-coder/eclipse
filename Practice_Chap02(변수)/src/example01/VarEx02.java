package example01;

public class VarEx02 {
	
	// Ŭ������ ����  : ��������
	int a; // �ڵ����� �ʱ�ȭ �� 0����.
	
	//�޼ҵ� �� �� ������ ��.
	public static void main(String[] args) {
		
		//�޼ҵ�� ���� : ��������
		
		int number;		// 4����Ʈ��ŭ ������ �޸�(����)�� �Ҵ���. ����
		number = 200;	// �ʱ�ȭ
		int number2 = 500;	// ����� ���ÿ� �ʱ�ȭ
		
		// ���� ���� �ָ� �ȵ�
		// double int = a;
		double dum = 10.1;
		
		
		// ���(������ �ʴ� ��)�� ����� ���ÿ� �ʱ�ȭ�� �� ��
		// �ٽ� �� ������� �����Ű�� �ڵ尡 ���� �ȵȴ�.
		final int MAX_NUMBER = 100;
		// MAX_NUMBER = 300;
		// ������� ���̻� �Ҵ��� �� ����.
		
		System.out.println(number);
		System.out.println(number2);
		System.out.println("��� :" +MAX_NUMBER);
		System.out.println("�Ǽ� :"+ dum);
		
		String str = new String("�ؾ");
		System.out.println(str);
		
		//null�� '����' (���� �ִ� �ּ�(�ؾ ����Ű�� �ּ�))
		// 			      �� ������� �ƹ��͵� ����Ű�� ����)
		str = null;
		System.out.println(str);
				
		
		
	}

}
