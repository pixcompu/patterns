public class Launcher{
				/**
Razones por las cuales aplicar Prototype:
	   -> Quiero crear copias de un objeto ya construido sin que el cliente tenga que lidear con errores y excepciones
	Pasos para aplicar Prototype:
		->Haz una interfaz general que extienda de Cloneable y tenga un metodo que devuelva un objecto de tipo general
		->Declara una clase concreta de esa interfaz de modo que el metodo hecho antes consista en llamar a "super.clone"
			y el manejo de sus respectivos errores potenciales
		->Haz una clase que contenga un metodo el cual reciba un objeto de tipo interfaz general y devuelva el resultado
			de llamar a su metodo concreto que devuelve copias
*/
	public static void main(String[] args) {
		CloningFactory factoryOfCopies = new CloningFactory();
		ConcreteObject originalObject = new ConcreteObject();
		ConcreteObject copyObject = (ConcreteObject)factoryOfCopies.getCopy(originalObject);
		System.out.println("Hash of original = " + System.identityHashCode(originalObject)
			+ "\nHash of Copy = " + System.identityHashCode(copyObject));
	}
}