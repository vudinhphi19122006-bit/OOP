
public class Book {
	public String title;
	public String author;
	public double price;
	
	public void displayInfo() {
		System.out.println("Ten sach: " + title);
		System.out.println("Ten tac gia: " + author);
		System.out.println("Gia ban: " + price + "VND");
		System.out.println("------------------");
	}
}
