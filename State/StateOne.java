public class StateOne implements SystemState{

	private MainSystem actualState;

	public StateOne(MainSystem actualState){
		this.actualState = actualState;
	}

	public void triggerOne(){
		System.out.println("You're actually in state one..");
	}
	public void triggerTwo(){
		System.out.println("State changed, moving to state two");
		actualState.setActualState(actualState.getStateTwo());
	}
	public void triggerThree(){
		System.out.println("State changed, moving to state three");
		actualState.setActualState(actualState.getStateThree());
	}
}