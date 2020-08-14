
public class InvoiceDecorator implements Invoice{
	protected Invoice invoice;
	private String roleName;
	
	public InvoiceDecorator(Invoice newInvoice, String roleName) {	
		this.invoice = newInvoice;
		this.setRoleName(roleName);	
	}
		
	public InvoiceDecorator getRole(String role) {
		if(this.getRoleName().equals(role)) {
			return this;
		} else {
			if(invoice instanceof InvoiceDecorator) {
				return ((InvoiceDecorator) invoice).getRole(role);
			} else {
				return null;
			}	
		}			
	}
	
	public InvoiceDecorator removeRole(String role) {
		if(this.getRoleName().equals(role)) {
			if(invoice instanceof InvoiceDecorator) {
				return (InvoiceDecorator) invoice;
			} else {
				return null;
			}
		} else if(invoice instanceof InvoiceDecorator) {
			((InvoiceDecorator) invoice).removeRole(role);
		}
		return this;
	}
	
	public String getDescription() {
		return invoice.getDescription();
	}
	
	public double getPrice() {
		return invoice.getPrice();
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
