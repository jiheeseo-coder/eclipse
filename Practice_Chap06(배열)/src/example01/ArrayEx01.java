package example01;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		// score는 참조변수이다. int[]이다.
		int[] score = null;
		
		// 방도 만들지 않고, 값을 대입을 하고 있다.(문법 에러)
		//score = {100, 29};
		
		// 0으로 초기화된 크기가 5인 배열이 나온다.
		// score는 5개의 방을 힙에다가 생성하고 있다.(20byte)
		score = new int[5];
		
		// 배열명이 곧 주소다.
		System.out.println("score의 주소값 : "+score);
		
		for(int i = 0; i<score.length; i++) {
			System.out.println("score["+i+"] = "+score[i]);
		}
		System.out.println();
		
		// score[0]는 변수와 동일하다고 보면 된다.
		// score는 주소다.**!! []안에 들어가는 숫자를 인덱스(첨자)라고 한다.
		score[0] = 100;
		
		// 배열에다가 값을 대입시키고 있는 형태
		for(int i = 0; i<score.length; i++) {
			score[i] = i+10;
		}

		// 배열의 각각의 방에 있는 값을 출력하는 형태
		for(int i = 0; i<score.length; i++) {
			System.out.println("score["+i+"] = "+score[i]);
		}
		System.out.println();

	}

}
