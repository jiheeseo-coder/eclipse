package example02;

public class SecondArratEx02 {

	public static void main(String[] args) {
		
		int[][] score = new int[][] {
			{100,70,50}, {70,50,30}, {50,80,70}, {55,85,77}, {100,80,75}
		};

		// ���� ����
		int korTotal = 0; 		// ����
		int engTotal = 0; 		// ����
		int mathTotal = 0; 		// ����
		
		int totalsum = 0;		// �հ�
		double totalavg = 0;	// ���
		
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		System.out.println("=================================================");
		
		for(int i = 0; i<score.length; i++) {
			int sum = 0; 		// ���κ� ����
			double avg = 0.0;	// ���κ� ���
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			
			System.out.print(" "+(i+1));
			for(int j = 0; j<score[i].length; j++) {
				sum+=score[i][j];
				System.out.print("\t"+score[i][j]);
			}
			totalsum += sum; 	// �� �հ�
			avg = (double)sum/score[i].length;	//���κ� ���
			
			totalavg += avg;
			
			
			//System.out.print("\t"+sum+"\t"+avg);
			// printf() %d <- ������������ ������ŭ �׿� ���ԵǴ� ������ ,�� ���еǾ� ����
			// %n, \n�� ����, �ٹٲ��� �ǹ�
			System.out.printf("\t%d\t%.2f",sum,avg);
			
			System.out.println();
		}
		
		totalavg /= score.length;
		System.out.printf("\n����\t%d\t%d\t%d\t%d\t%.2f", korTotal, engTotal, mathTotal, totalsum, totalavg);

		
		
	}

}
