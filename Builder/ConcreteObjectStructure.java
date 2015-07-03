public class ConcreteObjectStructure implements ObjectStructure {
	private String partOne, partTwo, partThree;

	public void setPartOne(String partOne){
		this.partOne = partOne;
	}
	public void setPartTwo(String partTwo){
		this.partTwo = partTwo;
	}
	public void setPartThree(String partThree){
		this.partThree = partThree;
	}
	@Override
	public String toString(){
		return "Parts of my object: \nPartOne = " + partOne + "\n" + "PartTwo = " + partTwo + "\n" + "PartThree = " + partThree;
	}
}