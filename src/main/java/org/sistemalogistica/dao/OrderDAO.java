package org.sistemalogistica.dao;

import org.sistemalogistica.connection.ConnectionDatabase;
import org.sistemalogistica.model.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class OrderDAO {

    public void createOrder(Order order) throws Exception{

        String query = "INSERT INTO Pedido (cliente_id,data_Pedido,volume_m3,peso_kg,status) VALUES (?,?,?,?,?)";

        try(Connection conn = ConnectionDatabase.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setClientID();
        }
    }
}
