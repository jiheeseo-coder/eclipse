package example02;

public class Calculator {

	// �ν��Ͻ� �޼���
	// �ν��Ͻ� �޼ҵ� Ư¡: new �����ڷ� �ν��Ͻ��� �����ؾ�����, <����������.�ν��Ͻ��޼ҵ��>���� ���ٰ���
	public int add(int x, int y) {
		return x+y;
	}
	
	public int sub(int x, int y) {
		return x-y;
	}
	
	// static(����) �޼���
	// static�� Ư��: �ν��Ͻ� ���� ���� <Ŭ������.�����޼ҵ�>�� �ٷ� ������ �����ϴ�.
	public static long mul(long x, long y) {
		//static �޼���� �̹� �޸� ��ܿ� �ö��ְ� �ν��Ͻ� �������� ������ �����ؾߵǴµ�
		// �Ʒ� �ڵ�� �ν��Ͻ��� �����Ǿ������ ��밡���� add()�� �Ա� ������ ���ܰ� �߻��ϴ� ���̴�.
		// �ν��Ͻ��� ���� �������� �ƹ��� �𸣱� ������ static�޼���ȿ��� �ν��Ͻ� �޼ҵ尡
		// ����� ���� �ȵȴ�.
		//this.add(10,5);
		return x * y;
	}
	
	public static double div(double x, double y) {
		return x / y;
	}
}
