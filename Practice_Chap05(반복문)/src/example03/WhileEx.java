package example03;

public class WhileEx {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;	//while���� �ʱ�ȭ �κ� ���� ���� X
		
		// while�� ������ ���ǽĸ� ���� ������ , for���� ���ؼ� �Ϲ��� ���ο�����
		// �������� ��������.
		while(i <= 100) {
			sum += i;
			i++;
		}
		
		i = 1;
		// C������ ���� boolean Ÿ���� ����. �Ͽ� 0 : False, 0�� ������ ��� �� : True
		// while���� ���ѷ��������� ���� ���ȴ�. 
		// if()��, break���� �Բ� ���ѷ����� ��� �ڵ带 �ۼ������ �Ѵ�.
		while(true) {
			
			System.out.println(i);
			if(i >= 100) {
				break;
			}
			
			i++;
		}
		
		System.out.println("1 ~ 100������ �� : " + sum);
		

	}

}
