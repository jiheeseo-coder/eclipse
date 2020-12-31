package example03;

public class SecondArrayEx {

	public static void main(String[] args) {
		// 가변 배열 연습
		
		int[][] array = new int[][] {{100,100,100,5},
										{50,50}, 
										{10,20,30,46,45,72,87}};
		
		
		int sum = 0;
		double avg = 0.0;
		int count = 0;
		
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array[i].length; j++) {
				sum += array[i][j];
				count ++;
			}
		}
		avg = (double)sum / count;
		System.out.println("위 가변배열의 합계(sum) : "+sum);
		System.out.printf("위 가변배열의 평균(avg) : %.1f",avg);
		
		

	}

}
