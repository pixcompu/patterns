public class Launcher{
	public static void main(String[] args) {
		GeneralObject simpleOne = new ConcreteObjectSimple("song","a song");
		GeneralObject simpleTwo = new ConcreteObjectSimple("doc","a word doc");
		GeneralObject simpleThree = new ConcreteObjectSimple("image","a picture");
		GeneralObject simpleFour = new ConcreteObjectSimple("executable","a game");
		GeneralObject simpleFive = new ConcreteObjectSimple("video","a anime video");
		GeneralObject simpleSix = new ConcreteObjectSimple("html","a page of facebook");

		GeneralObject complexOne = new ConcreteObjectComplex("some folder one");
		GeneralObject complexTwo = new ConcreteObjectComplex("some folder two");
		GeneralObject complexRoot = new ConcreteObjectComplex("the root folder");

		complexOne.add(simpleOne);
		complexOne.add(simpleTwo);
		complexOne.add(simpleThree);
		complexTwo.add(simpleFour);
		complexTwo.add(simpleFive);
		complexTwo.add(simpleSix);
		complexRoot.add(complexOne);
		complexRoot.add(complexTwo);

		complexRoot.printNode();
		
	}
}