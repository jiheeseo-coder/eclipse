package example04;

import java.util.Arrays;

public class ReferenceReturnEx {

	public static void main(String[] args) {

		int[] ori = new int[] {10, 20, 30, 40, 50};		// �����迭
		int[] cloned = null;						// Ÿ�ٹ迭
		int[] cloned2 = null;
		int[] cloned3 = new int[5];
		
		System.out.println("copy()ȣ�� ��: "+ Arrays.toString(cloned));
		cloned = copy(ori);
		System.out.println("ori()�迭: "+Arrays.toString(ori));
		System.out.println("copy()ȣ�� ��: "+ Arrays.toString(cloned));
		System.out.println("@@cloned�� �ּ�: "+cloned);

		// ����̷��� �ϸ� �ּ���ü�� ���簡 �Ǵ±���..!
		System.out.println("\nori�� �ּ�: "+ ori);
		System.out.println("cloned2�� �ּ�: "+cloned2);
		cloned2 = ori;
		System.out.println("cloned2�� �ּ�: "+cloned2);
		
		// Ȧ�� �̰͵� �ּ���ü�� ���簡 �Ǵ±���...! �����ؾ߰ڴ�.
		System.out.println("\ncloned3�� �ּ�: "+cloned3);
		cloned3 = ori;
		System.out.println("cloned3�� �ּ�: "+cloned3);
		
		
	}
	
	public static int[] copy(int[] a) {
		int[] temp = new int[5];
		//System.arraycopy(a, 0, temp, 0, a.length);
		for (int i = 0; i<a.length; i++) {
			temp[i] = a[i];
		}
		
		System.out.println("@@temp�� �ּ�: "+temp);
		return temp;
	}
	/*
	public static int[] copy2(int[] a) {
		int[]
	}
*/

}
