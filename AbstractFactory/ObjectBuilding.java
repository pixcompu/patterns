public abstract class ObjectBuilding {
	public abstract GeneralObject makeObject(String typeOfObject);

	public GeneralObject orderTheObject(String typeOfObject){
		GeneralObject myObject = makeObject(typeOfObject);

		myObject.makeObject();
		myObject.firstFunction();
		myObject.secondFunction();

		return myObject;
	}
}