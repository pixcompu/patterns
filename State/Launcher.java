public class Launcher{
	public static void main(String[] args) {
		MainSystem theSystem = new MainSystem();
		theSystem.triggerOne();
		theSystem.triggerOne();
		theSystem.triggerOne();
		theSystem.triggerTwo();
		theSystem.triggerTwo();
		theSystem.triggerOne();
		theSystem.triggerThree();
		theSystem.triggerThree();
		theSystem.triggerOne();
	}
}