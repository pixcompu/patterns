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

}