package example01;

public class IncreDreEx {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		
		System.out.println("---------------------");
		System.out.println("x = "+ x++);	// ������������
		// x ���� ���ߴ��� Ȯ��
		System.out.println("x = "+ x);		
		System.out.println("y = "+ ++y); 	// ������������
		System.out.println("y = "+ y);
		System.out.println("---------------------");

		// �´� ,,,, 23�̶� �����ߴµ� �̰� anytype+���ڿ��̶� ���ڿ��� ����
		//System.out.println("(x++) + (++y) : " +(x++) + (++y));
		System.out.println("(x++) + (++y) : " +((x++) + (++y)));
		
	}

}
