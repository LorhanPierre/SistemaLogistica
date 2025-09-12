package org.sistemalogistica.model;

import java.time.LocalDate;

public class Order {

    private Long id;

    private Client clientID;
    private LocalDate dateOrder;
    private double  volume;
    private double weight;
    private StatusOrder status;

    public Order(Long id, Client clientID, LocalDate dateOrder, double weight, StatusOrder status) {

        this.id = id;
        this.clientID = clientID;
        this.dateOrder = LocalDate.now();
        this.weight = weight;
        this.status = StatusOrder.PENDENTE;

    }

    public Long getId() {
        return id;
    }

    public Client getClientID() {
        return clientID;
    }

    public void setClientID(Client clientID) {
        this.clientID = clientID;
    }

    public LocalDate getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(LocalDate dateOrder) {
        this.dateOrder = dateOrder;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public StatusOrder getStatus() {
        return status;
    }

    public void setStatus(StatusOrder status) {
        this.status = status;
    }
}
