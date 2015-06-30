public class Animal{
	protected int weigth;
	protected String name;
	protected String description;
	protected Fly flyHab;

	public Animal(int w, String n, String d){
		this.weigth = w;
		this.name = n;
		this.description = d;
	}

	public void setFlyHab(Fly hability){
		this.flyHab = hability;
	}

	public String tryToFly(){
		return flyHab.tryFly();
	}

	public static void main(String[] args){
		Dog firulais = new Dog(2, "firulais", "a.. dog");
		Bird alfred = new Bird(1, "alfred", "a.. bird");

		System.out.println("Dog -" + firulais.tryToFly());
		System.out.println("Bird -" + alfred.tryToFly());
	}
}