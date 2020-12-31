package example02;

// 한개의 .java 파일에서는 public 클래스를 하나만 작성 가능
public class StudentEx {

	public static void main(String[] args) {
		
		// 아래는 각각 독립된 저장공간을 가지는 인스턴스가 힙에 할당이 된다.
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.age = 42;
		s1.name = "홍길동";
		
		// s1의 주소를 s2에다가 대입(인스턴스 공유)
		// 원래 s2가 가리키고 있던 인스턴스는 쓰레기 객체가 된다.
		// gc(garbage collector)가 쓰레기 객체를 수집하여 소멸시킨다.
		s2 = s1;
		
		s2.age = 11;
		
		// .toString() 호출
		System.out.println(s1);
		System.out.println(s2);
		
		

	}

}
