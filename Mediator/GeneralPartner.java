public abstract class GeneralPartner{
  private GeneralMediator myMediator;
  private int partnerCode;
  public GeneralPartner(GeneralMediator myMediator){
    this.myMediator = myMediator;
  }
  public void request(String request){
    System.out.println("The partner " + partnerCode + " has requested " + request);
    myMediator.request(request, partnerCode);
  }
  public void offer(String offer){
    System.out.println("The partner " + partnerCode + " has offered " + offer);
    myMediator.offer(offer, partnerCode);
  }
  public void setPartnerCode(int newPartnerCode){
    this.partnerCode = newPartnerCode;
  }
}
