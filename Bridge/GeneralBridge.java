public abstract class GeneralBridge{
	private GeneralObjectOne theObject;

	public GeneralBridge(GeneralObjectOne theObject){
		this.theObject = theObject;
	}

	public void firstFunction(){
		theObject.firstFunction();
	}

	public void secondFunction(){
		theObject.secondFunction();
	}

	public abstract void thirdFunction();
}