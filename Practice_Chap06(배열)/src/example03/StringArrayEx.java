package example03;

import java.util.Arrays;

public class StringArrayEx {

	public static void main(String[] args) {
		// String �迭
//		String str = new String("�ڹ�");
//		System.out.println(str);
	
		// ��ü(Ŭ����) �迭	 --  2���� �迭
		String[] str = new String[] {
				"�ȳ�", "ȫ�浿", "�迬��"
		};
		
		for(int i = 0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		
		str[0] = "����";
		
		System.out.println("\n���� for��");
		// ���� for��
		for(String a :str) {
			System.out.println(a);
		}
		
		
		System.out.println();
		System.out.println(Arrays.toString(str));
		
		System.out.println();
		// �迭�� toString�� �ּҳ���!
		System.out.println("String �迭�� �ּ� : "+str.toString());
		// Object Ŭ������ ��� Ŭ������ �ְ� ����
		// String Ŭ������ ObjectŬ������ toString() �������̵�(������)@@!!
		System.out.println("String �迭�� �ּ� : "+str[0].toString());

	}

}
