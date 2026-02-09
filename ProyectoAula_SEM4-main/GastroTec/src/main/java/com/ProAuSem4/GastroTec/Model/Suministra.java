package com.ProAuSem4.GastroTec.Model;

import java.util.Date;

public class Suministra {

    private Proveedor proveedorS;
    private Producto productoS;
    // Foraneas arriba (esta es una tabla intermedia)
    private Date fechaDeCompraS;
    private Date fechaDeVencimientoS;
    private double precioDeCompraS;
    private String unidadDeMedidaS;
    private int cantidadS;
    
    public Suministra() {
    }

    public Suministra(Proveedor proveedorS, Producto productoS, Date fechaDeCompraS, Date fechaDeVencimientoS,
            double precioDeCompraS, String unidadDeMedidaS, int cantidadS) {
        this.proveedorS = proveedorS;
        this.productoS = productoS;
        this.fechaDeCompraS = fechaDeCompraS;
        this.fechaDeVencimientoS = fechaDeVencimientoS;
        this.precioDeCompraS = precioDeCompraS;
        this.unidadDeMedidaS = unidadDeMedidaS;
        this.cantidadS = cantidadS;
    }

    public Proveedor getProveedorS() {
        return proveedorS;
    }
    public void setProveedorS(Proveedor proveedorS) {
        this.proveedorS = proveedorS;
    }
    public Producto getProductoS() {
        return productoS;
    }
    public void setProductoS(Producto productoS) {
        this.productoS = productoS;
    }
    public Date getFechaDeCompraS() {
        return fechaDeCompraS;
    }
    public void setFechaDeCompraS(Date fechaDeCompraS) {
        this.fechaDeCompraS = fechaDeCompraS;
    }
    public Date getFechaDeVencimientoS() {
        return fechaDeVencimientoS;
    }
    public void setFechaDeVencimientoS(Date fechaDeVencimientoS) {
        this.fechaDeVencimientoS = fechaDeVencimientoS;
    }
    public double getPrecioDeCompraS() {
        return precioDeCompraS;
    }
    public void setPrecioDeCompraS(double precioDeCompraS) {
        this.precioDeCompraS = precioDeCompraS;
    }
    public String getUnidadDeMedidaS() {
        return unidadDeMedidaS;
    }
    public void setUnidadDeMedidaS(String unidadDeMedidaS) {
        this.unidadDeMedidaS = unidadDeMedidaS;
    }
    public int getCantidadS() {
        return cantidadS;
    }
    public void setCantidadS(int cantidadS) {
        this.cantidadS = cantidadS;
    }
}
