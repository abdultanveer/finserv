package basics.inheritance;

public class Manager {
	
	public static void main(String[] args) {
		//IncomeTax incomeTax = new IncomeTax(10000);
		Gst gst = new Gst(10000);
		System.out.println(gst.calculateTax());
	}

}
