package example01;

public class VarEx03 {

	public static void main(String[] args) {


		byte b1 = 127;
		//byte b2 = b1 + 2; 	//�����÷ο� �߻�
		byte b2 = (byte)(b1 + 4);
		
		System.out.println(b1);
		// 127 ���ķ� -128, -127,... ������ �ö�
		System.out.println("����ĳ���� �� : "+b2);
		
		int i = b1;		//�ڵ�ĳ����(����ȯ�ڵ� ���� ����)
		System.out.println("�ڵ�ĳ���� �� : "+i);
		
		byte b3;
		int i2 = 350;
		b3 = (byte)i2;	//����ĳ���� (ū ����Ʈ -> ���� ����Ʈ(������ �ս�))
		System.out.println(b3);
		
		//������ �Ǽ����� ĳ����(�����ϴ� ����� Ʋ���� ������
		//�ݵ�� ������ �ս��� �ְ� �ƿ﷯ ����� ĳ���� �ڵ尡 ������)
		int i3 = 100;
		float f1 = (float)i3;	//����ȯ ���� ����
		System.out.println("����->�Ǽ� : "+f1);
		
		
		float f2 = 10.25F;
		int i4 = (int)f2;
		System.out.println(f2);
		System.out.println("�Ǽ�->���� : "+i4);		//0.55������ �ս� �Ͼ

		char ch = 'a';
		int i5 = ch;
		//���ڰ��� ����Ÿ������ �ٲٰ� �Ǹ�,
		//�ƽ�Ű�ڵ� ������ �ٲ������ ����ϰ� �ȴ�.
		
		System.out.println(ch);
		System.out.println("����->���� : "+i5);
		
		int i6 = 100;
		String str = "�ڹ� " + i6;	//���ڿ� + anytype => ���ڿ� Ÿ��
		System.out.println(str);
		
		
	}

}
