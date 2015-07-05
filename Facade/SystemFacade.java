public class SystemFacade{
	private PrintWelcome printer;
	private ConditionsCheck checker;
	private HandleModifications handler;

	public SystemFacade(int initialNumber){
		printer = new PrintWelcome();
		checker = new ConditionsCheck();
		handler = new HandleModifications(initialNumber);
		printer.printWelcomeMessage();
	}

	public void makeChange(int numberToSubstract){
		int actualNumber = handler.getNumber();
		if (checker.checkCondition(actualNumber)
				&& checker.supportsModification(actualNumber, numberToSubstract)) {
			handler.substractNumber(numberToSubstract);
			System.out.println("Successful Change");
		}else{
			System.out.println("Change Failed");
		}
	}
}