package model;

public class PhongTro {
    String id;
    String ten_nguoi_thue;
    String so_dien_thoai;
    String ngay_bat_dau_thue;
    String hinh_thuc_thanh_toan;

    public PhongTro() {
    }

    public PhongTro(String id, String ten_nguoi_thue, String so_dien_thoai, String ngay_bat_dau_thue, String hinh_thuc_thanh_toan) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen_nguoi_thue() {
        return ten_nguoi_thue;
    }

    public void setTen_nguoi_thue(String ten_nguoi_thue) {
        this.ten_nguoi_thue = ten_nguoi_thue;
    }

    public String getSo_dien_thoai() {
        return so_dien_thoai;
    }

    public void setSo_dien_thoai(String so_dien_thoai) {
        this.so_dien_thoai = so_dien_thoai;
    }

    public String getNgay_bat_dau_thue() {
        return ngay_bat_dau_thue;
    }

    public void setNgay_bat_dau_thue(String ngay_bat_dau_thue) {
        this.ngay_bat_dau_thue = ngay_bat_dau_thue;
    }

    public String getHinh_thuc_thanh_toan() {
        return hinh_thuc_thanh_toan;
    }

    public void setHinh_thuc_thanh_toan(String hinh_thuc_thanh_toan) {
        this.hinh_thuc_thanh_toan = hinh_thuc_thanh_toan;
    }
}
