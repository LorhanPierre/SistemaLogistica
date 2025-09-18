package org.sistemalogistica.dao;

import org.sistemalogistica.connection.ConnectionDatabase;
import org.sistemalogistica.model.Delivery;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeliveryDAO {

    public void createDelivery(Delivery delivery) throws Exception{

        String query = "INSERT INTO Entrega (motorista_id,data_saida,data_entrega,status) VALUES (?,?,?,?)";

        try(Connection conn = ConnectionDatabase.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setInt(1,delivery.getDriverID());
            stmt.setDate(2, java.sql.Date.valueOf(delivery.getLeaveDate()));
            stmt.setDate(3, java.sql.Date.valueOf(delivery.getDateDelivery()));
            stmt.setString(4, delivery.getStatus().toString());
            stmt.executeUpdate();

        }
    }

    public void updateStatusDelivery() throws Exception{

    }
}
