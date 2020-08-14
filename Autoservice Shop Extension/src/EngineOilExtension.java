
public class EngineOilExtension implements InvoiceExtension{
	public String getComposition() {
		return "Fully Synthetic";
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
