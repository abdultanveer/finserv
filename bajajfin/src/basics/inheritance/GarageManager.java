package basics.inheritance;

public class GarageManager {
	
	public static void main(String[] args) {
		//Bike bike = new Bike();
		Vehicle  vehicle = new Bike(); //datatype is of super class, object is of subclass
		vehicle.run();
		Vehicle vehicle2;   //entry in table of contents
		vehicle2 = new Vehicle();  //actually writing the chapter
	}

}
