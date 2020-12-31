package example01;

public class VarEx01 {

	public static void main(String[] args) {

		char ch = 'A';	// char ch = 'AB'; 이런거 x, 한 문자만 저장 가능
		int year = 0;
		int age = 22;
		long result = 10; // 여기는 L 안붙여도돼(근데 붙이는게 정신건강에 좋음)
		float result2 = 10.1f; // double로 바꾸거나 f를 붙여라(안그럼 오류난다)
		double d = 0.23;
		
		// sys를 치고 ctrl + space 누르면 자동완성 기능이 실행된다.
		// 인텔리전스 기능
		
		System.out.println("문자열 값은 : "+ch);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(d);
		
		
		System.out.println(year+age);
		
		String str = new String("자바");
		System.out.println(str+"를 공부합니다.");
		System.out.println(str.toString());
		
		// 사용자 정의 클래스 이거나 toSgring() 재정의를 하지 않은
		// 클래스의 참조변수는 출력하게 되면, 자기의 클래스타입 @ 16진수 주소
		// 나온다.
		Object obj1 = new Object();
		System.out.println(obj1 + "자바");

	}

}
