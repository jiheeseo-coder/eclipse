package example03;

public class StringEqualsEx {

	public static void main(String[] args) {
		// 참조형 타입의 ==, !=에 대해서 이해할 수 있다.

		// 리터럴인 경우 같은 값이 있는지, 먼저 메모리 공간(heap)에 있는지 
		// 확인하고, 만약 있다면 같은 주소 공유. 없다면 새로운 곳에
		// 인스턴스를 생성해줌
		String str1 = "자바";
		String str2 = "자바";
		// new연산자 오면 무조건 새로운 인스턴스가 생성됨.
		String str3 = new String("자바");
		String str4 = "자바";		// 이건 1이랑 2랑 같은것 가리키고 str3은 false라고 나옴.
		
		//참조형 타입에서 서로 == 은 주소비교를 하고 있다.
		boolean result = (str1 == str2);
		System.out.println("str1 == str2 : "+result);

		result = (str1 == str3);
		System.out.println("str1 == str3 : "+result);

		
		
		//String 클래스의 equals()는 주소와 상관없이 값이 같다면,
		//무조건 true를 리턴함
		result = str1.equals(str2);
		System.out.println("str1.equals(str2) : "+result);
		
		result = str1.equals(str4);
		System.out.println("str1.equals(str3) : "+result);
		
		
		
	}

}
