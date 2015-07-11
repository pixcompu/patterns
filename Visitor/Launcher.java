public class Launcher{
  public static void main(String[] args) {
    GeneralVisitable someInfo = new ConcreteVisitable("im the info");
    GeneralVisitor theLectorOftheInfo = new ConcreteVisitor();
    System.out.println(someInfo.accept(theLectorOftheInfo));
  }
}
