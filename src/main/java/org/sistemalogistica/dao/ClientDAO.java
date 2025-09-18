package org.sistemalogistica.dao;

import org.sistemalogistica.connection.ConnectionDatabase;
import org.sistemalogistica.model.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClientDAO {

    public void createClient(Client client) throws SQLException{

        String query = "INSERT INTO Cliente (nome,cpf_cnpj,endereco,cidade,estado) VALUES (?,?,?,?,?)";

        try (Connection conn = ConnectionDatabase.conectar();
             PreparedStatement stmt = conn.prepareStatement(query)){

            stmt.setString(1, client.getName());
            stmt.setString(2, client.getCpfCnpj());
            stmt.setString(3, client.getAdress());
            stmt.setString(4, client.getCity());
            stmt.setString(5, client.getState());
            stmt.executeUpdate();
        }
    }


}
