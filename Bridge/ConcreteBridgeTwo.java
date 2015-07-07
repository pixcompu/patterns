public class ConcreteBridgeTwo extends GeneralBridge{
	public ConcreteBridgeTwo(GeneralObjectOne theObject){
		super(theObject);
	}

	public void thirdFunction(){
		System.out.println("In third function defined in Bridge TWO");
	}
}