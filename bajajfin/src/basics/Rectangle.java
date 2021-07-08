package basics;

public class Rectangle {
	int length;
	int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public int getPerimeter() {
		return (length+breadth)*2;
	}
	
	

}
