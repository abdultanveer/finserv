package basics.interfaces;

public class HavellsAppliances implements ISwitchBoard{

	@Override
	public void switchOne() {
		System.out.println("havells fan is running");
	}

	@Override
	public void switchTwo() {
		System.out.println("havells ac is running");
		
	}

	@Override
	public void switchThree() {
		System.out.println("havells ligh is on");
		
	}

}
