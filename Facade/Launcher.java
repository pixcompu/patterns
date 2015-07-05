public class Launcher{
	public static void main(String[] args) {
		SystemFacade encapsulatedSystem = new SystemFacade(10);
		encapsulatedSystem.makeChange(3);
		encapsulatedSystem.makeChange(5);
		encapsulatedSystem.makeChange(4);
	}
}