package example03;

public class RandomEx {

	public static void main(String[] args) {
		
		// Math.random()���� 0.00000~0.999990 ������ ���� �߻���Ŵ
		//System.out.println(Math.random());
		
		//�ֻ��� ���� �������� �߻�
		// ((int)Math.random()*6)+1 => �ϸ� 1�� ���� 
		int num = (int)(Math.random()*6) + 1;	//1~6������ ������ ���� �߻���Ű�� ��
		System.out.println(num);

		switch (num) {
		case 1 : 
			System.out.println("1�� ���Գ׿�!");
			break;
		case 2 :
			System.out.println("2�� ���Գ׿�!");
			break;
		case 3:
			System.out.println("3�� ���Գ׿�!");
			break;
		case 4:
			System.out.println("4�� ���Գ׿�!");
			break;
		case 5:
			System.out.println("5�� ���Գ׿�!");
			break;
		case 6:
			System.out.println("6�� ���Գ׿�!");
			break;
		default:
			System.out.println("�ùٸ��� ���� �����Դϴ�.");
		}
		// ���� ������ if�� ����ġ�� �ٲ���� ��
		
	}

}
