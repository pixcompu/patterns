public class Launcher{
	public static void main(String[] args) {
		GeneralObjectOne thePureObject, theAdaptedObject;
		thePureObject = new ConcreteObjectOne();
		theAdaptedObject = new AdapterGeneralObjectTwoToOne(new ConcreteObjectTwo());

		thePureObject.funtionOfObjectOne();
		theAdaptedObject.funtionOfObjectOne();
	}
}