public class Launcher{
	public static void main(String[] args) {
		GeneralProxy proxy = new ConcreteProxySampleObject();
		System.out.println("I only can show the value nothing else | value : " + proxy.getData());
	}
}