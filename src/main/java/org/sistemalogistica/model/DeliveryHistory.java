package org.sistemalogistica.model;

import java.time.LocalDate;

public class DeliveryHistory {

    private Integer id;
    private Integer deliveryId;

    private LocalDate dateEvent;
    private String description;

    public DeliveryHistory(Integer id, Integer deliveryId, LocalDate dateEvent, String description) {
        this.id = id;
        this.deliveryId = deliveryId;
        this.dateEvent = dateEvent;
        this.description = description;
    }

    public DeliveryHistory(LocalDate dateEvent, String description) {
        this.dateEvent = dateEvent;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public LocalDate getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(LocalDate dateEvent) {
        this.dateEvent = dateEvent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
