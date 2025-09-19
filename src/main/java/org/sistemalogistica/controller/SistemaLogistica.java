package org.sistemalogistica.controller;

import org.sistemalogistica.service.ServiceClient;
import org.sistemalogistica.service.ServiceDriver;
import org.sistemalogistica.view.Menus;
import org.sistemalogistica.view.Messages;

public class SistemaLogistica {

    Menus menu = new  Menus();
    Messages messages = new Messages();

    public void Application(){

        boolean end = false;

        while(!end){

            switch (menu.home()){

                case 1 ->{
                    switch (menu.registrationType()){
                        case 1 ->{
                            var client = new ServiceClient();
                            client.createClient();
                        }
                        case 2 ->{
                            var driver = new ServiceDriver();
                            driver.createDriver();
                        }
                    }
                }
                case 2 ->{}
                case 3 ->{}
                case 4 ->{}
                case 5 ->{}
                case 6 ->{}
                case 7 ->{}
                case 8 ->{}
                case 9 ->{}
                case 10 ->{}
                case 0 ->{
                    messages.goodByeMessage();
                    end = true;
                }

            }
        }

    }
}
