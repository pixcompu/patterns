public class Evento{
	private int type;
	private String description;

	public Evento(int type, String des){
		this.type = type;
		this.description = des;
	}

	public int getType(){
		return type;
	}

	public String getDescription(){
		return description;
	}

}