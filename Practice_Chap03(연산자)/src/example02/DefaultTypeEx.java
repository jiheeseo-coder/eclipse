package example02;

public class DefaultTypeEx {

	public static void main(String[] args) {
		
		byte b1 = 127;
		byte b2 = 1;
		
		char ch = 'A';		// �ƽ�Ű�ڵ� : 65
		
		float f1 = 15.5f;
		
		double d1 = 10.5;
		
		
		// b1 + b2�� integer Ÿ������ �ٲ� b3�� int�� ��. �׷��� ������.
		//byte b3 = b1 + b2;

		// �����ذ� 1 : int ������ �޾��ָ� �ȴ�.
		int a1 = b1 + b2;
		// �����ذ� 2 : ���� ĳ���� �ؾ� �Ѵ�. + �����÷ο� �߻�
		byte a2 = (byte)(b1+b2);
		
		int i1 = ch + b2;		//65 + 1
		
		// ������ + �Ǽ��� --> ǥ�������� ���� ������ ����ȯ �Ǿ� ������ �̷����
		//int i2 = b1+f1;
		float i2 = b1+f1;
		
		//float i3 = f1 + d1 ; �ϸ� ����, ū������ ���ϱ� �Ǳ� ������...�̰� ������ ���迡 ���Դ��Ű���
		// ��Ʈ �� ���°ǵ� 2����Ʈ + 8����Ʈ �ϸ� 2����Ʈ�� 8����Ʈ�� ģ�ٰ�.
		double i3 = f1 + d1;
		
		System.out.println(a1 + ", "+a2+", "+i1);
		System.out.println(i2 + ", "+i3);
		
		
	}

}
