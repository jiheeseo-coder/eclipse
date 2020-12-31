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
		
		System.out.println("\nori주소: "+ori);
		System.out.println("cloned주소: "+cloned);
		
		Data cloned2 = new Data();
		
		// 이렇게 복사해도됨. 왜 굳이 저렇게 함수까지 만들어가면서 복잡하게 할까,.?
		System.out.println();
		cloned2.data = ori.data;
		System.out.println("cloned2 Data: "+ cloned2.data);
		
		System.out.println("\nori주소: "+ori);
		System.out.println("cloned주소: "+cloned2);
	}
	
	public static Data copy(Data d) {
		Data temp = new Data();
		temp.data = d.data;
		
		return temp;
		// d넘기면 주소가 같아지고, temp 넘기면 주소가 달라진다.
	}

}
