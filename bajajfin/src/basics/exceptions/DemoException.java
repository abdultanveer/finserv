package basics.exceptions;

public class DemoException {
	static int data;

	public static void main(String[] args) {
			try {
				data = 100/0;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				data = 20/0;
			}
		
		System.out.println("rest of the code");
	}

}
