package basics.interfaces;

public class WiringManager {
	
	public static void main(String[] args) {
		//salary slip -- accounts@bajaj.com
		ISwitchBoard switchBoard = new GEAppliances();
				//new HavellsAppliances();//wiring
		switchBoard.switchOne();
		switchBoard.switchTwo();
		switchBoard.switchThree();
	}

}
