package example01;

public class MemberReferEx {

	int iv;			// �ν��Ͻ� �������
	static int cv;	// ���� �������
	
	// �ν��Ͻ� �޼ҵ�
	// ����: �ν��Ͻ� �޼ҵ尡 ȣ��� ���� �̹� �ν��Ͻ��� �����Ǿ� ���� ����.
	public void instanceMethod() {
		System.out.println(this.iv);	// �ν��Ͻ� ������� ��밡��
		System.out.println(cv);			// ���� ������� ��밡��
		staticMethod(); 				// ������� �޼ҵ� ��밡��
		MemberReferEx.staticMethod();
	}
	
	// ���� �޼ҵ�
	// �ν��Ͻ��� ���� �������� �ƹ��� �𸣱� ������ ���� �޼ҵ� ��������
	// �ν��Ͻ� ������� ���� ����� �� ����.
	public static void staticMethod() {
		//System.out.println(this.iv);	// �ν��Ͻ� ������� ���Ұ���
		System.out.println(cv);			// ���� ������� ��밡��
		//this.instanceMethod();		// �ν��Ͻ� ��� �޼ҵ� ��� �Ұ���
	}
	
}
