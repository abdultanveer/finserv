package basics.inheritance.superkw;

public class Dog extends Animal{
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
