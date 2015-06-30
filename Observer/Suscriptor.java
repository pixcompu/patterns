public class Suscriptor implements Observer{
	
	private static int contr = 0;

	public void update(Evento evt){
		System.out.println("N°" + (++contr) +  " | Im Updating in event " + evt.getType() + 
			" and his description is " + evt.getDescription());
	}
}