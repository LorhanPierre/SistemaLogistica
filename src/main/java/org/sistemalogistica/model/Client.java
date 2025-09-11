package org.sistemalogistica.model;

public class Client {

    private String name;
    private String cpfCnpj;
    private String adress;
    private String city;
    private String estado;

    public Client(String name, String cpfCnpj, String adress, String city, String estado) {
        this.name = name;
        this.cpfCnpj = cpfCnpj;
        this.adress = adress;
        this.city = city;
        this.estado = estado;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
