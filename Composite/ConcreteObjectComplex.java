import java.util.ArrayList;

public class ConcreteObjectComplex extends GeneralObject{

	private ArrayList<GeneralObject> listaCompuestos = new ArrayList<>();

	public ConcreteObjectComplex(String data){
		super(data);
	}

	public void add(GeneralObject element){
		listaCompuestos.add(element);
	}
	public void remove(GeneralObject element){
		listaCompuestos.remove(element);
	}

	public void printNode(){
		System.out.println("(COMPUESTO) Data : " + data);
		if (!listaCompuestos.isEmpty()) {
			System.out.println("Printing Childs");
			for(int i = 0; i<listaCompuestos.size(); i++){
				listaCompuestos.get(i).printNode();
			}
		}
	}
}