public class Launcher{
	/**
Razones por las cuales aplicar AbstractFactory:
	   -> Quiero obtener un objeto compuesto de otros objectos de los cuales no se el tipo aun lo mas general posible
	   -> Quiero proteger la informacion y encapsular la creacion de los objetos
	Pasos para aplicar AbstractFactory:
		->Has una familia de Factoris (ver patron anterior)
		->Has una familia de objetos lo mas general posible
		->Para la construccion maneja los tipos mas abstractos de las familias que creaste
		->Este patron es el mas extenso de todos, recomendaria un estudio mas profundo si se quiere aplicar
*/
	public static void main(String[] args) {
		ObjectBuilding makeObjects = new ConcreteObjectBuilding();
		GeneralObject typeOne = makeObjects.orderTheObject("typeOne");
		System.out.println(typeOne);
		GeneralObject typeTwo = makeObjects.orderTheObject("typeTwo");
		System.out.println(typeTwo);
	}
}