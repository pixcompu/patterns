public class ConcreteObjectBuilding extends ObjectBuilding{
	public GeneralObject makeObject(String typeOfObject){
		GeneralObject myObject = null;

		if(typeOfObject.equals("typeOne")){
			ObjectFactory objectParts = new TypeOneObjectFactory();
			myObject = new TypeOneObject(objectParts);
			myObject.setName("Type One Object");
		}else if(typeOfObject.equals("typeTwo")){
			ObjectFactory objectParts = new TypeTwoObjectFactory();
			myObject = new TypeTwoObject(objectParts);
			myObject.setName("Type Two Object");
		}else{
			//Type 3,4,5,6,...,n 
		}
		return myObject;
	}
}