public class Launcher{
	public static void main(String[] args) {
		GeneralObjectTemplate objectOne = new ConcreteObjectTemplateOne(true);
		GeneralObjectTemplate objectTwo = new ConcreteObjectTemplateTwo(true);
		System.out.println("\nObject One Process: \n");
		objectOne.largeFunction();
		System.out.println("\nObject Two Process: \n");
		objectTwo.largeFunction();
		System.out.println("\nObject One Process with condition false: \n");
		objectOne = new ConcreteObjectTemplateOne(false);
		objectOne.largeFunction();
	}
}