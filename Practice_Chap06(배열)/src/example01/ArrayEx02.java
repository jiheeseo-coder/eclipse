package example01;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		int sum = 0;		// ����
		double avg = 0.0;	// ���
		
		//int [] score = {100,200,300};
		// ����� ���ÿ� �ʱ�ȭ
		int [] score = new int[] {100, 90, 80, 50, 70};
		
		System.out.println("�迭�� ũ�� : "+ score.length);

		// �迭�� �� ��ҵ��� ���� ���ϰ� �ִ�.(����)
		for(int i = 0; i<score.length; i++) {
			sum += score[i];			
		}
		System.out.println("���� : "+sum);
		
		// ����� ���ϰ� �ִ�.
		avg = sum/score.length;
		System.out.println("��� : "+avg);
		
		
	}

}
