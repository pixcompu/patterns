public class Singleton{
	private static Singleton firstInstance = null;

	private Singleton(){}

	public static Singleton getInstance(){
		//Why syncronized? because you dont want to mess with Threads
		synchronized(Singleton.class){
			if (firstInstance == null) {
				firstInstance = new Singleton();
			}
		}
		return firstInstance;
	}
}