public class ConcreteChainOne implements GeneralChain{
	private GeneralChain nextInChain;
	public void setNextInChain(GeneralChain nextInChain){
		this.nextInChain = nextInChain;
	}
	public void handle(Request requestObject){
		if(requestObject.getRequest().equals("one")){
			System.out.println("(ONE) The data is: ");
			System.out.println(requestObject.getDataToHandle());
		}else{
			System.out.println("(ONE) To hot to handle baby, calling next in chain..");
			nextInChain.handle(requestObject);
		}
	}
}