public class StateTwo implements SystemState{
	
	private MainSystem actualState;

	public StateTwo(MainSystem actualState){
		this.actualState = actualState;
	}

	public void triggerTwo(){
		System.out.println("You're actually in state two..");
	}
	public void triggerOne(){
		System.out.println("State changed, moving to state one");
		actualState.setActualState(actualState.getStateOne());
	}
	public void triggerThree(){
		System.out.println("State changed, moving to state three");
		actualState.setActualState(actualState.getStateThree());
	}
}