package basics;
import java.util.Scanner;  
public class EvenOdd {  
	public static void main (String args[])  
	{  
		Student abdul = new Student();
		
		abdul.name = "ansari";
		abdul.age = 123;
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
	public static void findEvenOdd(int num)  
	{  
		//method body  
		if(num%2==0)   
			System.out.println(num+" is even");   
		else   
			System.out.println(num+" is odd");  
	}  
}

//