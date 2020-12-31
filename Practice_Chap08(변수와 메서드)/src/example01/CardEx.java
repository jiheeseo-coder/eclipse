package example01;

public class CardEx {

	public static void main(String[] args) {
		
		
		//ctrl + pageup: 이전파일 이동
		//ctrl + pagedown: 다음파일 이동
		
		Card card1 = new Card();
		card1.setColor("노랑");
		card1.setCompany("국민은행");
		
		System.out.println(card1.toString());
		card1.show();		// 메소드는 그냥 호출함. print 안에 넣으면 안됨!
		System.out.println();
		// static변수는 반드시 클래스명.static변수명으로 접근하여야 함
		// 공유변수는 분석하는 단계에서는 바꾸지 않는게 바람직한 방법.
		//card1.width = 80;
		//card1.height = 50;
		Card.width = 80;
		Card.height = 150;
		
		Card card2 = new Card();
		card2.setColor("파랑");
		card2.setCompany("농협");
		
		System.out.println(card2);
		
		
	}

}
