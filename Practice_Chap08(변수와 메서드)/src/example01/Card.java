package example01;

public class Card {
	
	// 인스턴스 변수 -- 반드시 인스턴스를 생성해야 접근 가능
	private String color;			// 카드의 색상
	private String company;			// 카드의 회사명
	
	// static 변수(정적, 클래스변수, 공유변수) -- 인스턴스 생성 없이도 클래스명. static 변수명으로 접근 가능
	static int width = 100;			// 카드의 폭
	static int height = 50;			// 카드의 높이
	
	
	// Source -> Generate getter and setter
	// getter, setter 인스턴스 메서드
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
		// 지역변수는 반드시 초기화를 해야 한다.
		// 메서드 안에 static 변수를 사용하지 못한다. 그이유는
		// static의 특성은 인스턴스 생성없이도 얼마든지 접근 가능해야 하는데,
		// 언제 인스턴스가 생성될지 아무도 모르기 때문에 이렇게 코드를 작성하는 것은
		// 올바른 방법이 아니다.
		// static int i = 10;
		String color = this.color;
		String company = this.company;
		
		System.out.println(color + ", " + company);
	}
	
	/*
	public static void show2() {
		// 여기서 오류나는 이유
		// static 함수는 언제든지 불러서 쓸 수 있는데, this는 new를 만들었을때만 사용이 가능함.
		// 즉 언제 new를 만들지 모르기 때문에 오류가 나는거임.
		String color = this.color;
		String company = this.company;
	}
	*/
	
	@Override
	public String toString() {
		// 정적변수(static)은 접근방식이 반드시 클래스명.static변수명 으로 접근해야함
		return "card1의 색상: " + this.getColor()+ "\ncard1의 회사: " + this.getCompany()+
				"\n크기: (" + Card.height+", "+ Card.width+")\n";			// this.height 하면 안됨
	}
	
}
