package btec_2;
/*
 * @author Abdsaleh
 */
public abstract class Product {
	private String color;
	private String fabric;
	private double price;
	
	Product(String color, String fabric , double price)
	{
		this.color = color;
		this.price = price;
		this.fabric = fabric;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFabric() {
		return fabric;
	}

	public void setFabric(String fabric) {
		this.fabric = fabric;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product{" + "color=" + color + ", fabric=" + fabric + ", price=" + price + '}';
	}
	
	
	
}
