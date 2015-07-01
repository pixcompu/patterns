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
		FactoryObjetos factory = new FactoryObjetos();
		Scanner scn = new Scanner(System.in);
		GeneralObject myGeneralObject = null;
		System.out.println("Ingresa un tipo (typeOne/typeTwo): ");
		String opcion = scn.nextLine();
		myGeneralObject = factory.createObjeto(opcion);
		if(myGeneralObject != null){
			myGeneralObject.doYourThing();
			myGeneralObject.doSomething();
		}else{
			System.out.println("No ingresaste algo valido");
		}
	}
}