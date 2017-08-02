package person;

public class Person {
	
	public String name;
	protected int height;
	int age;
	private int weight;

	public Person() {
		System.out.println("Person() called");
	}
	public Person(String str) {
		System.out.println("Person(str) called");
	}
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
}
