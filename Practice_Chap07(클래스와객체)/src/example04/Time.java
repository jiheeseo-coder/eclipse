package example04;

public class Time {

//	���������� (Access Modifier)�� ����
//	private : ���� Ŭ���� �������� ���� ������. ���� ���� ���ٹ���
//	protected : ���� ��Ű��, �ڼ�Ŭ���������� ���� ������.
//	(default) : ���� ��Ű�������� ���� ������.
//	public : ������ ���� ������.
	
	// ���α׷����� �� ��, ��������� �����ϸ� private ���������ڷ�
	// �����ְ�(ĸ��ȭ), �� ��������� �ش��ϴ� getter()�� �������ִ� 
	// ������� Ŭ������ �ۼ��ϴ� ����� �ùٸ���.
	private int hour;
	private int minute;
	private int second;
	
	// getter()�޼ҵ�
//	public int getHour() {
//		return this.hour;
//	}

	// Source�� -> Generate getter and setter�� Ŭ�� ��
	// ���ϴ� ��������� üũ �ϼż� getter, setter �޼��带
	// �ڵ� �ϼ��� �ϸ� �ȴ�.
	// getter() : ��������� ���� �о�� �޼���
	// setter() : ��������� ���� �����ϴ� �޼���
	
	public int getHour() {
		return this.hour;
	}
	
	// �ÿ� ���� ����ó�� �ڵ带 �ۼ�
	public void setHour(int hour) {
		if(hour < 0 ||hour > 24) {
			System.out.println("�ð��� �߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		this.hour = hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	// �п� ���� ����ó�� �ڵ带 �ۼ�
	public void setMinute(int minute) {
		if(minute < 0 ||minute > 60) {
			System.out.println("���� �߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		this.minute = minute;
	}
	
	public int getSecond() {
		return this.second;
	}
	
	public void setSecond(int second) {
		if(second < 0 ||second > 60) {
			System.out.println("�ʸ� �߸� �Է��ϼ̽��ϴ�.");
			return;
		}
		this.second = second;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getHour() + "�� " + this.getMinute() + "�� " + this.getSecond()	+ "��";
	}
	
	
}
