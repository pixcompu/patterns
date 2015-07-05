public class AdapterGeneralObjectTwoToOne implements GeneralObjectOne {
	
	private GeneralObjectTwo theObject;

	public AdapterGeneralObjectTwoToOne(GeneralObjectTwo theObject){
		this.theObject = theObject;
	}

	public void funtionOfObjectOne(){
		theObject.funtionOfObjectTwo();
	}
}