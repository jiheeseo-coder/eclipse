package example01;

public class CardEx {

	public static void main(String[] args) {
		
		
		//ctrl + pageup: �������� �̵�
		//ctrl + pagedown: �������� �̵�
		
		Card card1 = new Card();
		card1.setColor("���");
		card1.setCompany("��������");
		
		System.out.println(card1.toString());
		card1.show();		// �޼ҵ�� �׳� ȣ����. print �ȿ� ������ �ȵ�!
		System.out.println();
		// static������ �ݵ�� Ŭ������.static���������� �����Ͽ��� ��
		// ���������� �м��ϴ� �ܰ迡���� �ٲ��� �ʴ°� �ٶ����� ���.
		//card1.width = 80;
		//card1.height = 50;
		Card.width = 80;
		Card.height = 150;
		
		Card card2 = new Card();
		card2.setColor("�Ķ�");
		card2.setCompany("����");
		
		System.out.println(card2);
		
		
	}

}
