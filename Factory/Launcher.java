import java.util.Scanner;
/**
Razones por las cuales aplicar Factory:
	   -> Quiero crear un cierto objeto pero no se que tipo aun
	   -> Todos los objetos potenciales que puedo crear son subtipos de un tipo mayor
	Pasos para aplicar Factory:
		->Crea una familia de objetos usando una interfaz como clase padre
		->Haz una clase Factory que unicamente tenga como funcion recibir una orden y devolver un 
			objeto de tipo "clase padre"
*/
public class Launcher{
	public static void main(String[] args) {
		FactoryObjeto factory = new FactoryObjeto();
		Scanner scn = new Scanner(System.in);
		Objeto personaje = null;
		System.out.println("Ingresa un personaje (naruto/goku): ");
		String opcion = scn.nextLine();
		personaje = factory.createObjeto(opcion);
		if(personaje != null){
			personaje.doYourThing();
			personaje.doSomething();
		}else{
			System.out.println("No ingresaste algo valido");
		}
	}
}