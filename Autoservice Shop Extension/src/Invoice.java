import java.util.HashMap;
import java.util.Map;

public class Invoice implements IInvoice {
	
	Map<String, InvoiceExtension> extensions = new HashMap<String, InvoiceExtension>();
	
	public String getDescription() {
		String description = "Repairing";
		for (Map.Entry<String, InvoiceExtension> entry : extensions.entrySet()) {
			description = description.concat((entry.getValue().getDescription()));
		}
		return description;
	}
	
	public double getPrice() {
		Double price = 99.99;
		for (Map.Entry<String, InvoiceExtension> entry : extensions.entrySet()) {
			price += (entry.getValue().getPrice());
		}
		return price;
	}
	
	public void addExtension(String extType, InvoiceExtension newSnack) {
		extensions.put(extType, newSnack);
	}
	
	public InvoiceExtension getExtension(String extType) {
		InvoiceExtension snack = extensions.get(extType);
		return snack;
	}
	
	public void removeExtension(String extType) {
		extensions.remove(extType);
	}
}