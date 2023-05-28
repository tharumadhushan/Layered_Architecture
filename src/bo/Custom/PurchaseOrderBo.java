package bo.Custom;

import dao.Custom.CustomerDAO;
import dao.Custom.Impl.CustomerDAOImpl;
import dao.Custom.Impl.ItemDAOImpl;
import dao.Custom.Impl.OrderDAOImpl;
import dao.Custom.ItemDAO;
import dao.Custom.OrderDAO;
import model.CustomerDTO;
import model.ItemDTO;
import model.OrderDetailDTO;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface PurchaseOrderBo {
        public CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException ;

        public ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException ;

        public boolean existItem(String code) throws SQLException, ClassNotFoundException ;


        public boolean existCustomer(String id) throws SQLException, ClassNotFoundException ;

        public String generateOrderID() throws SQLException, ClassNotFoundException ;


        public ArrayList<CustomerDTO> getAllCustomers() throws SQLException, ClassNotFoundException ;

        public ArrayList<ItemDTO> getAllItems() throws SQLException, ClassNotFoundException ;

    public boolean purchaseOrder(String orderId, LocalDate orderDate, String customerId, List<OrderDetailDTO> orderDetails);

    }