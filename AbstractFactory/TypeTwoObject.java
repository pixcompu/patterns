public class TypeTwoObject extends GeneralObject{
	private ObjectFactory objectFactory;

	public TypeTwoObject(ObjectFactory objectFactory){
		this.objectFactory = objectFactory;
	}

	public void makeObject(){
		System.out.println("Making object type two : " + getName());
		partOne = objectFactory.addCOPartOne();
		partTwo = objectFactory.addCOPartTwo();
	}
}