package polymorphism;

public class Main {

	public static void main(String[] args) {
		
		Animal a = new Dog();
		Animal b = new Cat();
		
		a.makeSound();
		b.makeSound();
		
		System.out.println("***************************\n");
		
		Animal pet[] = new Animal[2];
		pet[0] = new Dog();
		pet[1] = new Cat();
		
		for (int i=0 ; i<2; i++) {
			pet[i].makeSound();
		}

	}

}
