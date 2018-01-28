package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name+" is walking.");
	}
	
	void eat() {
		System.out.println(name+" is eating.");
	}
	
	void sleep() {
		System.out.println(name+" is sleeping.");
	}
}

public class Demo {

	public static void main(String[] args) {
		
		// Instantiating an object
		Person person1 = new Person();
		
		// Define object properties
		person1.name = "Tester";
		person1.email = "tester@test.com";
		person1.phone = "0401121212";
		
		// Abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
		
		System.out.println("");
		System.out.println("***************************************\n");
		
		Person person2 = new Person();
		person2.name = "Snake";
		person2.email = "snake@snakemail.com";
		person2.phone = "0402232323";
		
		person2.walk();
		person2.eat();
		person2.sleep();
		
		
		

//		String name = "Tester";
//		String email = "tester@test.com";
//		String phone = "0401121201";
//		
//		walking(name);
//		
//		System.out.println(name+" is walking");
		
		}

}
