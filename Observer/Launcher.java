public class Launcher{
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