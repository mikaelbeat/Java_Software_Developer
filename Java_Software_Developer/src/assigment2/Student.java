package assigment2;

import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class Student implements IAppFunctions{
	
	private static int studentID = 333;
	private String userID;
	private String studentName;
	private String SSN;
	private String emailAddress;
	private String schoolEmailAddress = "@CodingClass.fi";
	
	private double balance = 1000;
	private static DecimalFormat df = new DecimalFormat(".##");
	private double usedFungins;
	
	private String phone;
	private String city;
	private String state;
	
	private String enrolledCourse;
	
	public Student(String studentName, String SSN) {
		this.studentName = studentName;
		this.SSN = SSN;
		studentID++;
		System.out.println("New student "+studentName+" enrolled with student ID "+studentID+".\n");
		setEmailAddress();
		setUserID();
	}
	
	private void setUserID() {
		int random = ThreadLocalRandom.current().nextInt(1000,4000+1);
		userID = studentID+""+random+SSN.substring(7,11);
	}
	
	public void setEmailAddress() {
		String email;
		email = studentName.toLowerCase().replace(" ", ".").replace("ä","a").replace("ö","o").replace("å","a");
		this.emailAddress = email + schoolEmailAddress;
	}
	
	public String getEmailAddress() {
		System.out.println("Student "+studentName+" email address is "+emailAddress+".\n");
		return emailAddress;
	}

	public String getuserID() {
		System.out.println("Student "+studentName+" user ID is "+userID+".\n");
		return userID;
	}

	@Override
	public void enroll(String course) {
		this.enrolledCourse = course;
	}

	@Override
	public void pay(double amount) {
		balance -= amount;
		usedFungins += amount;
		System.out.println("Payed amount "+amount+"€, and balance is now "+df.format(balance)+"€.\n");
	}

	@Override
	public double checkBalance() {
		System.out.println("School funding balance is now "+balance+"€.\n");
		return balance;
	}

	@Override
	public String showCourses() {
		System.out.println("Student "+studentName+" is now enrolled to "+enrolledCourse+" course.\n");
		return enrolledCourse;
	}
	
	@Override
	public String toString() {
		System.out.println("****** STUDENT CARD ******");
		return "Student name: "+studentName+"\n"+"SSN: "+SSN+"\n"+"Student ID: "+studentID+"\n"+
		"User ID: "+userID+"\n"+"Email address: "+emailAddress+"\n"+"Phone number: "+phone+"\n"+
		"Home city: "+city+"\n"+"State: "+state+"\n"+"Enrolled course: "+enrolledCourse+"\n"+
		"Used school fundins: "+usedFungins+"€\n"+"School funding balance: "+df.format(balance)+"€\n";
	}
	
	public void setPhoneNumber(String phone) {
		this.phone = phone;
	}
	
	public String getPhoneNumber() {
		return phone;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}

}