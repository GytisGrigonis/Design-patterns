
public class WheelsExtension implements InvoiceExtension {
	
	public String getType() {
		return "alloy";
	}

	@Override
	public String getDescription() {
		return ", alloy wheels";
	}

	@Override
	public double getPrice() {
		return 99.99;
	}

}