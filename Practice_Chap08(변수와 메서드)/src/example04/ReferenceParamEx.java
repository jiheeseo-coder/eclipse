package example04;


public class ReferenceParamEx {

	public static void main(String[] args) {

		A a = new A();
		a.data = 77;
		System.out.println("�޼ҵ� ȣ���� main()���� ��: "+a.data);
		
		// �������� "�ð谡 ����ִ�?"��� ����� ���¶� ���� �а� ������ �� �ִ�..
		// Call by Reference(�ּҿ� ���� ȣ��)
		dataChange(a);
		System.out.println("�޼ҵ� ȣ���� main()���� ��: "+a.data);
		
	}
	
	// int[], double[], String --> ������������ ȣ��
	public static void dataChange(A a) {
		// a��� �ּҰ��� �Ű������� �Ѿ�Ա� ������ �ּҸ� �����Ѵ�.
		// a��� �ּҸ� �����ϰ� �Ǹ� ȣ���� ������ ������ �����ǹ޴´�.
		a.data = 44;
		System.out.println("dataChange()���� ��: " + a.data);
		return ;
	}

}
