package basics.inheritance.superkw;

public class Dog extends Animal{
	
	String name;
	
	public Dog() {
		//super();
		System.out.println("creating dog");
	}
	
	{
		System.out.println("in instance init block");
		name = "german shepherd";
		
	}
	

	
	  public Dog(String dogName) { 
			System.out.println("in constructor");

		  this.name = dogName;
		  System.out.println("creating "+dogName); 
		  }
	 



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public void eat() {
		System.out.println("dog is eating bread");
	}
	
	public void bark() {System.out.println("barking");}
	
	public void work() {
		eat();
		this.bark();
	}

}
