package example02;

public class SwitchNestedEx {

	public static void main(String[] args) {
		
		int number = 7;
		
		// ����ȭ �� ��, ������ �ִ� ���鿡�Դ� switch�� �������� ����.(if���� ���ؼ�)
		
		
		
		// ������ �̷��� �� �Ⱦ�
		switch (number) {
		case 1:
		case 7:
			// ��ø switch�� Ȱ��
			switch(number) {
			case 1:
				System.out.println("011 �̽ñ���");
				break;
			case 7:
				System.out.println("017 �̽ñ���");
				break;
			}
			break;
		case 6:
		case 9:
//			switch(number) {
//			case 1:
//				System.out.println("016 �̽ñ���");
//				break;
//			case 7:
//				System.out.println("019 �̽ñ���");
//				break;
//			}
			
			if(number == 9) 
				System.out.println("019 �̽ñ���");
			else if(number == 6)
				System.out.println("016 �̽ñ���");
		}

	}

}
