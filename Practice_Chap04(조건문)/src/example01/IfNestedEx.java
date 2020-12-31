package example01;

import java.util.Scanner;

public class IfNestedEx {

	public static void main(String[] args) {
		
	// sc는 Resource이기 때문에 닫아줘야 한다.
			Scanner sc = new Scanner(System.in);
			
			System.out.print("점수를 입력하세요 : ");
			int score = sc.nextInt();
			
			// 중첩 if문(무제한적으로 중접 if문은 들어갈 수 있다.
			// 보통, 중첩 if문은 2개를 초과하지 않ㄷ록 하는게 ㄱ독성 ㅁㄴ에서 좋다.
			if(score >= 90) {
				if(score >= 95) {
					System.out.println("당신은 A+등급입니다.");
				}
				else {
					System.out.println("당신은 A0등급입니다.");
				}
			}else if(score >= 80) {
				if(score >= 85) {
					System.out.println("당신은 B+등급입니다.");
				}
				else {
					System.out.println("당신은 B0등급입니다.");
				}
			}
			
			
			sc.close();

	}

}
