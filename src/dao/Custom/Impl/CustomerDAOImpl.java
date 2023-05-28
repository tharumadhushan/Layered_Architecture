package dao.Custom.Impl;

import dao.Custom.CustomerDAO;
import dao.SQLUtil;
import model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException {
        ArrayList<CustomerDTO> allCustomers = new ArrayList<>();
        ResultSet rst = SQLUtil.execute("SELECT * FROM Customer");

        while (rst.next()) {
            CustomerDTO customerDTO = new CustomerDTO(rst.getString("id"), rst.getString("name"), rst.getString("address"));
            allCustomers.add(customerDTO);
        }
        return allCustomers;

    }

    @Override
    public boolean add(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        String sql ="INSERT INTO Customer (id,name, address) VALUES (?,?,?)";
        return SQLUtil.execute(sql,dto.getId(),dto.getName(),dto.getAddress());
    }

    @Override
    public boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE Customer SET name=?, address=? WHERE id=?";
        return SQLUtil.execute(sql,dto.getName(),dto.getAddress(),dto.getId());

    }

    @Override
    public boolean exist(String s) throws SQLException, ClassNotFoundException {
        String sql = "SELECT id FROM Customer WHERE id=?";
        return SQLUtil.execute(sql,s);
    }

    @Override
    public String generateNewID() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT id FROM Customer ORDER BY id DESC LIMIT 1;");
        if (rst.next()) {
            String id = rst.getString("id");
            int newCustomerId = Integer.parseInt(id.replace("C00-", "")) + 1;
            return String.format("C00-%03d", newCustomerId);
        } else {
            return "C00-001";
        }
    }

    @Override
    public boolean delete(String s) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public CustomerDTO search(String s) throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT * FROM Customer WHERE id=?",s);
        rst.next();
        return new CustomerDTO(s + "", rst.getString("name"), rst.getString("address"));
    }

    @Override
    public boolean save(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public String generateNewCode() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public String generateOID() throws SQLException, ClassNotFoundException {
        return null;
    }

}