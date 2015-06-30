public class Bird extends Animal{
	public Bird(int w, String n, String d){
		super(w,n,d);
		setFlyHab(new itFly());
	}
}