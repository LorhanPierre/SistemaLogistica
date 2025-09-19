package org.sistemalogistica.service;

import org.sistemalogistica.dao.ClientDAO;
import org.sistemalogistica.model.Client;
import org.sistemalogistica.view.Inputs;
import org.sistemalogistica.view.Messages;

import java.sql.SQLException;

public class ServiceClient {

    Inputs data = new Inputs();
    Messages messages = new Messages();

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
            messages.registerSuccess();
        } catch (SQLException e) {
            messages.databaseError();
        }

    }
}
