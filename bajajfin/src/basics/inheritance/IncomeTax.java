package basics.inheritance;

public class IncomeTax {

	public int income;
	
	public IncomeTax(int income) {
		this.income = income;
	}

	public int calculateTax() {
		return income/10;
	}
}
