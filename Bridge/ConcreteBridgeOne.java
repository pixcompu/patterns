public class ConcreteBridgeOne extends GeneralBridge{
	public ConcreteBridgeOne(GeneralObjectOne theObject){
		super(theObject);
	}

	public void thirdFunction(){
		System.out.println("In third function defined in Bridge ONE");
	}
}