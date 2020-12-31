package example01;

public class IncreDreEx {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		
		System.out.println("---------------------");
		System.out.println("x = "+ x++);	// 후위증가연산
		// x 값이 변했는지 확인
		System.out.println("x = "+ x);		
		System.out.println("y = "+ ++y); 	// 전위증가연산
		System.out.println("y = "+ y);
		System.out.println("---------------------");

		// 맞다 ,,,, 23이라 예상했는데 이건 anytype+문자열이라 문자열로 나옴
		//System.out.println("(x++) + (++y) : " +(x++) + (++y));
		System.out.println("(x++) + (++y) : " +((x++) + (++y)));
		
	}

}
