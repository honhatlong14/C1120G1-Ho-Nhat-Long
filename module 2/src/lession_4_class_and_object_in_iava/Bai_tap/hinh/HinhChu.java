package lession_4_class_and_object_in_iava.Bai_tap.hinh;

public class HinhChu {
    private int dai = 10;
    private int rong = 20;

    HinhChu(){

    }
    //muon truyen vao doi so moi thi phai goi constructor
    HinhChu(int dai,int rong){
        this.dai = dai;
        this.rong = rong;

    }
    public int getDai() {
        return dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    public int getRong() {
        return rong;
    }

    public void setRong(int rong) {
        this.rong = rong;
    }
    public int getArea(){
        return (this.dai * this.rong);
    }
}
