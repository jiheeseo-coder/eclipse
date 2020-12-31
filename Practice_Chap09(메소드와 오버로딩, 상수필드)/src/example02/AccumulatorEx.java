package example02;

class A{
	int data1 = 10;
	int data2 = 30;
}

public class AccumulatorEx {

	public static void main(String[] args) {

		Accumulator ac = new Accumulator();
		int iresult = ac.add(10, 50);
		System.out.println("result: "+ iresult);
		
		// 접미사 반드시 붙이도록 하자.
		long lresult = ac.add(100, 700L);
		System.out.println("result: "+ lresult);
		
		lresult = ac.add(1000L, 10);
		System.out.println("result: "+ lresult);
		
		double dresult = ac.add(5.3336, 2934.745);
		System.out.println("result: "+ dresult);
		
		lresult = ac.add(new int[] {1,2,3,4,5});
		System.out.println("result: "+ lresult);
		
		iresult = ac.add(new A());
		System.out.println("result "+ iresult);
	}

}
