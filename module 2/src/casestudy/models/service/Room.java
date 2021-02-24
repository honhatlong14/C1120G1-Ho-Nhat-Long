package casestudy.models.service;

public class Room extends Service {
    private String freeService;

    public Room(String id, String nameService, String area, String price, String people, String type, String freeService) {
        super(id, nameService, area, price, people, type);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}';
    }

    @Override
    public String showInfo() {
        return super.toString() + "," + freeService;
    }

}
