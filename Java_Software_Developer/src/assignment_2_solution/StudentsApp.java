package assignment_2_solution;

public class StudentsApp {

	public static void main(String[] args) {


		Student st1 = new Student("Tester", "030370-121X");
		st1.enroll("Math");
		st1.enroll("C++");
		st1.enroll("History");
		st1.showCourses();
		st1.checkBalance();
		st1.payTuition(300);
		System.out.println(st1.toString());
		
		

	}

}

class Student {
	
	private static int ID = 100;
	private String userID;
	private String name;
	private String ssn;
	private String email;
	private String courses = "";
	private static final int constOfCourse = 800;
	private double balance = 0;
	
	public Student(String name, String ssn) {
		ID++;
		this.name = name;
		this.ssn = ssn;
		setEmail();
		setUserID();
		System.out.println("");
	}

	private void setUserID() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * ((max - min)));
		randNum = randNum + min;
		userID = ID + randNum + ssn.substring(7);
		System.out.println("Student "+name+" user ID is:"+userID+".");
	}

	private void setEmail() {
		email = name.toLowerCase()+"."+ID+"@edu.fi";
		System.out.println("Student "+name+" email address is: "+email+".");
	}
	
	public void enroll(String course) {
		this.courses = this.courses + "\n" + course; 
		balance = balance + constOfCourse;
	}
	
	public void payTuition(double amount) {
		System.out.println("Payment: "+amount+".\n");
		balance -= amount;
	}
	
	public void checkBalance() {
		System.out.println("Balance is: "+balance+"€.\n");
	}
	
	public void showCourses() {
		System.out.println(courses);
	}
	
	@Override
	public String toString() {
		return "Student name is: "+name+"\n"+"SSN: "+ssn+"\n"+"Enrolled courses: "+courses+".";
		
	}
}