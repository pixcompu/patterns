public class Dog extends Animal{

	public Dog(int w, String n, String d){
		super(w, n, d);
		setFlyHab(new cantFly());
	}

	public void digHole(){
		System.out.println(super.name + " Digged a Hole");
	}
}