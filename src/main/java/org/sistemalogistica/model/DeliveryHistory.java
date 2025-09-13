package org.sistemalogistica.model;

public class DeliveryHistory {

    private Integer id;
    private Integer deliveryId;

    private String dateEvent;
    private String description;

    public DeliveryHistory(Integer id, Integer deliveryId, String dateEvent, String description) {
        this.id = id;
        this.deliveryId = deliveryId;
        this.dateEvent = dateEvent;
        this.description = description;
    }

    public DeliveryHistory(String dateEvent, String description) {
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

    public String getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(String dateEvent) {
        this.dateEvent = dateEvent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
