package org.sistemalogistica.dao;

import org.sistemalogistica.connection.ConnectionDatabase;
import org.sistemalogistica.model.Driver;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DriverDAO {

    public void createDriver(Driver driver) throws SQLException {

        String query = "INSERT INTO Motorista (nome,cnh,veiculo,cidade_base) VALUES (?,?,?,?)";

        try (Connection conn = ConnectionDatabase.conectar();
             PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, driver.getName());
            stmt.setString(2, driver.getCnh());
            stmt.setString(3, driver.getVehicle());
            stmt.setString(4, driver.getBaseCity());
            stmt.executeUpdate();

        }
    }


}
