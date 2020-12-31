package example02;

public class Create_X {

	public static void main(String[] args) {

		for (int i = 0; i<5; i++) {
			for(int j =0; j<5; j++) {
				if(i == j || 4-j == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
