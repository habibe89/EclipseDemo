package oopIntro;


public class Main {

	public static void main(String[] args) {
		Product product1  = new Product(1,"Java","Engin DEMÝROÐ");
		Product product2  = new Product(2,"C#","Engin DEMÝROÐ");
		Product product3  = new Product(3,"Temel Kurs","Engin DEMÝROÐ");

		Product[] products = {product1,product2,product3};
		
		for(Product product:products) {
			System.out.println("Kurs Ýsmi: " + product.courseName);
			System.out.println(product.courseName + " Kursun eðitmeni: " + product.instructor);
		}
		
		Category category1 = new Category(1,"Kurslarým");
		Category category2 = new Category(1,"Tüm Kurslar");
		Category category3 = new Category(1,"Kampa Hazýrlýk");
		Category category4 = new Category(1,"Sýk Sorulan Sorular");
		
		System.out.println("  ");
		
		System.out.println("Ýçerik Kategorileri");
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
