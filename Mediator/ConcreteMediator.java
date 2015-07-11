import java.util.ArrayList;

public class ConcreteMediator implements GeneralMediator{
    private ArrayList<GeneralPartner> partners = new ArrayList<>();
    private ArrayList<String> requests = new ArrayList<>();
    private ArrayList<String> offers = new ArrayList<>();
    private int partnerCodes = 0;

    public void request(String request, int partnerCode){
        boolean found = false;
      for(String actualOffer : offers){
        found = actualOffer.equalsIgnoreCase(request);
          if(found){
              System.out.println("A offer has been found to " + request);
              offers.remove(actualOffer);
              break;
          }
      }

      if(!found){
        System.out.println("There is no offers for " + request);
        requests.add(request);
      }
    }
    public void offer(String offer, int partnerCode){
      boolean found = false;
      for(String actualRequest : requests){
        found = actualRequest.equalsIgnoreCase(offer);
          if(found){
              System.out.println("A request has been found to " + offer);
              requests.remove(actualRequest);
              break;
          }
      }
      if(!found){
        System.out.println("There is no requests for " + offer);
        offers.add(offer);
      }
    }
    public void addPartner(GeneralPartner partner){
      partners.add(partner);
      partner.setPartnerCode(partnerCodes);
      partnerCodes++;
    }
}
