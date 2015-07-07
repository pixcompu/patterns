public class ConcreteObjectSimple extends GeneralObject{
	String description;

	public ConcreteObjectSimple(String data, String description){
		super(data);
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setDescription(String newDescription){
		this.description = newDescription;
	}

	public void printNode(){
		System.out.println("(SIMPLE) Data : " + data + " | Description : " + description);
	}

}