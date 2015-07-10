public class StateThree implements SystemState{
	
	private MainSystem actualState;

	public StateThree(MainSystem actualState){
		this.actualState = actualState;
	}

	public void triggerThree(){
		System.out.println("You're actually in state three..");
	}
	public void triggerOne(){
		System.out.println("State changed, moving to state one");
		actualState.setActualState(actualState.getStateOne());
	}
	public void triggerTwo(){
		System.out.println("State changed, moving to state two");
		actualState.setActualState(actualState.getStateTwo());
	}
}