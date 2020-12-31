package example01;

public class Card {
	
	// �ν��Ͻ� ���� -- �ݵ�� �ν��Ͻ��� �����ؾ� ���� ����
	private String color;			// ī���� ����
	private String company;			// ī���� ȸ���
	
	// static ����(����, Ŭ��������, ��������) -- �ν��Ͻ� ���� ���̵� Ŭ������. static ���������� ���� ����
	static int width = 100;			// ī���� ��
	static int height = 50;			// ī���� ����
	
	
	// Source -> Generate getter and setter
	// getter, setter �ν��Ͻ� �޼���
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	public void show() {
		// ���������� �ݵ�� �ʱ�ȭ�� �ؾ� �Ѵ�.
		// �޼��� �ȿ� static ������ ������� ���Ѵ�. ��������
		// static�� Ư���� �ν��Ͻ� �������̵� �󸶵��� ���� �����ؾ� �ϴµ�,
		// ���� �ν��Ͻ��� �������� �ƹ��� �𸣱� ������ �̷��� �ڵ带 �ۼ��ϴ� ����
		// �ùٸ� ����� �ƴϴ�.
		// static int i = 10;
		String color = this.color;
		String company = this.company;
		
		System.out.println(color + ", " + company);
	}
	
	/*
	public static void show2() {
		// ���⼭ �������� ����
		// static �Լ��� �������� �ҷ��� �� �� �ִµ�, this�� new�� ����������� ����� ������.
		// �� ���� new�� ������ �𸣱� ������ ������ ���°���.
		String color = this.color;
		String company = this.company;
	}
	*/
	
	@Override
	public String toString() {
		// ��������(static)�� ���ٹ���� �ݵ�� Ŭ������.static������ ���� �����ؾ���
		return "card1�� ����: " + this.getColor()+ "\ncard1�� ȸ��: " + this.getCompany()+
				"\nũ��: (" + Card.height+", "+ Card.width+")\n";			// this.height �ϸ� �ȵ�
	}
	
}
