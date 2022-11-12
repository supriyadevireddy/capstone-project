package inclassassignment;

public class Book {

	private String  name;
	private String author;
	private int cost;
	public Book(String name, String author, int cost) {
		super();
		this.name = name;
		this.author = author;
		this.cost = cost;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", cost=" + cost + "]";
	
	
	}
}


