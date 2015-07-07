public class ConcreteObjectTemplateTwo extends GeneralObjectTemplate{
	public ConcreteObjectTemplateTwo(boolean condition){
		super(condition);
	}

	public void miniFunctionOne(){
		System.out.println("Executing mini function in Template Two");
	}
}