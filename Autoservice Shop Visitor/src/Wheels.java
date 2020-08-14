
public class Wheels extends AbsInvoice{
	
	private double price;
	private double size;
	
	public Wheels(double item, int size) {
		setPrice(item);
		setSize(size);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}
	
	public double accept(Visitor visitor) {
		return visitor.visit(this);
	}	
}
