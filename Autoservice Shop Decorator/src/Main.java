
public class Main {
	public static void main(String[] args) {
		
		Invoice invoice = new BrakePads(new Wheels(new StartingInvoice(), "Wheels"), "Brake Pads");

		System.out.println("Invoice for: " + invoice.getDescription());
		
		System.out.println("Amount: " + invoice.getPrice());
		
		
		Wheels wheels = (Wheels) (((InvoiceDecorator) invoice)).getRole("Wheels");
		if(wheels != null) {
			System.out.println("Type of wheels: " + wheels.getType());	
		}
		
		System.out.println("Remove role: " + ((InvoiceDecorator) invoice).removeRole("Brake Pads"));
		
		System.out.println("Invoice for: " + invoice.getDescription());
		
	}
}
