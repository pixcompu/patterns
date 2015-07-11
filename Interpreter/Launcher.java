import java.util.Scanner;

public class Launcher{
  public static void main(String[] args) {
    GeneralInterpreter theInterpreter = null;
    System.out.println("What interpretation of concepts one & two do you want? (one/two)");
    String input = new Scanner(System.in).nextLine();
    if (input.compareToIgnoreCase("one") == 0) {
      theInterpreter = new ConcreteInterpreterOne();
    }else if(input.compareToIgnoreCase("two") == 0){
      theInterpreter = new ConcreteInterpreterTwo();
    }

    if(theInterpreter != null){
      System.out.println(theInterpreter.conceptOne());
      System.out.println(theInterpreter.conceptTwo());
    }else{
      System.out.println("Only one/two allowed, incorrect input");
    }


  }
}
