
public class AlloyWheel extends AutoPartDecorator{

	public AlloyWheel(SimpleAutoPart newPart, String roleName) {
		super(newPart, roleName);
		System.out.println("Adding Alloy Wheel..");
	}
	
	public String getDescription() {
		return "Alloy Wheel";
	}
	
	public double getPrice() {
		return part.getPrice() + 100;
	}
	
	public String getType() {
		return "Ascent";
	}
}
