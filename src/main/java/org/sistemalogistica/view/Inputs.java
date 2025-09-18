package org.sistemalogistica.view;

import java.util.Scanner;

public class Inputs {

    static Scanner input = new Scanner(System.in);

    public String inputName(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ - Digite o Nome                          ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        String name = input.nextLine();
        return name;
    }

    public String inputCnpjCpf(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ - Digite o CPF ou CNPJ                   ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        String document = input.nextLine();
        return document;
    }

    public String inputAdress(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ - Digite o Endereço                      ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        String adress = input.nextLine();
        return adress;
    }

    public String inputCity(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ - Digite a Cidade                        ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        String city = input.nextLine();
        return city;
    }

    public String inputState(){

        boolean stateValid = false;
        String state = "";

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ - Digite a sigla do Estado (ex: Sc)      ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        while (!stateValid){
            state = input.nextLine();
            if (state.length() != 2){
                System.err.println("A sigla deve ter 2 caracteres! tente novamente");
            }else{
                stateValid = true;
            }
        }
        return state;
    }

    public String inputBaseCity(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ - Digite a Cidade Base                   ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        String baseCity = input.nextLine();
        return baseCity;
    }

    public String inputCnh(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ - Digite a CNH                           ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        String cnh = input.nextLine();
        return cnh;
    }

    public String inputVehicle(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ - Digite o nome do Veiculo               ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        String vehicle = input.nextLine();
        return vehicle;
    }
}


