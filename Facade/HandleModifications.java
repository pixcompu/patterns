public class HandleModifications{
	private int number;

	public int getNumber(){return number;}

	public HandleModifications(int initialNumber){
		this.number = initialNumber;
	}

	public void substractNumber(int numberToSubstract){
		number -= numberToSubstract;
		System.out.println("Actual number is " + number);
	}
	
}