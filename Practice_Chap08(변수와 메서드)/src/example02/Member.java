package example02;

public class Member {

	int iv = 100;			// �ν��Ͻ� ��� ����
	static int cv = 200;	// static ��� ����
	
	// �ν��Ͻ� �޼���
	public void imethod() {
		System.out.println("iv: "+this.iv);
		//System.out.println("cv: "+ Member.cv);		//<Ŭ������.����������>

	}
	
	// static �޼���
	public static void smethod() {
		// �ȵȴ�? �����ν��Ͻ��� ��������� �ƹ��� �𸣱� �����̴�.
		// iv�� �ν��Ͻ� �������� ���� �Ұ���
		//System.out.println("iv: "+ this.iv); 		// �ȵȴ�?
		
		// cv�� static�����̱� ������ �ν��Ͻ� ���̵� ���� �����ѵ�
		// static�޼ҵ� �������� �󸶵��� ���� �����ϴ�.
		System.out.println("cv: "+Member.cv);
		
	}
	
}
