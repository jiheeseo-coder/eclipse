package example03;

public class PersonEx {

	public static void main(String[] args) {

		Person p = new Person(22);
		Person p1 = new Person(20);
		Person p2 = new Person(25);
		
		
		// final �Ӽ��� ����̹Ƿ� ���� ���� ����
		//p.nation = "USA";
		//p.age = 100;
		
		System.out.println(p.age);
		System.out.println(p1.age);
		System.out.println(p2.age);
		// Person Ŭ������ toString() �Լ��� ���� �̸��� �־����� 
		// sout(p); �� ������� �� �ּҰ� ���´�.
		
		System.out.println(Person.MAX_NUMBER);
		// p.MAX_NUMBER ���ߴ� ����: static�̱� ������
		// �׷��� Person.��¼�� �̷��� �ؾ� �Ѵ�.
	}

}
