import java.util.Scanner;

public class Launcher{
  public static void main(String[] args) {
    Caretaker caretaker = new Caretaker();
    Originator originator = new Originator();
    boolean ejecutando = true;
    Scanner console = new Scanner(System.in);
    String actualText = "", input=null;
    /**
    Adding original state
    */
    originator.set(actualText);
    caretaker.addMemento(originator.storeInMemento());
    /**
    Adding original state
    */
    int actualVersion = 0, versions = 0;
    do{
      System.out.println("Actual text is \"" + actualText + "\"");
      System.out.print("Select an option (add text/undo/redo/exit) : ");
      input = console.nextLine();
      if(input.equalsIgnoreCase("add text")){
        System.out.print("Text :" + actualText);
        String textToAdd = console.nextLine();
        actualText += textToAdd;
        originator.set(actualText);
        caretaker.addMemento(originator.storeInMemento());
        actualVersion++;
        versions++;
      }else if(input.equalsIgnoreCase("undo")){
        if (actualVersion>0) {
          actualVersion--;
        }
        actualText = originator.restoreFromMemento(caretaker.getMemento(actualVersion));
      }else if(input.equalsIgnoreCase("redo")){
        if(actualVersion < versions){
          actualVersion++;
        }
        actualText = originator.restoreFromMemento(caretaker.getMemento(actualVersion));
      }else if(input.equalsIgnoreCase("exit")){
        ejecutando = false;
      }else{
        System.out.println("Invalid Input");
      }
    }while(ejecutando);
  }
}
