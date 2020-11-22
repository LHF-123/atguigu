package com.atguigu.day21exer;

//声明一个Book类型，有编号、书名、作者、价格、销量
public class Book implements Comparable{
	private int id;
	private String title;
	private String author;
	private double price;
	private int amount;
	
	public Book(int id, String title, String author, double price, int amount) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
		this.amount = amount;
	}

	public Book() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", price=" + price + ", amount=" + amount
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	//按照销量从高到低
	@Override
	public int compareTo(Object o) {
		Book book = (Book) o;
		return book.amount - this.amount;
	}
	
	
	
}
