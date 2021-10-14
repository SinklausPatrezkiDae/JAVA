public class Person{
	String name;
	int age;
	
	//constructor
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return this.name + "\n" +this.age + "\n";
	}
}