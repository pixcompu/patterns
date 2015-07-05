public class ExtraObjectTwo extends ObjectDecorator{
	public ExtraObjectTwo(GeneralObject template){
		super(template);
	}

	@Override
	public String getDescription(){
		return template.getDescription() + " plus a ExtraObjectTwo";
	}

	@Override
	public double getValue(){
		return template.getValue() + 1.0;
	}
}