
public class EngineOil extends InvoiceDecorator{
	
	public EngineOil(Invoice newInvoice, String roleName) {
		super(newInvoice, roleName);
	}
	
	public String getDescription() {
		return invoice.getDescription() + ", engine oil";
	}
	
	public double getPrice() {
		return invoice.getPrice() + 14.99;
	}
	
	public String getComposition() {
		return "Fully Synthetic";
	}
}
