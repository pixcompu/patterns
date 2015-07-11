import java.util.ArrayList;

public class Caretaker{
  private ArrayList<Memento> savedObjects = new ArrayList<>();

  public void addMemento(Memento toStore){
    savedObjects.add(toStore);
  }

  public Memento getMemento(int index){
    return savedObjects.get(index);
  }

}
