package model.bean;

public class BenhNhan {
    private String id;
    private String name;
    private String ngayNhap;
    private String ngayRa;
    private String lyDo;

    public BenhNhan() {
    }

    public BenhNhan(String id, String name, String ngayNhap, String ngayRa, String lyDo) {
        this.id = id;
        this.name = name;
        this.ngayNhap = ngayNhap;
        this.ngayRa = ngayRa;
        this.lyDo = lyDo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getNgayRa() {
        return ngayRa;
    }

    public void setNgayRa(String ngayRa) {
        this.ngayRa = ngayRa;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }
}
