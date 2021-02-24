package casestudy.models.service;

public class House extends Service {
    private String typeHouse;
    private String floor;

    public House(String id, String nameService, String area, String price, String people, String type, String typeHouse, String floor) {
        super(id, nameService, area, price, people, type);
        this.typeHouse = typeHouse;
        this.floor = floor;
    }

    public String getTypeHouse() {
        return typeHouse;
    }

    public void setTypeHouse(String typeHouse) {
        this.typeHouse = typeHouse;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "typeHouse='" + typeHouse + '\'' +
                ", floor='" + floor + '\'' +
                '}';
    }

    @Override
    public String showInfo() {
        return super.toString()+ "," + typeHouse + ","+floor;
    }
}
