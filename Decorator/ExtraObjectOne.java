public class ExtraObjectOne extends ObjectDecorator{
	
	public ExtraObjectOne(GeneralObject template){
		super(template);
	}

	@Override
	public String getDescription(){
		return template.getDescription() + " plus a ExtraObjectOne";
	}

	@Override
	public double getValue(){
		return template.getValue() + 1.0;
	}
}