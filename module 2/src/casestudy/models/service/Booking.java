package casestudy.models.service;

public class Booking {
    String nameCustomer;
    String cardIdCustomer;
    String dateCustomer;
    String idService;
    String nameService;

    public Booking(String nameCustomer, String cardIdCustomer, String dateCustomer, String idService, String nameService) {
        this.nameCustomer = nameCustomer;
        this.cardIdCustomer = cardIdCustomer;
        this.dateCustomer = dateCustomer;
        this.idService = idService;
        this.nameService = nameService;
    }


    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getCardIdCustomer() {
        return cardIdCustomer;
    }

    public void setCardIdCustomer(String cardIdCustomer) {
        this.cardIdCustomer = cardIdCustomer;
    }

    public String getDateCustomer() {
        return dateCustomer;
    }

    public void setDateCustomer(String dateCustomer) {
        this.dateCustomer = dateCustomer;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    @Override
    public String toString() {
        return
                nameCustomer + ',' +
                        cardIdCustomer + ',' +
                        dateCustomer + ',' +
                        idService + ',' +
                        nameService;
    }
}
