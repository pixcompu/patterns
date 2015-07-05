public class Launcher{
	public static void main(String[] args) {
		GeneralObject myObject = new ConcreteObjectOne();
		Command functionOne, functionTwo;
		CommandExecutor executor;
		functionOne = new FunctionOneCommand(myObject);
		functionTwo = new FunctionTwoCommand(myObject);

		executor = new CommandExecutor(functionOne);
		executor.startExecuting();
		executor = new CommandExecutor(functionTwo);
		executor.startExecuting();
	}
}