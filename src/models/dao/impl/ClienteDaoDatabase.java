package models.dao.impl;

import java.util.ArrayList;
import java.util.List;
import models.dao.ClienteDao;
import models.entities.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.CallableStatement;
import java.sql.SQLException;
import utils.DBConn;

public class ClienteDaoDatabase implements ClienteDao {

    private Connection connection;
    private ResultSet resultSet;
    private CallableStatement callableStatement;

    @Override
    public void create(Cliente entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente find(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Cliente> findAll() {
        List<Cliente> clientes = new ArrayList<>();
        Cliente cliente;

        try {
            connection = DBConn.getConnection();
            callableStatement = connection.prepareCall("{CALL sp_findAll_Cliente()}");
            resultSet = callableStatement.executeQuery();

            while (resultSet.next()) {
                cliente = new Cliente();
                cliente.setCliente_id(resultSet.getInt(1));
                cliente.setCliente_nombres(resultSet.getString(2));
                cliente.setCliente_apellidos(resultSet.getString(3));
                cliente.setMembresia_nombre(resultSet.getString(4));
                cliente.setCliente_edad(resultSet.getInt(5));
                cliente.setCliente_telefono(resultSet.getString(6));
                clientes.add(cliente);
            }

            resultSet.close();
            callableStatement.close();
            connection.close();
        } catch (SQLException ex) {
            try {
                resultSet.close();
                callableStatement.close();
                connection.close();
            } catch (SQLException exp) {
                System.out.println(exp.getMessage());
            }
        }

        return clientes;
    }

    @Override
    public void update(Cliente entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
