package example02;

public class CalculatorEx {

	public static void main(String[] args) {
	
		// �ν��Ͻ� �޼ҵ� ȣ��
		Calculator cal = new Calculator();
		int addr = cal.add(100, 200);
		System.out.println("add: " + addr);
		
		// static �޼ҵ� ȣ��
		long mulr = Calculator.mul(100, 20);
		System.out.println("multiply: "+mulr);
		
		double divr = Calculator.div(100, 20);
		System.out.println("divide: " + divr);
		
		// static �޼ҵ�� �۾��� ������
		// ���� �޼����� ����(����ο� static�����ڰ� �پ��ִ�.) -- �ڹٴڽ����� Ȯ��
		//Integer.parseInt("100");
		//Math.random();
		
	}

}
