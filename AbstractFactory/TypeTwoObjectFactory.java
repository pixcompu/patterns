public class TypeTwoObjectFactory implements ObjectFactory{
	
	//Dont panick Type Two is our concrete object and Part One
	//is our concrete "atribute" of that object. 

	public COPartOne addCOPartOne(){
		return new COTypeTwoPartOne();
	}
	public COPartTwo addCOPartTwo(){
		return new COTypeTwoPartTwo();
	}

	//COPartN
}