package example01;

public class OperatorEx {

	public static void main(String[] args) {

		int v1 = 5;
		int v2 = 2;
		
		int result = v1 + v2;
		System.out.println("���ϱ� ��� : "+result);

		
		result = v1 - v2;
		System.out.println("���� ��� : "+result);

		result = v1 * v2;
		System.out.println("���ϱ� ��� : "+result);

		result = v1 / v2;
		System.out.println("������ ��� : "+result);

		result = v1 % v2;	//% �������� ���ϴ� ������
		System.out.println("������ ��� : "+result);
		
		// ����ó�� : ���α׷��� �������� ���Ḧ ����
		try {
			result = v1 / 0;	// ������꿹��
		}catch (Exception e) {
			System.out.println("���� �߻� "+e.toString());
		}

		
	}

}
