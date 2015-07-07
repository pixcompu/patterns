public class Launcher{
	public static void main(String[] args) {
		GeneralBridge theBridge = new ConcreteBridgeOne(new ConcreteObjectOne());
		GeneralBridge theBridgeTwo = new ConcreteBridgeTwo(new ConcreteObjectOne());
		System.out.println("Functions with bridge one : ");
		theBridge.firstFunction();
		theBridge.secondFunction();
		theBridge.thirdFunction();
		System.out.println("Functions with bridge two : ");
		theBridgeTwo.firstFunction();
		theBridgeTwo.secondFunction();
		theBridgeTwo.thirdFunction();
	}
}