package bo.custom;

import bo.SuperBO;
import model.CustomerDTO;
import model.ItemDTO;
import model.OrderDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface PurchaseOrderBO extends SuperBO {
    public CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException;

    public ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException;

    public boolean existItem(String code) throws SQLException, ClassNotFoundException;

    public boolean existCustomer(String id) throws SQLException, ClassNotFoundException;

    public String generateOrderID() throws SQLException, ClassNotFoundException;

    public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException;

    public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException;

    public boolean purchaseOrder(OrderDTO dto);

    public ItemDTO findItem(String code);


}

