package example03;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;		//flag����
		int speed = 0;
		
		while(run) {
			
			System.out.println();
			System.out.println("---------------------------------");
			System.out.println("   1.����     |   2.����      |   3.����     ");
			System.out.println("---------------------------------");
			System.out.print("�Է� : ");
			int choice = sc.nextInt();
			
			if (choice == 1) {
				speed++;
				System.out.println("���� �ӵ� : " + speed);
			}
			else if(choice ==2) {
				speed--;
				System.out.println("���� �ӵ� : " + speed);	
			}
			else if(choice == 3){
				// break;
				// System.exit(0);
				run = false;
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
			}
			else {
				System.out.println("�߸��� �Է°��Դϴ�.");
			}
		}
		
		
		sc.close();
		
	}

}
