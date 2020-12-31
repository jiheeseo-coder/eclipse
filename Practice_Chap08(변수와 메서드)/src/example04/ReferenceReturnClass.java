package example04;

class Data{
	int data;
}

public class ReferenceReturnClass {

	public static void main(String[] args) {

		Data ori = new Data();
		ori.data = 100;
		
		Data cloned = copy(ori);
		System.out.println("cloned Data: "+ cloned.data);
		
		System.out.println("\nori�ּ�: "+ori);
		System.out.println("cloned�ּ�: "+cloned);
		
		Data cloned2 = new Data();
		
		// �̷��� �����ص���. �� ���� ������ �Լ����� �����鼭 �����ϰ� �ұ�,.?
		System.out.println();
		cloned2.data = ori.data;
		System.out.println("cloned2 Data: "+ cloned2.data);
		
		System.out.println("\nori�ּ�: "+ori);
		System.out.println("cloned�ּ�: "+cloned2);
	}
	
	public static Data copy(Data d) {
		Data temp = new Data();
		temp.data = d.data;
		
		return temp;
		// d�ѱ�� �ּҰ� ��������, temp �ѱ�� �ּҰ� �޶�����.
	}

}
