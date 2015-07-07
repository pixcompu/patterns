public class Launcher{
	public static void main(String[] args) {
		FlyweightFactory flyweight = new FlyweightFactory();

		System.out.println("\nTest without the pattern\n");
		long start = System.currentTimeMillis();
		for(int i = 0; i<100; i++){
			flyweight.generateDataAndCorrupt_NoFlyweight();
		}
		long end = System.currentTimeMillis();
		System.out.println("\nTraditional took " + (end-start));

		System.out.println("\nTest with the pattern\n");
		start = System.currentTimeMillis();
		for(int i = 0; i<100; i++){
			flyweight.generateDataAndCorrupt_Flyweight();
		}
		end = System.currentTimeMillis();
		System.out.println("\nFlyweight took " + (end-start));
	}
}