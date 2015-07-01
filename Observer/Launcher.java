public class Launcher{
/**
Razones por las cuales aplicar Observer:
	   -> Quiero disparar una actualizacion a varios aspectos de un sistema cada vez que ocurra un evento
	   -> Quiero proteger la informacion de las clases que disparan el evento y las que lo reciben
	Pasos para aplicar Observer:
		->Haz una interfaz de Observer que tenga un metodo que maneje la llegada de un evento (update)
		->Todos las clases que esten a la espera de un evento deben implementar Observer
		->Haz una interfaz de Observable que tenga un metodo que agregue Observers a una coleccion, remueva Observers
			de una Coleccion y uno que ejecute el metodo update en cada item de la Coleccion (notify)
		->Todas las clases que disparen eventos deben implementar Observable
		->Desde cualquier parte de Observable (cuando ocurra un evento), llama a notify
*/

	public static void main(String[] args){
		Publisher reporter = new Publisher();
		Suscriptor obs = new Suscriptor();
		Suscriptor obsOne = new Suscriptor();
		Suscriptor obsTwo = new Suscriptor();

		reporter.register(0, obs);
		reporter.register(0, obsOne);
		reporter.register(0, obsTwo);
		reporter.register(1, obs);
		reporter.register(1, obsTwo);
		reporter.register(2, obsOne);

		reporter.notify(0, new Evento(0, "zero"));
		reporter.notify(1, new Evento(1, "uno"));
		reporter.notify(2, new Evento(2, "dos"));
	}
}