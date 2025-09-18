package org.sistemalogistica.service;

import org.sistemalogistica.dao.ClientDAO;
import org.sistemalogistica.model.Client;
import org.sistemalogistica.view.Inputs;

import java.sql.SQLException;

public class ServiceClient {

    Inputs data = new Inputs();

    public void createClient(){

        String name = data.inputName();
        String document = data.inputCnpjCpf();
        String adress = data.inputAdress();
        String city = data.inputCity();
        String state = data.inputState();

        var client = new Client(name, document, adress, city, state);
        var clientDAO = new ClientDAO();

        try {
            clientDAO.createClient(client);
        } catch (SQLException e) {
            System.err.println(error.getMessage());
        }

    }
}
