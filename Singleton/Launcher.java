public class Launcher{
		/**
Razones por las cuales aplicar Singleton:
	   -> Quiero mantener una unica instancia del objeto para todo el sistema
	Pasos para aplicar Singleton:
		->Haz el constructor de la clase deseada private
		->Haz una variable estatica dentro de esa clase que sea del mismo tipo que esa clase
		->Crea un metodo estatico en el que si la variable es null la inicialize con new, de otro modo devuelva la variable
*/
	public static void main(String[] args) {
		System.out.println("Test Singleton Pattern");
		Singleton firstInstance = Singleton.getInstance();
		System.out.println("First instance ID " + System.identityHashCode(firstInstance));
		Singleton secondInstance = Singleton.getInstance();
		System.out.println("Second instance ID " + System.identityHashCode(secondInstance));
	}
}