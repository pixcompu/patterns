public class ConcreteObjectBuilder implements ObjectBuilder {
	
	private ObjectStructure concreteObject;

	public ConcreteObjectBuilder(){
		concreteObject = new ConcreteObjectStructure();
	}

	public void buildPartOne(){
		concreteObject.setPartOne("Upper Part");
	}
	public void buildPartTwo(){
		concreteObject.setPartTwo("Middle Part");	
	}
	public void buildPartThree(){
		concreteObject.setPartThree("Down Part");
	}
	public ObjectStructure getMyObject(){
		return concreteObject;
	}
}