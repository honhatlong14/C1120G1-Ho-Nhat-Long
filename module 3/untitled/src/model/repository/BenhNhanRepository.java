package model.repository;

import model.bean.BenhNhan;

import java.sql.SQLException;
import java.util.List;

public interface BenhNhanRepository {
    List<BenhNhan> findAll();
    BenhNhan findById(String id);
    void insert(BenhNhan benhNhan) throws SQLException;
    void delete(String id) throws SQLException;
    void update(BenhNhan benhNhan) throws SQLException;
    List<BenhNhan> findByName(String name);
}