package example03;

public class Monitor {

	// �������(�ʵ�)
	String color;			// ������� ����
	int channel; 			// ä��
	int volume;				// ����
	boolean power; 			// ���� ����(on/off)
	
	// ����޼���
	// Monitor�� �Ѱų� ���� ����� �ϴ� �޼ҵ�
	public void power(){
		
		this.power = !power;
		
		if(this.power) 
			System.out.println("������ �������ϴ�.");
		else
			System.out.println("������ �������ϴ�.");
	
	}
	
	
	public void channelUp() {
		System.out.println("���� ä�� : "+(++this.channel));
	}
	
	public void channelDown() {
		System.out.println("���� ä�� : "+(--this.channel));
	}
	
	
	public void volumeUp() {
		System.out.println("���� ���� : "+(++this.volume));
	}
	
	public void volumeDown() {
		System.out.println("���� ���� : "+(++this.volume));
	}
	
	
	@Override
	public String toString() {
		return "���� ä�� : " + this.channel + ", ���� ���� : " +this.volume; 
	}
	
}
