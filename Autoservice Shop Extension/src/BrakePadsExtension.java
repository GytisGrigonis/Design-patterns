
public class BrakePadsExtension implements InvoiceExtension{
	public int getQuantity() {
		return 4;
	}

	@Override
	public String getDescription() {
		return ", brake pads";
	}

	@Override
	public double getPrice() {
		return 14.99;
	}
}
