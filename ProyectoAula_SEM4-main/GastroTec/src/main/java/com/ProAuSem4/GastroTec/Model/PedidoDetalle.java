package com.ProAuSem4.GastroTec.Model;

public class PedidoDetalle {

    private Pedido pedidoPD;
    private Cliente clientePD;
    private Trabajador trabajadorPD;
    private Producto productoPD;
    // Foraneas arriba (esta es una tabla intermedia)
    private Double precioUnitarioPD;
    private int cantidadPD;
    
    public PedidoDetalle() {
    }

    public PedidoDetalle(Pedido pedidoPD, Cliente clientePD, Trabajador trabajadorPD, Producto productoPD,
            Double precioUnitarioPD, int cantidadPD) {
        this.pedidoPD = pedidoPD;
        this.clientePD = clientePD;
        this.trabajadorPD = trabajadorPD;
        this.productoPD = productoPD;
        this.precioUnitarioPD = precioUnitarioPD;
        this.cantidadPD = cantidadPD;
    }

    public Pedido getPedidoPD() {
        return pedidoPD;
    }
    public void setPedidoPD(Pedido pedidoPD) {
        this.pedidoPD = pedidoPD;
    }
    public Cliente getClientePD() {
        return clientePD;
    }
    public void setClientePD(Cliente clientePD) {
        this.clientePD = clientePD;
    }
    public Trabajador getTrabajadorPD() {
        return trabajadorPD;
    }
    public void setTrabajadorPD(Trabajador trabajadorPD) {
        this.trabajadorPD = trabajadorPD;
    }
    public Producto getProductoPD() {
        return productoPD;
    }
    public void setProductoPD(Producto productoPD) {
        this.productoPD = productoPD;
    }
    public Double getPrecioUnitarioPD() {
        return precioUnitarioPD;
    }
    public void setPrecioUnitarioPD(Double precioUnitarioPD) {
        this.precioUnitarioPD = precioUnitarioPD;
    }
    public int getCantidadPD() {
        return cantidadPD;
    }
    public void setCantidadPD(int cantidadPD) {
        this.cantidadPD = cantidadPD;
    }

}
