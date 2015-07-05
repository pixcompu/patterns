public class ChildClass extends DadClass{
	private int numberOfTimes=0; 
	private String nameToShow="";

	public ChildClass(int numberOfTimes, String nameToShow){
		this.numberOfTimes = numberOfTimes;
		this.nameToShow = nameToShow;
	}

	public ChildClass(){}

	private String obtainingReturnValue(){
		return "You never gonna readme outside of ChildClass.class";
	}

	private String executingWithParamethers(int paramOne, String paramTwo){
		return "What how did you?! heres your params : " + paramOne + " | " + paramTwo;
	}

	private void myHelloWorldNTimes(){
		if (numberOfTimes > 0) {
			for (int i = 0; i<numberOfTimes; i++ ) {
			System.out.println("Hello World " + nameToShow);
			}
		}else{
			System.out.println("You little cheater");
		}
	}	
}