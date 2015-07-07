public abstract class GeneralObject{
	protected String data;

	public GeneralObject(String data){
		this.data = data;
	}

	public String getData(){
		return data;
	}

	public void setData(String newData){
		this.data = newData;
	}

	public void add(GeneralObject element){
		throw new UnsupportedOperationException();
	}
	public void remove(GeneralObject element){
		throw new UnsupportedOperationException();
	}

	public abstract void printNode();

}