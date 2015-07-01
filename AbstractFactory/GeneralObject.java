public abstract class GeneralObject{
	private String name;
	protected COPartOne partOne;
	protected COPartTwo partTwo;

	public String getName(){return name;}
	public void setName(String newName){this.name = newName;}

	public abstract void makeObject();
	
	public void firstFunction(){
		System.out.println(getName() + " is doing First Function with " + partOne);
	}
	
	public void secondFunction(){
		System.out.println(getName() + " is doing Second Function with " + partTwo);
	}

	@Override
	public String toString(){
		return "" + getName() + " has two parts " + partOne + " and " + partTwo + " .";
	}
}