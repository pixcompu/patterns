public class TypeOneObject extends GeneralObject{

	public TypeOneObject(String name, String des){
		super(name, des);
	}

	@Override
	public void doYourThing(){
		System.out.println("Doing things of type one object");
	}
}