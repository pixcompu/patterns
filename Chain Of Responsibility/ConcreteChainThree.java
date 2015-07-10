public class ConcreteChainThree implements GeneralChain{
	private GeneralChain nextInChain;
	public void setNextInChain(GeneralChain nextInChain){
		this.nextInChain = nextInChain;
	}
	public void handle(Request requestObject){
		if(requestObject.getRequest().equals("three")){
			System.out.println("(THREE) The data is: ");
			System.out.println(requestObject.getDataToHandle());
		}else{
			System.out.println("(THREE) chain is over, the system supports \"one\", \"two\" & \"three\"");
		}
	}
}