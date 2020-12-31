package example05;

public class SamsungPhoneEx {

	public static void main(String[] args) {
		
		SamsungPhone sam = new SamsungPhone();
		sam.setCompany("ªÔº∫");
		sam.setModel("Galaxy Note 8");
		sam.setRelease(2018);
		sam.setColor("∞À¡§");
		
		System.out.println(sam.toString());

		//SamsungPhone lg = new SamsungPhone();
		sam.setCompany("LG");
		sam.setModel("G6");
		sam.setRelease(2017);
		sam.setColor("ª°∞≠");
		
		System.out.println(sam.toString());

	}

}
