package example04;

import java.util.Arrays;

public class ReferenceReturnEx {

	public static void main(String[] args) {

		int[] ori = new int[] {10, 20, 30, 40, 50};		// 원본배열
		int[] cloned = null;						// 타겟배열
		int[] cloned2 = null;
		int[] cloned3 = new int[5];
		
		System.out.println("copy()호출 전: "+ Arrays.toString(cloned));
		cloned = copy(ori);
		System.out.println("ori()배열: "+Arrays.toString(ori));
		System.out.println("copy()호출 후: "+ Arrays.toString(cloned));
		System.out.println("@@cloned의 주소: "+cloned);

		// 허억이렇게 하면 주소자체가 복사가 되는구나..!
		System.out.println("\nori의 주소: "+ ori);
		System.out.println("cloned2의 주소: "+cloned2);
		cloned2 = ori;
		System.out.println("cloned2의 주소: "+cloned2);
		
		// 홀리 이것도 주소자체가 복사가 되는구나...! 조심해야겠다.
		System.out.println("\ncloned3의 주소: "+cloned3);
		cloned3 = ori;
		System.out.println("cloned3의 주소: "+cloned3);
		
		
	}
	
	public static int[] copy(int[] a) {
		int[] temp = new int[5];
		//System.arraycopy(a, 0, temp, 0, a.length);
		for (int i = 0; i<a.length; i++) {
			temp[i] = a[i];
		}
		
		System.out.println("@@temp의 주소: "+temp);
		return temp;
	}
	/*
	public static int[] copy2(int[] a) {
		int[]
	}
*/

}
