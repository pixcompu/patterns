public class FunctionTwoCommand implements Command{
	GeneralObject theObject;

	public FunctionTwoCommand(GeneralObject theObject){
		this.theObject = theObject;
	}

	public void execute(){
		theObject.functionTwo();
	}
}