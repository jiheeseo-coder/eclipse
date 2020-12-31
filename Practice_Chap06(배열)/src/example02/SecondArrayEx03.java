package example02;

import java.util.Scanner;

public class SecondArrayEx03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// #############   입력 받아서 배열을 만들 수 있음!!! new int[] 이런 식으로 만들면 됨!!!################
		// #############   가져가 붙이는 작업 중요함@@@@@@@@@!!!!!!!!!!!              ################
		
		
		int[][] student; 		// 2차원 배열을 선언
		int count = 0, num = 0, sum = 0, total = 0;
		//	반 수			인원		합계		    계 
		double avg = 0.0;
		double avgTotal = 0.0;
		
		System.out.print("반 수 입력 : ");
		count = sc.nextInt();
		student = new int[count][];				// 반의 개수를 1차원 배열로 할당(힙)
		
//		System.out.println("2차원 배열주소 : "+student);
//		System.out.println("1차원 배열방 크기 : "+student.length);
		
		for(int i = 0; i<student.length; i++) {
			System.out.printf("%d반의 인원 : ", (i+1));
			num = sc.nextInt(); 				// 반의 인원을 받는다.
			student[i] = new int[num]; 			// 1차원 배열 주소에 또 차원을 만드는 것!(내용을 넣는 것)
			
			for(int j = 0;j<student[i].length; j++) {
				System.out.printf("%d반의 %d번의 점수 : ",(i+1),(j+1));
				student[i][j] = sc.nextInt();	//실제 반 인원의 점수를 받는다.
			}
			System.out.println();
			
			
		}
		
		// 점수가 제대로 입력되었는지 확인하는 코드
//		for(int[] temp: student) {
//			for (int score : temp) {
//				System.out.print(score+" ");
//			}
//			System.out.println();
//		}
		
		System.out.println("반\t합계\t평균\t");
		System.out.println("---------------------");
		
		int n = 1;
		for(int[] temp:student) {
			sum = 0;
			for(int score:temp) {
				sum+= score;					// 반별 합계
			}
			total += sum;						// 반의 합계
			avg = (double)sum/student.length;// 반 평균
			avgTotal += avg;					// 반 평균의 합
			
			System.out.printf("%d반\t%d\t%.2f",n,sum,avg);
			n++;
			System.out.println();
		}
		avgTotal = avgTotal/student.length;
		System.out.printf("계\t%d\t%.1f\n",total,avgTotal);
		
		
		sc.close();
		
	}

}
