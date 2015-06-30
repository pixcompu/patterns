import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class Publisher implements Observable{
	
	private final HashMap<Integer, LinkedList<Observer>> suscriptors = new HashMap(); 

	public void register(int type, Observer o){
		if(!suscriptors.containsKey(type)){
			suscriptors.put(type, new LinkedList());
		}
		suscriptors.get(type).add(o);
	}
	public void unregister(int type, Observer o){
		if(suscriptors.containsKey(type)){
			suscriptors.get(type).remove(o);
		}
	}

	public void notify(int type, Evento evt){
		if(suscriptors.containsKey(type)){
			Iterator<Observer> itObservers = suscriptors.get(type).iterator();
			while(itObservers.hasNext()){
				itObservers.next().update(evt);
			}
		}
	}
}