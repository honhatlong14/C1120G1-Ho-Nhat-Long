package service;

import model.PhongTro;

import java.util.List;

public interface PhongTroService {
    List<PhongTro> findAll();
    String addPhongTro(PhongTro phongTro);
    void deletePhongTro(PhongTro phongTro);
    List<PhongTro> findByDate(String start , String end);
}
