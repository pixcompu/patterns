public class Launcher{
	public static void main(String[] args) {
		GeneralObject basicObject = new ExtraObjectTwo(new ExtraObjectOne(new BaseObject()));
		System.out.println("Final description of object : " + basicObject.getDescription());
		System.out.println("Final value of object : " + basicObject.getValue());
	}
}