package org.sistemalogistica.model;

import org.sistemalogistica.model.enums.StatusDelivery;

import java.time.LocalDate;

public class Delivery {

    private Integer idDelivery;
    private Integer driverID;

    private LocalDate leaveDate;
    private LocalDate dateDelivery;
    private StatusDelivery status;

    public Delivery(Integer idDelivery, Integer driverID, LocalDate leaveDate, LocalDate dateDelivery, StatusDelivery status) {
        this.idDelivery = idDelivery;
        this.driverID = driverID;
        this.leaveDate = LocalDate.now();
        this.dateDelivery = dateDelivery;
        this.status = StatusDelivery.EM_ROTA;
    }

    public Delivery(LocalDate leaveDate, LocalDate dateDelivery, StatusDelivery status) {
        this.leaveDate = leaveDate;
        this.dateDelivery = dateDelivery;
        this.status = status;
    }

    public void setDriverID(Integer driverID) {
        this.driverID = driverID;
    }

    public Integer getIdDelivery() {
        return idDelivery;
    }

    public Integer getDriverID() {
        return driverID;
    }

    public LocalDate getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(LocalDate leaveDate) {
        this.leaveDate = leaveDate;
    }

    public LocalDate getDateDelivery() {
        return dateDelivery;
    }

    public void setDateDelivery(LocalDate dateDelivery) {
        this.dateDelivery = dateDelivery;
    }

    public StatusDelivery getStatus() {
        return status;
    }

    public void setStatus(StatusDelivery status) {
        this.status = status;
    }
}
