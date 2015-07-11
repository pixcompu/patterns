public class ConcreteVisitor implements GeneralVisitor{
  public String visit(GeneralVisitable theHost){
    return "Accesing to the information of the host, here you can modify the info without afecting the host, the info is \"" +  theHost.getInfo()+"\"";
  }
}
