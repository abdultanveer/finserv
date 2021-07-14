package basics.interfaces;

public class GEAppliances implements ISwitchBoard {

	@Override
	public void switchOne() {
		System.out.println("GE fan is running");
		
	}

	@Override
	public void switchTwo() {
		System.out.println("GE ac is running");
		
	}

	@Override
	public void switchThree() {
		System.out.println("GE light is on");
		
	}

}
