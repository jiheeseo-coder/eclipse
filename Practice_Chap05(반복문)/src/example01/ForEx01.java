package example01;

public class ForEx01 {

	public static void main(String[] args) {
		
		int sum = 0;
		// 1���� 100���� ���� ���ϴ� �ݺ���
		// int i = 1; -> �ʱ�ȭ �ڵ�(���� 1���� ����)
		// i <= 100; -> ���ǽ�(���̾������, ���� ���� ������)
		// i++ -> ������
		for(int i = 1; i <= 100; i++) {
			sum += i;
			//System.out.println("sum : "+sum);
		}
		System.out.println("1~100������ �� : "+sum);

	}

}
