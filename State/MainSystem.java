public class MainSystem{
	private SystemState stateOne;
	private SystemState stateTwo;
	private SystemState stateThree;

	private SystemState actualState;	

	public MainSystem(){
		stateOne = new StateOne(this);
		stateTwo = new StateTwo(this);
		stateThree = new StateThree(this);

		actualState = stateOne;
	}

	public void setActualState(SystemState newState){
		actualState = newState;
	}

	public void triggerOne(){
		actualState.triggerOne();
	}
	public void triggerTwo(){
		actualState.triggerTwo();
	}
	public void triggerThree(){
		actualState.triggerThree();
	}

	public SystemState getStateOne(){
		return stateOne;
	}
	public SystemState getStateTwo(){
		return stateTwo;
	}
	public SystemState getStateThree(){
		return stateThree;
	}
}