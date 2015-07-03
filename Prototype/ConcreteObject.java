public class ConcreteObject implements GeneralObject{
	public GeneralObject makeCopy(){
		GeneralObject copyObject = null;
		try{
			copyObject = (ConcreteObject)super.clone();
		}catch(CloneNotSupportedException ex){
			ex.printStackTrace();
		}
		return copyObject;
	}
}