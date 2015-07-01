public class FactoryObjeto{
	public Objeto createObjeto(String type){
		if(type.equals("naruto")){
			return new NarutoObjeto("Naruto", "Anime Hero of Naruto");
		}else if(type.equals("goku")){
			return new GokuObjeto("Goku", "Anime Hero of Dragon Ball");
		}else{
			return null;
		}
	}
}