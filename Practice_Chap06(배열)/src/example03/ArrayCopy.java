package example03;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] ori = new int[]{10, 77,33,50};
		int[] target = new int [10];
		int count=0;
		
		System.out.println("�����ϱ� ��");
		System.out.println(Arrays.toString(ori));
		System.out.println(Arrays.toString(target));
		System.out.println("target ���� : "+target.length);
		
		// for���� �̿��ؼ� ���� �����ϴ� ���
//		for(int i = 0; i<ori.length; i++) {
//			target[i] = ori[i];
//		}
//		
		
//		for(int i : ori) {
//			target[count++] = i;
//		}
		
		// System.arraycopy() ����ӵ��� ���� ������.
		System.arraycopy(ori, 0, target, 0, ori.length);
//		target = Arrays.copyOf(ori, ori.length);
		// Arrays�� copyOf�޼���� ������ ����� �迭�� �����ϰ� ���縦 �ع����� �迭���� �޼ҵ��̴�.
		
		System.out.println();
		System.out.println("������ ��");
		System.out.println(Arrays.toString(ori));
		System.out.println(Arrays.toString(target));
		System.out.println("target ���� : "+target.length);
		
		
		
		
	}

}
