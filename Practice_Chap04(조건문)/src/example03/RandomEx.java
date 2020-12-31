package example03;

public class RandomEx {

	public static void main(String[] args) {
		
		// Math.random()값은 0.00000~0.999990 사이의 값을 발생시킴
		//System.out.println(Math.random());
		
		//주사위 눈을 랜덤으로 발생
		// ((int)Math.random()*6)+1 => 하면 1만 나옴 
		int num = (int)(Math.random()*6) + 1;	//1~6까지의 범위의 수를 발생시키는 식
		System.out.println(num);

		switch (num) {
		case 1 : 
			System.out.println("1이 나왔네요!");
			break;
		case 2 :
			System.out.println("2가 나왔네요!");
			break;
		case 3:
			System.out.println("3이 나왔네요!");
			break;
		case 4:
			System.out.println("4가 나왔네요!");
			break;
		case 5:
			System.out.println("5가 나왔네요!");
			break;
		case 6:
			System.out.println("6이 나왔네요!");
			break;
		default:
			System.out.println("올바르지 않은 숫자입니다.");
		}
		// 위의 문장은 if를 스위치로 바꿔놓은 것
		
	}

}
