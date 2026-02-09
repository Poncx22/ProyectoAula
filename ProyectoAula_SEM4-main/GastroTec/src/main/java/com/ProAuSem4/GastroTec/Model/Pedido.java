package com.ProAuSem4.GastroTec.Model;

import java.util.Date;

public class Pedido {
    private int idP;
    private String numP;
    private Double totalP;
    private String estadoP;
    private Date fechaP;
    // Foraneas abajo
    private Cliente clienteP;
    private Trabajador trabajadorP;

    public Pedido() {
    }

    public Pedido(int idP, String numP, Double totalP, String estadoP, Date fechaP, Cliente clienteP,
            Trabajador trabajadorP) {
        this.idP = idP;
        this.numP = numP;
        this.totalP = totalP;
        this.estadoP = estadoP;
        this.fechaP = fechaP;
        this.clienteP = clienteP;
        this.trabajadorP = trabajadorP;
    }

    public int getIdP() {
        return idP;
    }
    public void setIdP(int idP) {
        this.idP = idP;
    }
    public String getNumP() {
        return numP;
    }
    public void setNumP(String numP) {
        this.numP = numP;
    }
    public Double getTotalP() {
        return totalP;
    }
    public void setTotalP(Double totalP) {
        this.totalP = totalP;
    }
    public String getEstadoP() {
        return estadoP;
    }
    public void setEstadoP(String estadoP) {
        this.estadoP = estadoP;
    }
    public Date getFechaP() {
        return fechaP;
    }
    public void setFechaP(Date fechaP) {
        this.fechaP = fechaP;
    }
    public Cliente getClienteP() {
        return clienteP;
    }
    public void setClienteP(Cliente clienteP) {
        this.clienteP = clienteP;
    }
    public Trabajador getTrabajadorP() {
        return trabajadorP;
    }
    public void setTrabajadorP(Trabajador trabajadorP) {
        this.trabajadorP = trabajadorP;
    }

}
