public class TypeOneObject extends GeneralObject{
	private ObjectFactory objectFactory;

	public TypeOneObject(ObjectFactory objectFactory){
		this.objectFactory = objectFactory;
	}

	public void makeObject(){
		System.out.println("Making object type one : " + getName());
		partOne = objectFactory.addCOPartOne();
		partTwo = objectFactory.addCOPartTwo();
	}
}