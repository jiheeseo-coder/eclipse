package example01;

public class ForEx02 {

	public static void main(String[] args) {
		
		int sum = 0;

		// ����� : debug â���� �ǵ�ġ �ʰ� �Ѿ�ٸ�, ���α׷��� ����
		// �߻��� ������ ������ ��Ƴ����� ������ ������̶�� �մϴ�.
		// BreakPoint(������) ���� ��, �����Ű�� F8�� �����鼭 �Ѵܰ辿
		// ������� �����鼭 ������ ������ ���쳪���� ������ ���� ���� �� �ִ�.
		
		// �����հ谡 2000 ���� �� i�� ���� ����Ͻÿ�
		for(int i = 1; i <= 100; i++) {
			sum += i;
			if(sum >= 2000) {
				System.out.println("2000 �̻��� ��  i ��: "+i);
				break;
			}
		}
		System.out.println("2000�̻���  �� �� : "+sum);
		
		
	}

}
