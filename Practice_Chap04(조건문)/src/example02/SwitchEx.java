package example02;

public class SwitchEx {

	public static void main(String[] args) {

		int score = 85;
		
		// int ������ ������, String��
		// 10 ������ �� ���� �Ź��� ����� �� ������..������
		switch (score/10) {
		case 9:
			System.out.println("A��� �Դϴ�");
			break;
		case 8:
			System.out.println("B��� �Դϴ�");
			break;
		case 7:
			System.out.println("C��� �Դϴ�");
			break;
		default:
			System.out.println("D��� �Դϴ�.");
			break;
		}
		
	}

}
