package example01;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		// score�� ���������̴�. int[]�̴�.
		int[] score = null;
		
		// �浵 ������ �ʰ�, ���� ������ �ϰ� �ִ�.(���� ����)
		//score = {100, 29};
		
		// 0���� �ʱ�ȭ�� ũ�Ⱑ 5�� �迭�� ���´�.
		// score�� 5���� ���� �����ٰ� �����ϰ� �ִ�.(20byte)
		score = new int[5];
		
		// �迭���� �� �ּҴ�.
		System.out.println("score�� �ּҰ� : "+score);
		
		for(int i = 0; i<score.length; i++) {
			System.out.println("score["+i+"] = "+score[i]);
		}
		System.out.println();
		
		// score[0]�� ������ �����ϴٰ� ���� �ȴ�.
		// score�� �ּҴ�.**!! []�ȿ� ���� ���ڸ� �ε���(÷��)��� �Ѵ�.
		score[0] = 100;
		
		// �迭���ٰ� ���� ���Խ�Ű�� �ִ� ����
		for(int i = 0; i<score.length; i++) {
			score[i] = i+10;
		}

		// �迭�� ������ �濡 �ִ� ���� ����ϴ� ����
		for(int i = 0; i<score.length; i++) {
			System.out.println("score["+i+"] = "+score[i]);
		}
		System.out.println();

	}

}
