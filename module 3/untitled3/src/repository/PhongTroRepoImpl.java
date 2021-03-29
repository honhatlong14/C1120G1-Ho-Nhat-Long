package repository;

import model.PhongTro;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PhongTroRepoImpl implements PhongTroRepo {
        BaseRepo baseRepo =new BaseRepo();

    @Override
    public List<PhongTro> findAll() {
        List<PhongTro> productList = new ArrayList<>();
        try {
            CallableStatement callableStatement = baseRepo.getConnection().prepareCall("call select_all_product()");

            ResultSet resultSet = callableStatement.executeQuery();

            PhongTro phongTro;
            while (resultSet.next()){
                phongTro = new PhongTro();
                phongTro.setId(resultSet.getString("id_phong_tro"));
                phongTro.setTen_nguoi_thue(resultSet.getString("ten_nguoi_thue"));
                phongTro.setSo_dien_thoai(resultSet.getString("so_dien_thoai"));
                phongTro.setNgay_bat_dau_thue(resultSet.getString("ngay_thue"));
                phongTro.setHinh_thuc_thanh_toan(resultSet.getString("hinh_thuc_thanh_toan"));

                productList.add(phongTro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productList;
    }

    @Override
    public List<PhongTro> findByDate(String start, String end) {
        List<PhongTro> phongTroList = new ArrayList<>();
        try {
            CallableStatement callableStatement = baseRepo.getConnection().prepareCall("call select_by_date(?,?)");
            callableStatement.setString(1,start);
            callableStatement.setString(2,end);

            ResultSet resultSet = callableStatement.executeQuery();

            PhongTro phongTro;
            while (resultSet.next()){
                phongTro = new PhongTro();
                phongTro.setId(resultSet.getString("id"));
                phongTro.setTen_nguoi_thue(resultSet.getString("Ten_nguoi_thue"));
                phongTro.setSo_dien_thoai(resultSet.getString("So_dien_thoai"));
                phongTro.setNgay_bat_dau_thue(resultSet.getString("Ngay_bat_dau_thue"));
                phongTro.setHinh_thuc_thanh_toan(resultSet.getString("Hinh_thuc_thanh_toan"));


                phongTroList.add(phongTro);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return phongTroList;
    }

    @Override
    public void addPhongTro(PhongTro phongTro) {
        try {
            CallableStatement callableStatement =
                    baseRepo.getConnection().prepareCall("call add_new_product(?,?,?,?)");
            callableStatement.setString(1,String.valueOf(phongTro.getId()));
            callableStatement.setString(2,String.valueOf(phongTro.getTen_nguoi_thue()));
            callableStatement.setString(3,String.valueOf(phongTro.getSo_dien_thoai()));
            callableStatement.setString(4,String.valueOf(phongTro.getNgay_bat_dau_thue()));
            callableStatement.setString(4,String.valueOf(phongTro.getHinh_thuc_thanh_toan()));
            callableStatement.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletePhongTro(PhongTro phongTro) {

    }
}
