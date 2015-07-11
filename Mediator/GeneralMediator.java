public interface GeneralMediator{
  public void request(String request, int partnerCode);
  public void offer(String offer, int partnerCode);
  public void addPartner(GeneralPartner partner);
}
