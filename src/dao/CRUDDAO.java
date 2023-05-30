package dao;

import model.CustomerDTO;
import model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CRUDDAO <T> extends SuperDAO{

    public ArrayList<T> getAll() throws SQLException, ClassNotFoundException;

    public boolean add(T dto) throws SQLException, ClassNotFoundException;

    public boolean update(T dto) throws SQLException, ClassNotFoundException;

    public boolean exist(String id) throws SQLException, ClassNotFoundException ;

    public String generateNewID() throws SQLException, ClassNotFoundException ;

    public boolean delete(String id) throws SQLException, ClassNotFoundException;

    public T search(String id) throws SQLException, ClassNotFoundException ;

    public boolean save(T dto) throws SQLException, ClassNotFoundException;

    public String generateNewCode() throws SQLException, ClassNotFoundException;

    String generateOID() throws SQLException, ClassNotFoundException ;


}
