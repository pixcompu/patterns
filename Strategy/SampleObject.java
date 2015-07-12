public class SampleObject{

  private GeneralBehavior behavior = null;

  public SampleObject(){
    behavior = new ConcreteBehaviorOne();
  }

  public void setBehavior(GeneralBehavior behavior){
    this.behavior = behavior;
  }

  public void tryToDoSomething(){
    System.out.println(behavior.doSomething());
  }

  public void changeBehavior(){
    if(behavior instanceof ConcreteBehaviorOne){
      setBehavior(new ConcreteBehaviorTwo());
    }else{
      setBehavior(new ConcreteBehaviorOne());
    }
  }

}
