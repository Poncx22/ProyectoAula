package com.ProAuSem4.GastroTec.Model;

public class Proveedor {
    private int idProv;
    private String codigoProv;
    private String nombreProv;
    private String emailProv;
    private String direccionProv;
    private String telefonoProv;

    
    public Proveedor() {
    }
    
    public Proveedor(int idProv, String codigoProv, String nombreProv, String emailProv, String direccionProv, String telefonoProv) {
        
        this.idProv = idProv;
        this.codigoProv = codigoProv;
        this.nombreProv = nombreProv;
        this.emailProv = emailProv;
        this.direccionProv = direccionProv;
        this.telefonoProv = telefonoProv;
    }


    public int getIdProv() {
        return idProv;
    }
    
    public void setIdProv(int idProv) {
        this.idProv = idProv;
    }

    public String getCodigoProv() {
        return codigoProv;
    }

    public void setCodigoProv(String codigoProv) {
        this.codigoProv = codigoProv;
    }
    
    public String getNombreProv() {
        return nombreProv;
    }
    
    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }
    
    public String getEmailProv() {
        return emailProv;
    }
    
    public void setEmailProv(String emailProv) {
        this.emailProv = emailProv;
    }
    
    public String getDireccionProv() {
        return direccionProv;
    }
    
    public void setDireccionProv(String direccionProv) {
        this.direccionProv = direccionProv;
    }
    
    public String getTelefonoProv() {
        return telefonoProv;
    }
    
    public void setTelefonoProv(String telefonoProv) {
        this.telefonoProv = telefonoProv;
    }

    
    
}
