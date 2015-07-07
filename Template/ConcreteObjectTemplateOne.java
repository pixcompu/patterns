public class ConcreteObjectTemplateOne extends GeneralObjectTemplate{
	public ConcreteObjectTemplateOne(boolean condition){
		super(condition);
	}

	public void miniFunctionOne(){
		System.out.println("Executing mini function in Template One");
	}
}