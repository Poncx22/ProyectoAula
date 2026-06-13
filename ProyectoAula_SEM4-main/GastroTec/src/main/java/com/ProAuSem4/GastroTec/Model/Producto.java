package com.ProAuSem4.GastroTec.Model;

public class Producto {
    private int idProd;
    private String codigoProd;
    private String nombreProd;
    private double precioProd;
    private String categoriaProd;
    private String imagenUrl;

    public Producto() {
    }

    public Producto(int idProd, String codigoProd, String nombreProd, double precioProd, String categoriaProd,
            String imagenUrl) {
        this.idProd = idProd;
        this.codigoProd = codigoProd;
        this.nombreProd = nombreProd;
        this.precioProd = precioProd;
        this.categoriaProd = categoriaProd;
        this.imagenUrl = imagenUrl;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public int getIdProd() {
        return idProd;
    }

    public void setIdProd(int idProd) {
        this.idProd = idProd;
    }

    public String getCodigoProd() {
        return codigoProd;
    }

    public void setCodigoProd(String codigoProd) {
        this.codigoProd = codigoProd;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public double getPrecioProd() {
        return precioProd;
    }

    public void setPrecioProd(double precioProd) {
        this.precioProd = precioProd;
    }

    public String getCategoriaProd() {
        return categoriaProd;
    }

    public void setCategoriaProd(String categoriaProd) {
        this.categoriaProd = categoriaProd;
    }
}