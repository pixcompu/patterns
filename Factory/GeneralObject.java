public abstract class GeneralObject{

	protected String name;
	protected String description;

	public GeneralObject(String newName, String newDescription){
		this.name = newName;
		this.description = newDescription;
	}

	public abstract void doYourThing();
	public void doSomething(){
		System.out.println("Im " + name + " doing someting");
	}
}