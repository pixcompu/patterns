	public class Launcher{
	/**
	Razones por las cuales aplicar Strategy:
	   -> Quiero definir un comportamiento diferente para cada objeto, sin embargo esos comportamientos tienen algo en comun
	   -> Quiero poder cambiar el comportamiento en tiempo de ejecucion
	Pasos para aplicar Strategy:
		->Haz una familia de comportamientos mediante una interfaz principal
		->Todos los comportamientos deben implementar esa interfaz principal
		->En cada objeto define un atributo de tipo interfaz principal y sus respectivos get/set
		->Crea funciones en cada objeto que llamen a funciones de la interfaz principal
		->Cambiando el objecto interfaz principal, las funciones que hayas definido tomaran otros comportamientos
	*/

	public static void main(String[] args){
		Dog firulais = new Dog(2, "firulais", "a.. dog");
		Bird alfred = new Bird(1, "alfred", "a.. bird");

		System.out.println("Dog -" + firulais.tryToFly());
		System.out.println("Bird -" + alfred.tryToFly());
	}
}