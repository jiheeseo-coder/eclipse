package example01;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		// 40바이트가 힙에 생성되었다.
		int[] arr1 = new int[10];
		// 6바이트가 힙에 생성되었다.
		char[] chArr = new char[] {'a', 'b', 'c'};
		
		// arr1배열에다 난수를 10개 대입하고 있다.
		for(int i = 0; i<arr1.length; i++) {
			// 범위 : 1~10까지의 난수를 대입
			arr1[i] = (int)(Math.random()*10)+1;
		}
		
		// 배열의 값들을 보기좋게 출력
		for(int i = 0; i<arr1.length; i++) {
			if(i==9)
				System.out.print(arr1[i]);
			else
				System.out.print(arr1[i] + ", ");
		}
		System.out.println();
		
		// Arrays클래스는 배열을 조작하기 쉽게 만들어 놓은 유틸리티 클래스
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(chArr));

		// 주소값 출력(.toString()묵시적 호출)
		// 출력 스트림에다가 참조변수를 넣으면, 자동적으로 참조변수명.toString()호출이 된다.
		// 타입@16진수
		System.out.println(arr1);
		System.out.println(arr1.toString());
		// char타입은 주소를 출력하려면 toString()을 호출해야 한다.
		System.out.println(chArr.toString());
		// chArr만 출력하면 그냥 문자열이 나오고
		// .toString()붙여야만 주소가 나온다.
		
		
	}

}
