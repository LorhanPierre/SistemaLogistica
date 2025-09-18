package org.sistemalogistica.dao;

import org.sistemalogistica.connection.ConnectionDatabase;
import org.sistemalogistica.model.DeliveryHistory;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeliveryHistoryDAO {

    public void RegisterEvent(DeliveryHistory deliveryHistory) throws Exception{

        String query = "INSERT INTO HistoricoEntrega (entrega_id, data_evento, descricao) VALUES (?, ?, ?)";

        try(Connection conn = ConnectionDatabase.conectar();
            PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setInt(1,deliveryHistory.getId());
            stmt.setDate(2, java.sql.Date.valueOf(deliveryHistory.getDateEvent()));
            stmt.setString(3, deliveryHistory.getDescription());
            stmt.executeUpdate();
        }
    }
}
