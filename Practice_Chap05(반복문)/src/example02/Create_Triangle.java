package example02;

public class Create_Triangle {

	public static void main(String[] args) {

//		********
//		*******
//		******
//		*****
//		****
//		***
//		**
//		*

		for (int i = 0; i<8; i++) {
			for (int j = 8-i; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
