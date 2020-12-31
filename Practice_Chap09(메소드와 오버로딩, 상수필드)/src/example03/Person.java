package example03;

public class Person {

	// �Һ��� �������
	// �����ڿ����� �ʱ�ȭ�� �ȵ�
	// ���뵥���ͷ� ���Ǿ� �Ѵ�.
	// Ŭ�������� �����Ǿ�����.
	// static final: �޸𸮿� ��������� �ּҴ� ���� �������
	static final int MAX_NUMBER = 1000;
	
	// final �ʱ�ȭ ���
	// 1. ����� ���ÿ� �ʱ�ȭ �ϴ� ���
	// 2. �����ڿ��� �� �ѹ� �ʱ�ȭ ����
	final String nation = "KOREA";		// ��� ����
	final int age;
	
	
	public Person(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {

		return "nation: "+this.nation + ", age: "+this.age;
	}
	
}
