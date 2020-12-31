package example02;

public class Gugudan {

	public static void main(String[] args) {

		for (int i = 2; i < 10; i += 2) {
			System.out.println("****" + i + "´Ü****\t****" + (i+1) + "´Ü****");
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + (i * j));
				System.out.print("\t" + (i + 1) + " * " + j + " = " + (i + 1) * j+"\n");
			}
			System.out.println();

		}

	}

}
