package example02;

import java.util.Scanner;

public class SecondArrayEx03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// #############   �Է� �޾Ƽ� �迭�� ���� �� ����!!! new int[] �̷� ������ ����� ��!!!################
		// #############   ������ ���̴� �۾� �߿���@@@@@@@@@!!!!!!!!!!!              ################
		
		
		int[][] student; 		// 2���� �迭�� ����
		int count = 0, num = 0, sum = 0, total = 0;
		//	�� ��			�ο�		�հ�		    �� 
		double avg = 0.0;
		double avgTotal = 0.0;
		
		System.out.print("�� �� �Է� : ");
		count = sc.nextInt();
		student = new int[count][];				// ���� ������ 1���� �迭�� �Ҵ�(��)
		
//		System.out.println("2���� �迭�ּ� : "+student);
//		System.out.println("1���� �迭�� ũ�� : "+student.length);
		
		for(int i = 0; i<student.length; i++) {
			System.out.printf("%d���� �ο� : ", (i+1));
			num = sc.nextInt(); 				// ���� �ο��� �޴´�.
			student[i] = new int[num]; 			// 1���� �迭 �ּҿ� �� ������ ����� ��!(������ �ִ� ��)
			
			for(int j = 0;j<student[i].length; j++) {
				System.out.printf("%d���� %d���� ���� : ",(i+1),(j+1));
				student[i][j] = sc.nextInt();	//���� �� �ο��� ������ �޴´�.
			}
			System.out.println();
			
			
		}
		
		// ������ ����� �ԷµǾ����� Ȯ���ϴ� �ڵ�
//		for(int[] temp: student) {
//			for (int score : temp) {
//				System.out.print(score+" ");
//			}
//			System.out.println();
//		}
		
		System.out.println("��\t�հ�\t���\t");
		System.out.println("---------------------");
		
		int n = 1;
		for(int[] temp:student) {
			sum = 0;
			for(int score:temp) {
				sum+= score;					// �ݺ� �հ�
			}
			total += sum;						// ���� �հ�
			avg = (double)sum/student.length;// �� ���
			avgTotal += avg;					// �� ����� ��
			
			System.out.printf("%d��\t%d\t%.2f",n,sum,avg);
			n++;
			System.out.println();
		}
		avgTotal = avgTotal/student.length;
		System.out.printf("��\t%d\t%.1f\n",total,avgTotal);
		
		
		sc.close();
		
	}

}
