package dao.Custom.Impl;

import dao.Custom.OrderDAO;
import dao.SQLUtil;
import model.OrderDTO;

import java.sql.*;
import java.util.ArrayList;

public class OrderDAOImpl implements OrderDAO {
    @Override
    public ArrayList<OrderDTO> getAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean add(OrderDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean update(OrderDTO dto) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public boolean exist(String s) throws SQLException, ClassNotFoundException {
        String sql = SQLUtil.execute("SELECT oid FROM `Orders` WHERE oid=?");
        return SQLUtil.execute(sql,s);

    }

    @Override
    public String generateNewID() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean delete(String s) throws SQLException, ClassNotFoundException {
        return false;
    }

    @Override
    public OrderDTO search(String s) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public boolean save(OrderDTO dto) throws SQLException, ClassNotFoundException {
        String sql = SQLUtil.execute("INSERT INTO `Orders` (oid, date, customerID) VALUES (?,?,?)");
        return SQLUtil.execute(sql,dto.getOrderId(),dto.getOrderDate(),dto.getCustomerId());

    }

    @Override
    public String generateNewCode() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public String generateOID() throws SQLException, ClassNotFoundException {
        ResultSet rst = SQLUtil.execute("SELECT oid FROM `Orders` ORDER BY oid DESC LIMIT 1;");
        return rst.next() ? String.format("OID-%03d", (Integer.parseInt(rst.getString("oid").replace("OID-", "")) + 1)) : "OID-001";
    }

}
