public class Launcher{
  public static void main(String[] args) {
    GeneralMediator mainMediator = new ConcreteMediator();

    GeneralPartner one=null, two=null;
    one = new ConcretePartnerOne(mainMediator);
    two = new ConcretePartnerTwo(mainMediator);
    mainMediator.addPartner(one);
    mainMediator.addPartner(two);

    one.offer("playStation");
    one.offer("Shirt");
    one.request("cellphone");
    two.offer("cellphone");
    two.request("xbox");
    two.request("shirt");
  }
}
