package basics;
import java.util.Scanner;  
public class EvenOdd {  
	public static void main (String args[])  {  //main method is director whos lights camera action
		Customer customer = new Customer();
		customer.walkIn();
		customer.browseProducts();
		customer.shopProducts();
		
		
		Student.display();
		System.out.println(Student.COLLEGE_NAME);

		Student abdul = new Student("ansari",123,true);//new = mem allocation
		System.out.println("name of student is "+abdul.name);
		System.out.println(abdul.isElgible);
		/*
		 * abdul.name = "ansari"; abdul.age = 123;
		 */
		//creating Scanner class object     
		Scanner scan=new Scanner(System.in);  // new keyword will create the box in mem
		System.out.print("Enter the number: ");  //break point
		//reading value from the user  
		int num = scan.nextInt(); 
		
		for(int i=0; i<3; i++) {
			num = num+5;
		}
		//method calling  
		findEvenOdd(num);  
	}  
	
	

	/**
	 * it prints whether the given no is odd or even
	 * @param num
	 */
	public static void findEvenOdd(int num)	{  
		//method body  
		int a = 10; //local variable
		if(num%2==0)   
			System.out.println(num+" is even");   
		else   
			System.out.println(num+" is odd");  
	}  
}

//