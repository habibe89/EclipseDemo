package oopIntro;

public class Product { //�zellik tutucu class
	int id;
	String courseName;
	String instructor;
	public Product() {
			System.out.println("Kurs ba�lat�ld�");
}
	public Product(int id,String courseName,String instructor) {
	
	this.id = id;
	this.courseName = courseName;
	this.instructor = instructor;
	}
	

}
