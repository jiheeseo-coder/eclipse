package example02;

public class MemberEx {
	
	public static void study() {
		System.out.println("�ڹٰ��θ� �մϴ�.");
	}
	
	public void m1() {
		System.out.println("�ν��Ͻ� �޼���");
	}
	
	public static void main(String[] args) {
		// ctrl + space �Ҷ� ������ ǥ�� �� s�� ���� ���� static�� ����
		
		// �Ʒ��� static������̹Ƿ� �ν��Ͻ� ��������, �󸶵��� <Ŭ������.���������>dmfh 
		// ������ �����ϴٴ� ���� �����ְ� �ִ�
		// static�� static�� ȣ���� �����ϴ�.
		Member.smethod();
		Member.cv = 500;
		Member.smethod();
		
		System.out.println();
		
		// �ν��Ͻ� ������� ����ϱ� ���ؼ��� �ݵ�� new��� �����ڰ� �����ٰ�
		// �ν��Ͻ��� ������ ����� �����ϴ�.
		Member m = new Member();
		m.imethod();
		m.iv = 999;
		m.imethod();
		
		System.out.println();
		MemberEx.study();
		
		System.out.println();
		MemberEx me = new MemberEx();
		me.m1();
	}

}
