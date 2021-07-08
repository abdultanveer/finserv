package basics.inheritance;

public class Manager {
	
	public static void main(String[] args) {
		//IncomeTax incomeTax = new IncomeTax(10000);
		Gst gst = new Gst(10000);
		System.out.println(gst.calculateTax());
		//Util.calcTax(10000, 1000);
		float pi = 3.14f;
		int b = (int) pi;
		int a = 10;
		float c = a;
		System.out.println(c);
	}

}
