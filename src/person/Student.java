package person;

public class Student extends Person {
	
	public Student() {
		System.out.println("Student() called");
	}
	
	public Student(String name) {
		super("Person");
		System.out.println("Student(String) called");
	}

	public void set() {
		name = "둘리";
		height = 150;
		age = 55;
		setWeight(150);
	}
}
