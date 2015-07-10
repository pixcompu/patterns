public interface GeneralChain{
	public void setNextInChain(GeneralChain nextInChain);
	public void handle(Request request);
}