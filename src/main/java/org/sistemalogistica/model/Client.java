package org.sistemalogistica.model;

public class Client {

    private Integer id;

    private String name;
    private String cpfCnpj;
    private String adress;
    private String city;
    private String state;

    public Client(Integer id, String name, String cpfCnpj, String adress, String city, String state) {
        this.id = id;
        this.name = name;
        this.cpfCnpj = cpfCnpj;
        this.adress = adress;
        this.city = city;
        this.state = state;
    }

    public Client(String name, String cpfCnpj, String adress, String city, String state) {
        this.id = id;
        this.name = name;
        this.cpfCnpj = cpfCnpj;
        this.adress = adress;
        this.city = city;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
