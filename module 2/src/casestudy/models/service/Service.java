package casestudy.models.service;

public abstract class Service {
    private String id;
    private String nameService;
    private String area;
    private String price;
    private String people;
    private String type;

    public Service() {
    }

    public Service(String id, String nameService, String area, String price, String people, String type) {
        this.id = id;
        this.nameService = nameService;
        this.area = area;
        this.price = price;
        this.people = people;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return id+","+nameService+","+area+","+price+","+people+","+type;
    }
    public abstract String showInfo();
}
