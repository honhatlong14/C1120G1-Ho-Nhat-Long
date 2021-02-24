package casestudy.models.service;

import casestudy.models.service.Service;

public class Villa extends Service {
    private String typeService;
    private String areaPool;
    private String floor;

    public Villa(String id, String nameService, String area, String price, String people,
                 String type, String typeService, String areaPool, String floor){
        super(id, nameService, area, price, people, type);
        this.typeService = typeService;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public String getTypeService() {
        return typeService;
    }

    public void setTypeService(String typeService) {
        this.typeService = typeService;
    }

    public String getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(String areaPool) {
        this.areaPool = areaPool;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return  typeService+","+ areaPool+","+floor;
    }

    @Override
    public String showInfo() {
        return super.toString()+ "," + typeService + "," + areaPool+","+floor;
    }
}
