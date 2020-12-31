package example03;

public class PersonEx {

	public static void main(String[] args) {

		Person p = new Person(22);
		Person p1 = new Person(20);
		Person p2 = new Person(25);
		
		
		// final 속성은 상수이므로 값을 변경 못함
		//p.nation = "USA";
		//p.age = 100;
		
		System.out.println(p.age);
		System.out.println(p1.age);
		System.out.println(p2.age);
		// Person 클래스에 toString() 함수가 없고 이름만 주어지면 
		// sout(p); 만 출력했을 때 주소가 나온다.
		
		System.out.println(Person.MAX_NUMBER);
		// p.MAX_NUMBER 경고뜨는 이유: static이기 때문에
		// 그래서 Person.어쩌구 이렇게 해야 한다.
	}

}
