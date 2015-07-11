public class Memento{
  private String objectOfInterest;
  public Memento(String newVersionOfObject){
      objectOfInterest = newVersionOfObject;
  }
  public String getSavedObject(){
    return objectOfInterest;
  }
}
