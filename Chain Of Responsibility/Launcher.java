public class Launcher{
	public static void main(String[] args) {
		GeneralChain chainOne = new ConcreteChainOne();
		GeneralChain chainTwo = new ConcreteChainTwo();
		GeneralChain chainThree = new ConcreteChainThree();

		chainOne.setNextInChain(chainTwo);
		chainTwo.setNextInChain(chainThree);

		Request theRequest;
		System.out.println(">>>>>>>>>>>>>Testing with one starting in One<<<<<<<<<<<<<<<");
		theRequest = new Request("Only \"one\" can handle me", "one");
		chainOne.handle(theRequest);

		System.out.println(">>>>>>>>>>>>>Testing with three starting in One<<<<<<<<<<<<<<<");
		theRequest = new Request("Only \"three\" can handle me", "three");
		chainOne.handle(theRequest);

		System.out.println(">>>>>>>>>>>>>Testing with four starting in One<<<<<<<<<<<<<<<");
		theRequest = new Request("Only \"four\" can handle me", "four");
		chainOne.handle(theRequest);
	}
}