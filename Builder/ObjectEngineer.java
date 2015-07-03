public class ObjectEngineer{
	private ObjectBuilder potentialObjectBuilder;

	public ObjectEngineer(ObjectBuilder potentialObjectBuilder){
		this.potentialObjectBuilder = potentialObjectBuilder;
	}

	public void makeObject(){
		potentialObjectBuilder.buildPartOne();
		potentialObjectBuilder.buildPartTwo();
		potentialObjectBuilder.buildPartThree();
	}

	public ObjectStructure getFinalObject(){
		return potentialObjectBuilder.getMyObject();
	}
}