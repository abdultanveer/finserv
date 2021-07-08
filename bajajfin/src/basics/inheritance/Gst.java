package basics.inheritance;

public class Gst extends IncomeTax {

	public Gst(int income) {
		super(income);
	}
	
	@Override
	public int calculateTax() {
		// TODO Auto-generated method stub
		int oldTax = super.calculateTax();
		int serviceCharges = super.income/100;
		return oldTax + serviceCharges;
	}

	
}
