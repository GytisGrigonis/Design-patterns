
abstract class AutoPartDecorator implements SimpleAutoPart{
	protected SimpleAutoPart part;
	private String roleName;
	
	public AutoPartDecorator(SimpleAutoPart newPart, String roleName) {	
		this.part = newPart;
		this.setRoleName(roleName);	
	}
		
	public AutoPartDecorator getRole(String role) {
		if(this.getRoleName().equals(role)) {
			return this;
		} else {
			if(part instanceof AutoPartDecorator) {
				return ((AutoPartDecorator) part).getRole(role);
			} else {
				return null;
			}	
		}			
	}
	
	public AutoPartDecorator removeRole(String role) {
		if(this.getRoleName().equals(role)) {
			if(part instanceof AutoPartDecorator) {
				return (AutoPartDecorator) part;
			} else {
				return null;
			}
		} else if(part instanceof AutoPartDecorator) {
			((AutoPartDecorator) part).removeRole(role);
		}
		return this;
	}
	
	public String getDescription() {
		return part.getDescription();
	}
	
	public double getPrice() {
		return part.getPrice();
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
}
