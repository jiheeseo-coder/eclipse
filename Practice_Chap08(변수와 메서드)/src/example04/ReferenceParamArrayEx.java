package example04;

public class ReferenceParamArrayEx {

	public static void main(String[] args) {

		int[] arr = new int[] {10, 20, 30, 40, 50};
		System.out.println("change()�޼ҵ� ȣ����: "+ arr[0]);
		System.out.println("main() arr�� �ּ�: "+arr);
		change(arr);		// �迭���� �� �ּ�
		// change(new int[] {10, 20, 30}); 		// ������ ���� �ּҰ��� �Ѱܵ� �ȴ�.
		System.out.println("change()�޼ҵ� ȣ����: "+ arr[0]);
		
	}
	
	public static void change(int[] arr) {
		arr[0] = 999;
		System.out.println("change()�޼ҵ� ���� ��: " + arr[0]);
		System.out.println("change() arr�� �ּ�: "+arr);
	}

}
