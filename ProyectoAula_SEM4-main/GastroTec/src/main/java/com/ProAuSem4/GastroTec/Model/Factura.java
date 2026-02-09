package com.ProAuSem4.GastroTec.Model;

import java.util.Date;

public class Factura {
    private int idF;
    private Date fechaF;
    private String metodoPagoF;
    private double subTotalF;
    private double impuestosF;
    private double propinaF;
    private double descuentoF;
    private double totalF;
    // Foraneas abajo
    private Pedido pedidoF;
    private Cliente clienteF;
    private Trabajador trabajadorF;

    
    public Factura() {
    }

    public Factura(int idF, Date fechaF, String metodoPagoF, double subTotalF, double impuestosF, double propinaF,
    double descuentoF, double totalF, Pedido pedidoF, Cliente clienteF, Trabajador trabajadorF) {
        this.idF = idF;
        this.fechaF = fechaF;
        this.metodoPagoF = metodoPagoF;
        this.subTotalF = subTotalF;
        this.impuestosF = impuestosF;
        this.propinaF = propinaF;
        this.descuentoF = descuentoF;
        this.totalF = totalF;
        this.pedidoF = pedidoF;
        this.clienteF = clienteF;
        this.trabajadorF = trabajadorF;
    }
    
    public int getIdF() {
        return idF;
    }
    
    public void setIdF(int idF) {
        this.idF = idF;
    }
    
    public Date getFechaF() {
        return fechaF;
    }
    
    public void setFechaF(Date fechaF) {
        this.fechaF = fechaF;
    }
    
    public String getMetodoPagoF() {
        return metodoPagoF;
    }
    
    public void setMetodoPagoF(String metodoPagoF) {
        this.metodoPagoF = metodoPagoF;
    }
    
    public double getSubTotalF() {
        return subTotalF;
    }
    
    public void setSubTotalF(double subTotalF) {
        this.subTotalF = subTotalF;
    }
    
    public double getImpuestosF() {
        return impuestosF;
    }
    
    public void setImpuestosF(double impuestosF) {
        this.impuestosF = impuestosF;
    }
    
    public double getPropinaF() {
        return propinaF;
    }
    
    public void setPropinaF(double propinaF) {
        this.propinaF = propinaF;
    }
    
    public double getDescuentoF() {
        return descuentoF;
    }
    
    public void setDescuentoF(double descuentoF) {
        this.descuentoF = descuentoF;
    }
    
    public double getTotalF() {
        return totalF;
    }
    
    public void setTotalF(double totalF) {
        this.totalF = totalF;
    }
    
    public Pedido getPedidoF() {
        return pedidoF;
    }
    
    public void setPedidoF(Pedido pedidoF) {
        this.pedidoF = pedidoF;
    }
    
    public Cliente getClienteF() {
        return clienteF;
    }
    
    public void setClienteF(Cliente clienteF) {
        this.clienteF = clienteF;
    }
    
    public Trabajador getTrabajadorF() {
        return trabajadorF;
    }
    
    public void setTrabajadorF(Trabajador trabajadorF) {
        this.trabajadorF = trabajadorF;
    }
    
}
