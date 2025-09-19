package org.sistemalogistica.service;

import org.sistemalogistica.dao.DriverDAO;
import org.sistemalogistica.model.Driver;
import org.sistemalogistica.view.Inputs;
import org.sistemalogistica.view.Messages;

import java.sql.SQLException;

public class ServiceDriver {

    Inputs data = new Inputs();
    Messages messages = new Messages();

    public void createDriver(){

        String name = data.inputName();
        String document = data.inputCnh();
        String vehicle = data.inputVehicle();
        String baseCity = data.inputBaseCity();

        var driver = new Driver(name, document, vehicle, baseCity);
        var driverDAO = new DriverDAO();

        try{
            driverDAO.createDriver(driver);
            messages.registerSuccess();
        }catch(SQLException e){
            messages.databaseError();
        }
    }
}
