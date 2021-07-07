package basics;

/**
 * POJO -- plain old java object
 * javadoc
 * this is like a piece of paper with instructions
 * @author Admin
 *
 */
public class Student {
	String name;
	int age;
	boolean isElgible;
	
	static String COLLEGE_NAME = "IIT"; //static - it doesn't change
	
		public Student() {}//empty constructor

		public Student(String name, int age, boolean isElgible) { //constructor with params
			this.name = name;
			this.age = age;
			this.isElgible = isElgible;
		}

		

		public Student(String sname, int sAge) {
			this.name = sname;
			this.age = sAge;
		}
	
		public void isEligible() {
			if(isElgible) {
			System.out.println("student is elgible");
		}
			else {
			System.out.println("student is not eligible");	
			}
			}

		public static void display() {
			System.out.println("displaying students");
		}

}
