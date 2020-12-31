package example03;

public class Person {

	// 불변의 정적상수
	// 생성자에서도 초기화가 안됨
	// 공용데이터로 사용되야 한다.
	// 클래스별로 관리되어진다.
	// static final: 메모리에 만들어지고 주소는 힙에 만들어짐
	static final int MAX_NUMBER = 1000;
	
	// final 초기화 방법
	// 1. 선언과 동시에 초기화 하는 방법
	// 2. 생성자에서 단 한번 초기화 가능
	final String nation = "KOREA";		// 상수 선언
	final int age;
	
	
	public Person(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {

		return "nation: "+this.nation + ", age: "+this.age;
	}
	
}
