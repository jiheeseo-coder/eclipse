package example03;

public class MonitorEx {

	public static void main(String[] args) {
		
		// monitor ���������� �������� ���� ���̶�� ��������.
		Monitor m = new Monitor();
		
		System.out.println(m.toString());
		m.channel = 5;
		
		m.power();
		m.power();
		m.power();
		
		m.channelUp();
		m.channelDown();
		
		m.volumeUp();
		m.volumeUp();
		
		System.out.println(m);
		m.power();
		
	}

}
