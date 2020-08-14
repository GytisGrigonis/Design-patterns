
public class StartingInvoice implements Invoice{
	@Override
	public String getDescription() {
		return "Repairing";
	}
	
	@Override
	public double getPrice() {
		return 199.99;
	}
}
