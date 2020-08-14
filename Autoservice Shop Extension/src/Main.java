
public class Main {

	public static void main(String[] args) {

		Invoice invoice = new Invoice();
		
		invoice.addExtension("WheelsExtension", new WheelsExtension());
		
		invoice.addExtension("BrakePadsExtension", new BrakePadsExtension());
		
		System.out.println(invoice.extensions);

		System.out.println(((WheelsExtension)invoice.getExtension("WheelsExtension")).getType());
		
		System.out.println(invoice.getDescription());
		System.out.println(invoice.getPrice());
		
		invoice.removeExtension("WheelsExtension");
		
		System.out.println(invoice.getDescription());
	}

}
