public interface Fly{
	public String tryFly();
}
class itFly implements Fly{
	public String tryFly(){
		return "Flying";
	}
}
class cantFly implements Fly{
	public String tryFly(){
		return "I can't fly";
	}
}