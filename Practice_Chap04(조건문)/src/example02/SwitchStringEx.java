package example02;

public class SwitchStringEx {
	
	public static void main(String[] args) {
		
		String str = "����";
		
		// ���ڿ��� �������� �Դ�.
		switch(str) {
		case "����" :
			System.out.println("450����");
		case "����" :
			System.out.println("400����");
		case "����" :
			System.out.println("350����");
		case "�븮" :
			System.out.println("300����");
		case "���" :
			System.out.println("250����");
		default :
			System.out.println("���� �����̿���");
		}
		
		
	}
}
