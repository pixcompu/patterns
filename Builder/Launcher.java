public class Launcher{
			/**
Razones por las cuales aplicar Builder:
	   -> Quiero separar la creacion de un objeto en partes
	   -> Quiero que solo la clase que une las partes "engineer" sepa los pasos especificos para crear el objeto
	Pasos para aplicar Builder:
		->Declara una interfaz estructura para una familia de objetos construibles
		->Declara una interfaz constructora que asigne valores especificos a cada parte
		->Haz posteriormente clases que los implenten y crea una nueva clase que este compuesta de un builder y 
			tenga un metodo el cual active todos los del builder (o los que se necesiten para construirlo)
*/
	public static void main(String[] args) {
		ConcreteObjectBuilder especificBuilder = new ConcreteObjectBuilder();
		ObjectEngineer objectMaker = new ObjectEngineer(especificBuilder);
		objectMaker.makeObject();
		System.out.println(objectMaker.getFinalObject());
	}
}