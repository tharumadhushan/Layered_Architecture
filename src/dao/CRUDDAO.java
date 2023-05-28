package dao;

import model.CustomerDTO;
import model.ItemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CRUDDAO <T,ID> extends SuperDAO{

    public ArrayList<T> getAll() throws SQLException, ClassNotFoundException;

    public boolean add(T dto) throws SQLException, ClassNotFoundException;

    public boolean update(T dto) throws SQLException, ClassNotFoundException;

    public boolean exist(ID id) throws SQLException, ClassNotFoundException ;

    public String generateNewID() throws SQLException, ClassNotFoundException ;

    public boolean delete(ID id) throws SQLException, ClassNotFoundException;

    public T search(ID id) throws SQLException, ClassNotFoundException ;

    public boolean save(T dto) throws SQLException, ClassNotFoundException;

    public String generateNewCode() throws SQLException, ClassNotFoundException;

    String generateOID() throws SQLException, ClassNotFoundException ;


}
