
public class PriceSpecialVisitor implements Visitor{
	
	public double visit(Visitable visitable) {
		return ((AbsInvoice) visitable).getPrice() * ((AbsInvoice) visitable).getSize() * 0.8;
	}
}
