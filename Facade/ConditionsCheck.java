public class ConditionsCheck{
	public boolean checkCondition(int initialNumber){
		if (initialNumber > 0) {
			return true;
		}else{
			System.out.println("Initial number not valid");
			return false;
		}
	}

	public boolean supportsModification(int initialNumber, int numberToSubstract){
		if (initialNumber - numberToSubstract > 0) {
			return true;
		}else{
			System.out.println("Operation not supported with actual number");
			return false;
		}
	}
}