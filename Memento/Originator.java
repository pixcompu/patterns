public class Originator{
  private String objectOfInterest;
  public void set(String newVersionOfObject){
    objectOfInterest = newVersionOfObject;
  }
  public Memento storeInMemento(){
    return new Memento(objectOfInterest);
  }
  public String restoreFromMemento(Memento memento){
      objectOfInterest = memento.getSavedObject();
      return objectOfInterest;
  }

}
