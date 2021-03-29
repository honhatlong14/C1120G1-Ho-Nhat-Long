package model.repository.impl;
import model.bean.BenhNhan;
import model.repository.BenhNhanRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BenhNhanRepositoryImpl implements BenhNhanRepository {
    private String jdbcURL = "jdbc:mysql://localhost:3306/benh_vien";
    private String jdbcUsername = "root";
    private String jdbcPassword = "123456789";

    private static final String INSERT_CUSTOMER_SQL = "INSERT INTO customer (customer_id, customer_type_id, customer_name, " +
            "customer_birthday, customer_gender, customer_id_card, customer_phone, customer_email, customer_address) " +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String SELECT_ALL_BENHNHAN = "select * from benh_nhan";
    private static final String DELETE_BENHNHAN_SQL = "delete from benh_nhan where ma_benh_nhan = ?";
    private static final String UPDATE_BENHNHAN_SQL = "update benh_nhan set ma_benh_nhan = ?,ten_benh_nhan= ?, ngay_nhap_vien =?, " +
            "ngay_ra_vien = ?, ly_do_nhap_vien= ?;";
    private static final String SELECT_CUSTOMER = "select * from customer where customer_id = ?";
    private static final String SELECT_CUSTOMER_BY_NAME = "select * from customer where customer_name like ?";

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public List<BenhNhan> findAll() {
        List<BenhNhan> benhNhanList = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BENHNHAN);) {
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("ma_benh_nhan");
                String name = resultSet.getString("ten_benh_nhan");
                String date1 = resultSet.getString("ngay_nhap_vien");
                String date2 = resultSet.getString("ngay_ra_vien");
                String reason = resultSet.getString("ly_do_nhap_vien");
                benhNhanList.add(new BenhNhan(id, name, date1, date2, reason));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return benhNhanList;
    }
    @Override
    public void update(BenhNhan benhNhan) throws SQLException {
        try(Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(UPDATE_BENHNHAN_SQL)) {
            statement.setString(1, benhNhan.getId());
            statement.setString(2,  benhNhan.getName());
            statement.setString(3, benhNhan.getNgayNhap());
            statement.setString(4,  benhNhan.getNgayRa());
            statement.setString(5,  benhNhan.getLyDo());
            statement.executeUpdate();
        }
    }
    @Override
    public BenhNhan findById(String id) {
        return null;
    }

    @Override
    public void insert(BenhNhan benhNhan) throws SQLException {

    }

    @Override
    public void delete(String id) throws SQLException {
        try(Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(DELETE_BENHNHAN_SQL)) {
            statement.setString(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<BenhNhan> findByName(String name) {
        return null;
    }
}