package org.SistemaLogistica.model;

public class Client {

    private String nome;
    private String cpfCnpj;
    private String endereço;
    private String cidade;
    private String estado;

    public Client(String nome, String cpfCnpj, String endereço, String cidade, String estado) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.endereço = endereço;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
