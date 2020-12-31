package example02;

public class Member {

	int iv = 100;			// 인스턴스 멤버 변수
	static int cv = 200;	// static 멤버 변수
	
	// 인스턴스 메서드
	public void imethod() {
		System.out.println("iv: "+this.iv);
		//System.out.println("cv: "+ Member.cv);		//<클래스명.정적변수명>

	}
	
	// static 메서드
	public static void smethod() {
		// 안된다? 언제인스턴스가 만들어질지 아무도 모르기 때문이다.
		// iv는 인스턴스 생성없이 접근 불가능
		//System.out.println("iv: "+ this.iv); 		// 안된다?
		
		// cv는 static변수이기 때문에 인스턴스 없이도 접근 가능한데
		// static메소드 내에서는 얼마든지 접근 가능하다.
		System.out.println("cv: "+Member.cv);
		
	}
	
}
