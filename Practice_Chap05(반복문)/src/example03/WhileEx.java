package example03;

public class WhileEx {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;	//while문은 초기화 부분 따로 존재 X
		
		// while문 옆에는 조건식만 들어가기 때문에 , for문에 비해서 일반적 루핑에서는
		// 가독성이 떨어진다.
		while(i <= 100) {
			sum += i;
			i++;
		}
		
		i = 1;
		// C언어에서는 따로 boolean 타입이 없다. 하여 0 : False, 0을 제외한 모든 값 : True
		// while문은 무한루프용으로 많이 사용된다. 
		// if()문, break문과 함께 무한루프를 벗어날 코드를 작성해줘야 한다.
		while(true) {
			
			System.out.println(i);
			if(i >= 100) {
				break;
			}
			
			i++;
		}
		
		System.out.println("1 ~ 100까지의 합 : " + sum);
		

	}

}
