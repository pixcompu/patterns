public class FunctionOneCommand implements Command{
	GeneralObject theObject;

	public FunctionOneCommand(GeneralObject theObject){
		this.theObject = theObject;
	}

	public void execute(){
		theObject.functionOne();
	}
}