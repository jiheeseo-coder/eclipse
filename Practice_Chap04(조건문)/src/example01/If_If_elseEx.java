package example01;

public class If_If_elseEx {

	public static void main(String[] args) {
		
		int score = -300;
		
		// ���ʰ��� if���� �����ϴ���, CPU�� ��� if���� �����մϴ�.(��ȿ������ �ڵ�)
//		if(score > 90) {
//			System.out.println("������ 90���� Ů�ϴ�.");
//			System.out.println("����� A�Դϴ�.");
//		}
//		
//		if(score > 80) {
//			System.out.println("������ 80���� Ů�ϴ�.");
//			//System.out.println("����� A�Դϴ�.");	
//		}
//		
//		if(score > 92) {
//			System.out.println("������ 80���� Ů�ϴ�.");
//			//System.out.println("����� A�Դϴ�.");
//		}
		
		// if-else ������ 50% Ȯ���� ��, ����ϴ� �� �ٶ����ϴ�.
		// else���� ������ ���ǹ��� ����� ���� �ȵȴ�.
		if(score >= 90) {
			System.out.println("90�� �̻��Դϴ�.");
			System.out.println("2����");
		}
		else 
			System.out.println("90�� �̸��Դϴ�.");
		
		
		
		

	}

}
