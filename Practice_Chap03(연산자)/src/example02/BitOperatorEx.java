package example02;

public class BitOperatorEx {

	public static void main(String[] args) {


		// &, |, ^ 3���� ��Ʈ������ ��� �Ѵ�.
		
		// 8 : 100
		//-8 : 11111111111111111111111111111000 (2�� ����)
		int x = 8;
		int y = 5;
		
		System.out.println("x�� �������� ��ȯ ��� : "+Integer.toBinaryString(x));
		System.out.println("y�� �������� ��ȯ ��� : "+Integer.toBinaryString(y));

		// AND ������ �� �� 1�϶� 1�� �ش�.
		// OR ������ �ϳ��ٷ� 1�̸� 1�� �ش�.
		// XOR(exclusive or)��Ÿ�� ���� : ���� �ٸ� �� 1�� �ش�
		System.out.println("x�� y�� ��Ʈ &(AND)���� ��� : " + (x & y));
		System.out.println("x�� y�� ��Ʈ |(OR)���� ��� : " + (x | y));
		System.out.println("x�� y�� ��Ʈ ^(XOR)���� ��� : " + (x ^ y));
		
		
		
		
	}

}
