package model.bean;

public class BenhAn {
    private String id;
    private String idBenhNhan;
    private String solve;
    private String doctor;

    public BenhAn() {
    }

    public BenhAn(String id, String idBenhNhan, String solve, String doctor) {
        this.id = id;
        this.idBenhNhan = idBenhNhan;
        this.solve = solve;
        this.doctor = doctor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdBenhNhan() {
        return idBenhNhan;
    }

    public void setIdBenhNhan(String idBenhNhan) {
        this.idBenhNhan = idBenhNhan;
    }

    public String getSolve() {
        return solve;
    }

    public void setSolve(String solve) {
        this.solve = solve;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
}