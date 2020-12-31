package example03;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] ori = new int[]{10, 77,33,50};
		int[] target = new int [10];
		int count=0;
		
		System.out.println("복사하기 전");
		System.out.println(Arrays.toString(ori));
		System.out.println(Arrays.toString(target));
		System.out.println("target 길이 : "+target.length);
		
		// for문을 이용해서 직접 복사하는 방법
//		for(int i = 0; i<ori.length; i++) {
//			target[i] = ori[i];
//		}
//		
		
//		for(int i : ori) {
//			target[count++] = i;
//		}
		
		// System.arraycopy() 복사속도가 가장 빠르다.
		System.arraycopy(ori, 0, target, 0, ori.length);
//		target = Arrays.copyOf(ori, ori.length);
		// Arrays의 copyOf메서드는 완전히 복사될 배열과 동일하게 복사를 해버리는 배열복사 메소드이다.
		
		System.out.println();
		System.out.println("복사한 후");
		System.out.println(Arrays.toString(ori));
		System.out.println(Arrays.toString(target));
		System.out.println("target 길이 : "+target.length);
		
		
		
		
	}

}
