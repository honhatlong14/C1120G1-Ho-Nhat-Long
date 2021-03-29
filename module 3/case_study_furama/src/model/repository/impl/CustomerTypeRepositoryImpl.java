package model.repository.impl;

import model.bean.customer.CustomerType;
import model.repository.CustomerTypeRepository;
import model.repository.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerTypeRepositoryImpl implements CustomerTypeRepository {

    public static final String IND_CUSTOMER_TYPE_BY_ID = "select * from customer_type where customer_type_id =? ";

    @Override
    public CustomerType findById(int id) {
        Connection connection = DBConnection.open();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        CustomerType customerType = null;

        if (connection !=null){
            try {
                statement = connection.prepareStatement(IND_CUSTOMER_TYPE_BY_ID);
                statement.setInt(1,id);
                resultSet = statement.executeQuery();
                while (resultSet.next()){
                    int customerTypeId = resultSet.getInt(1);
                    String customerTypeName = resultSet.getString(2);
                    customerType = new CustomerType(customerTypeId, customerTypeName);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                try {
                    if (resultSet !=null){
                        resultSet.close();
                    }
                    if (statement !=null){
                        statement.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return customerType;
    }
}
