public abstract class ObjectDecorator implements GeneralObject{

	protected GeneralObject template;

	public ObjectDecorator(GeneralObject template){
		this.template = template;
	}

	public String getDescription(){
		return template.getDescription();
	}
	public double getValue(){
		return template.getValue();
	}
}