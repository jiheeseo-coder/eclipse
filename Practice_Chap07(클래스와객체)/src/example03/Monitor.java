package example03;

public class Monitor {

	// 멤버변수(필드)
	String color;			// 모니터의 색상
	int channel; 			// 채널
	int volume;				// 볼륨
	boolean power; 			// 전원 상태(on/off)
	
	// 멤버메서드
	// Monitor를 켜거나 끄는 기능을 하는 메소드
	public void power(){
		
		this.power = !power;
		
		if(this.power) 
			System.out.println("전원이 켜졌습니다.");
		else
			System.out.println("전원이 꺼졌습니다.");
	
	}
	
	
	public void channelUp() {
		System.out.println("현재 채널 : "+(++this.channel));
	}
	
	public void channelDown() {
		System.out.println("현재 채널 : "+(--this.channel));
	}
	
	
	public void volumeUp() {
		System.out.println("현재 볼륨 : "+(++this.volume));
	}
	
	public void volumeDown() {
		System.out.println("현재 볼륨 : "+(++this.volume));
	}
	
	
	@Override
	public String toString() {
		return "현재 채널 : " + this.channel + ", 현재 볼륨 : " +this.volume; 
	}
	
}
