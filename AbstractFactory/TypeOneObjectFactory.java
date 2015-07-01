public class TypeOneObjectFactory implements ObjectFactory{
	
	//Dont panick Type One is our concrete object and Part One
	//is our concrete "atribute" of that object. 

	public COPartOne addCOPartOne(){
		return new COTypeOnePartOne();
	}
	public COPartTwo addCOPartTwo(){
		return new COTypeOnePartTwo();
	}

	//COPartN
}