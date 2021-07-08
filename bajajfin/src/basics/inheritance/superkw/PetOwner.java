package basics.inheritance.superkw;

public class PetOwner {
	public static void main(String[] args) {
		Dog dog = new Dog("pomerian");
				//new Dog();
				
		System.out.println(dog.name);
		System.out.println(dog.name.length());
		dog.work();
	}

}
