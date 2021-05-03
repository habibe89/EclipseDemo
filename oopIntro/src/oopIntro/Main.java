package oopIntro;


public class Main {

	public static void main(String[] args) {
		Product product1  = new Product(1,"Java","Engin DEM�RO�");
		Product product2  = new Product(2,"C#","Engin DEM�RO�");
		Product product3  = new Product(3,"Temel Kurs","Engin DEM�RO�");

		Product[] products = {product1,product2,product3};
		
		for(Product product:products) {
			System.out.println("Kurs �smi: " + product.courseName);
			System.out.println(product.courseName + " Kursun e�itmeni: " + product.instructor);
		}
		
		Category category1 = new Category(1,"Kurslar�m");
		Category category2 = new Category(1,"T�m Kurslar");
		Category category3 = new Category(1,"Kampa Haz�rl�k");
		Category category4 = new Category(1,"S�k Sorulan Sorular");
		
		System.out.println("  ");
		
		System.out.println("��erik Kategorileri");
		Category[] categories = {category1,category2,category3,category4};
		
		for(Category category:categories) {
			System.out.println(category.name);
			
			}
		
		System.out.println(" ");
		ProductManager productManager = new ProductManager();
		productManager.addCourse(product1);
		productManager.addCourse(product2);
		productManager.addCourse(product3);
		

	}

}
