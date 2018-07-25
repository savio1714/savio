package ClickNPick;

public abstract class Clothing extends Department{
	private Integer Size,tax;
	private Integer Price;
	private String Brand;
	private	String Color;
	
	public Clothing() {
		
		Size=0;
		Price=0;
		Brand ="";
		Color="";
	}
	public Clothing(Integer Size) {
		this.Size=Size;
		
	}
	
	public Clothing(Integer Size,Integer Price ,String Brand,String Color) {
		this.Size=Size;
		this.Price=Price;
		this.Brand =Brand;
		Color="";
	}
	public abstract void Calprice();
	//public abstract void properties();
	public Integer getSize() {
		return Size;
	}
	public void setSize(Integer size) {
		Size = size;
	}
	public Integer getPrice() {
		return Price;
	}
	public void setPrice(Integer price) {
		Price = price;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	
	

}
