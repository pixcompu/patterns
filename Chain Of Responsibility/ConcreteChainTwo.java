public class ConcreteChainTwo implements GeneralChain{
	private GeneralChain nextInChain;
	public void setNextInChain(GeneralChain nextInChain){
		this.nextInChain = nextInChain;
	}
	public void handle(Request requestObject){
		if(requestObject.getRequest().equals("two")){
			System.out.println("(TWO) The data is: ");
			System.out.println(requestObject.getDataToHandle());
		}else{
			System.out.println("(TWO) To hot to handle baby, calling next in chain..");
			nextInChain.handle(requestObject);
		}
	}
}