public class ConcreteVisitable implements GeneralVisitable{
  private String info;

  public String accept(GeneralVisitor theVisitor){
    return theVisitor.visit(this);
  }
  public ConcreteVisitable(String info){
    this.info = info;
  }

  public String getInfo(){
    return info;
  }
}
