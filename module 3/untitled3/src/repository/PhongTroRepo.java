package repository;

import model.PhongTro;

import java.util.List;

public interface PhongTroRepo {
    List<PhongTro> findAll();
    List<PhongTro> findByDate(String start , String end);
    void addPhongTro(PhongTro phongTro);
    void deletePhongTro(PhongTro phongTro);
}
