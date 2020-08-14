
public class Wheels extends InvoiceDecorator{

	public Wheels(Invoice newInvoice, String roleName) {
		super(newInvoice, roleName);
	}
	
	public String getDescription() {
		return invoice.getDescription() + ", wheels";
	}
	
	public double getPrice() {
		return invoice.getPrice() + 99.99;
	}
	
	public String getType() {
		return "alloy";
	}
}
