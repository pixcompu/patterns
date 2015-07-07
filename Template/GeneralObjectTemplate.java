public abstract class GeneralObjectTemplate{
	
	protected boolean condition;

	public GeneralObjectTemplate(boolean condition){
		this.condition = condition;
	}

	public final void largeFunction(){
		obligatoryFunction();
		miniFunctionOne();
		if(condition){
			optionalFunction();
		}
	}

	public void obligatoryFunction(){
		System.out.println("Obligatory Function is executing");
	}

	public abstract void miniFunctionOne();

	public void optionalFunction(){
		System.out.println("Optional Function is executing");
	}
}