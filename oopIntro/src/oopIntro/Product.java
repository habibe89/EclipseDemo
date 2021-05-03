package oopIntro;

public class Product { //özellik tutucu class
	int id;
	String courseName;
	String instructor;
	public Product() {
			System.out.println("Kurs baþlatýldý");
}
	public Product(int id,String courseName,String instructor) {
	
	this.id = id;
	this.courseName = courseName;
	this.instructor = instructor;
	}
	

}
