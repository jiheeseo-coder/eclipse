package example04;

public class TimeEx {

	public static void main(String[] args) {
		
		Time t1 = new Time();
		System.out.println(t1);
		
		// 시를 설정
		t1.setHour(11);
		// 분을 설정
		t1.setMinute(49);
		// 초를 설정
		t1.setSecond(5);
		System.out.println(t1);
		
	}

}
