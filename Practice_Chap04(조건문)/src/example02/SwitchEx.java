package example02;

public class SwitchEx {

	public static void main(String[] args) {

		int score = 85;
		
		// int 이하의 정수값, String값
		// 10 나누는 것 아주 신박한 방법인 것 같슴다..ㅌㅌㅌ
		switch (score/10) {
		case 9:
			System.out.println("A등급 입니다");
			break;
		case 8:
			System.out.println("B등급 입니다");
			break;
		case 7:
			System.out.println("C등급 입니다");
			break;
		default:
			System.out.println("D등급 입니다.");
			break;
		}
		
	}

}
