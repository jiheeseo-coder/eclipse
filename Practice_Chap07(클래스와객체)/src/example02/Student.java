package example02;

// public class static Student 하면 오류남 : 안에 this 있기 때문에!!!
public class Student {

	// 안에 메소드에서 static 가능한데, 그 대신 this를 사용하면 안됨.!!!
	// 멤버변수(필드)
	String name;
	int age;
	
	// Object 클래스의 toString()오버라이딩(재정의)
	@Override
	public String toString() {
		
		// String str = "이름 : " + this.name + " 나이 : "+this.age;
			
		// this : 클래스의 주소(new라는 연산자가 인스턴스를 생성하면 비로소 활성화)
		// this는 static 메소드나 클래스 안에 사용할 수 없다.!!!!!!
		return "이름 : " + this.name + ", 나이 : "+this.age;
		// return str;
	}
	
	
}
