package example02;

// public class static Student �ϸ� ������ : �ȿ� this �ֱ� ������!!!
public class Student {

	// �ȿ� �޼ҵ忡�� static �����ѵ�, �� ��� this�� ����ϸ� �ȵ�.!!!
	// �������(�ʵ�)
	String name;
	int age;
	
	// Object Ŭ������ toString()�������̵�(������)
	@Override
	public String toString() {
		
		// String str = "�̸� : " + this.name + " ���� : "+this.age;
			
		// this : Ŭ������ �ּ�(new��� �����ڰ� �ν��Ͻ��� �����ϸ� ��μ� Ȱ��ȭ)
		// this�� static �޼ҵ峪 Ŭ���� �ȿ� ����� �� ����.!!!!!!
		return "�̸� : " + this.name + ", ���� : "+this.age;
		// return str;
	}
	
	
}
