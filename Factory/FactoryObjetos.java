public class FactoryObjetos{
	public GeneralObject createObjeto(String type){
		if(type.equals("typeOne")){
			return new TypeOneObject("Type One", "a type one object");
		}else if(type.equals("typeTwo")){
			return new TypeTwoObject("Type Two", "a type two object");
		}else{
			return null;
		}
	}
}