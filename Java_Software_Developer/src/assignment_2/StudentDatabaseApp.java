package assignment_2;

public class StudentDatabaseApp {

	public static void main(String[] args) {

		Student student1 = new Student("Heikki Helsinkiläinen", "200670-888X");
		
		student1.setPhoneNumber("+358 40 9938354");
		student1.setCity("Helsinki");
		student1.setState("Uusimaa");
		
		student1.checkBalance();
		student1.pay(100);
		
		student1.enroll("Java Programming");
		student1.enroll("C++");
		student1.showCourses();
		
		student1.getEmailAddress();
		student1.getuserID();
		
		System.out.println(student1.toString());


	}

}
