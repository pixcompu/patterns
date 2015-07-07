import java.util.HashMap;
import java.util.Random;

public class FlyweightFactory{
	private final String[] palabras = {
		"warrior",
		"ninja",
		"cop",
		"raptor",
		"sayan",
		"god",
		"titan",
		"programmer"
	};

	private final HashMap<String, DataHandler> cache = new HashMap<>();

	public void generateDataAndCorrupt_NoFlyweight(){
		Random randGen = new Random();
		String randString = palabras[randGen.nextInt(palabras.length)];
		System.out.print("\nOriginal word : " + randString);
		DataHandler corrupter = new DataHandler(randString);
		System.out.print(" | Corrupted word : " + corrupter.corruptInput());
	}

	public void generateDataAndCorrupt_Flyweight(){
		Random randGen = new Random();
		String randString = palabras[randGen.nextInt(palabras.length)];
		System.out.print("\nOriginal word : " + randString);
		DataHandler corrupter = cache.get(randString);
		if(corrupter == null){
			corrupter = new DataHandler(randString);
			cache.put(randString, corrupter);
		}
		System.out.print(" | Corrupted word : " + corrupter.corruptInput());
	}
}