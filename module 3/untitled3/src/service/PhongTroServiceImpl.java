package service;

import model.PhongTro;
import repository.PhongTroRepo;
import repository.PhongTroRepoImpl;

import java.util.List;

public class PhongTroServiceImpl implements PhongTroService {

    PhongTroRepo phongTroRepo =new PhongTroRepoImpl();
    @Override
    public List<PhongTro> findAll() {
        return null;
    }

    @Override
    public String addPhongTro(PhongTro phongTro) {
        List<PhongTro> productList = phongTroRepo.findAll();
        for (PhongTro phongTro1 : productList) {
            if (phongTro.getId().equals(phongTro1.getId())) {
                return "phong da co nguoi o";
            }
        }

        phongTroRepo.addPhongTro(phongTro);
        return "ok";
    }

    @Override
    public void deletePhongTro(PhongTro phongTro) {

    }

    @Override
    public List<PhongTro> findByDate(String start, String end) {
        return null;
    }
}
