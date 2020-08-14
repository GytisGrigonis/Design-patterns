
public class BrakePads extends InvoiceDecorator{
	
	public BrakePads(Invoice newInvoice, String roleName) {
		super(newInvoice, roleName);
	}
	
	public String getDescription() {
		return invoice.getDescription() + ", brake pads";
	}
	
	public double getPrice() {
		return invoice.getPrice() + 9.99;
	}
	
	public int getQuantity() {
		return 4;
	}
}
