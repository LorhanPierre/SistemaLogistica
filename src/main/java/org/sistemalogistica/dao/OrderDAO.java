package org.sistemalogistica.dao;

import org.sistemalogistica.connection.ConnectionDatabase;
import org.sistemalogistica.model.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderDAO {

    public void createOrder(Order order) throws SQLException {

        String query = "INSERT INTO Pedido (cliente_id,data_Pedido,volume_m3,peso_kg,status) VALUES (?,?,?,?,?)";

        try(Connection conn = ConnectionDatabase.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setInt(1,order.getClientID());
            stmt.setDate(2, java.sql.Date.valueOf(order.getDateOrder()));
            stmt.setDouble(3, order.getVolume());
            stmt.setDouble(4, order.getWeight());
            stmt.setString(5, order.getStatus().toString());
            stmt.executeUpdate();
        }
    }

}
