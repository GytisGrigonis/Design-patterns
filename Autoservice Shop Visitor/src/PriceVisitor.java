
public class PriceVisitor implements Visitor{
	
	public double visit(Visitable visitable) {
		return ((AbsInvoice) visitable).getPrice() * ((AbsInvoice) visitable).getSize();
	}
	
	/*public double visit(Wheels wheels){
		System.out.println("Wheels price");
		return wheels.getPrice() * wheels.getSize();
	}

	public double visit(BrakePads brakePads) {
		System.out.println("Brake pads");
		return brakePads.getPrice() * brakePads.getSize();
	}

	public double visit(EngineOil engineOil) {
		System.out.println("Engine oil");
		return engineOil.getPrice() * engineOil.getSize();
	}*/
}
