  

public class Main {

	public static void main(String[] args) {
		
		PriceVisitor priceVisitor = new PriceVisitor();
		PriceSpecialVisitor priceSpecialVisitor = new PriceSpecialVisitor();
		
		Wheels wheels = new Wheels(99.99, 4);
		
		System.out.println("Ratu kaina: " + wheels.accept(priceVisitor));
		System.out.println("Ratu kaina su nuolaida: " + wheels.accept(priceSpecialVisitor));
		
		BrakePads brakePads = new BrakePads(14.99, 4);
		
		System.out.println("Stabdziu kaladeliu kaina: " + brakePads.accept(priceVisitor));
		System.out.println("Stabdziu kaladeliu kaina su nuolaida: " + brakePads.accept(priceSpecialVisitor));
		
		EngineOil engineOil = new EngineOil(9.99, 1);
		
		System.out.println("Alyvos kaina: " + engineOil.accept(priceVisitor));
		System.out.println("Alyvos kaina su nuolaida: " + engineOil.accept(priceSpecialVisitor));

	}

}