package com.ProAuSem4.GastroTec.Model;

public class Trabajador extends Persona {
    
    private int idT;
    private String segundoNombreT;
    private String segundoApellidoT;
    private String telefonoT;
    private String emailT;
    private String direccionT;
    private boolean activoT;
    private double salarioT;
    private String cargoT;

    public Trabajador() {
        super();
    }

    public Trabajador(int idT, String documentoP, String nombreP, String segundoNombreT, String apellidoP, String segundoApellidoT, String telefonoT, String emailT, String direccionT, boolean activoT, double salarioT, String cargoT) {
        super(documentoP, nombreP, apellidoP);

        this.idT = idT;
        this.segundoNombreT = segundoNombreT;
        this.segundoApellidoT = segundoApellidoT;
        this.telefonoT = telefonoT;
        this.emailT = emailT;
        this.direccionT = direccionT;
        this.activoT = activoT;
        this.salarioT = salarioT;
        this.cargoT = cargoT;
    }
    
    public int getIdT() {
        return idT;
    }
    
    public void setIdT(int idT) {
        this.idT = idT;
    }

    public String getSegundoNombreT() {
        return segundoNombreT;
    }

    public void setSegundoNombreT(String segundoNombreT) {
        this.segundoNombreT = segundoNombreT;
    }

    public String getSegundoApellidoT() {
        return segundoApellidoT;
    }

    public void setSegundoApellidoT(String segundoApellidoT) {
        this.segundoApellidoT = segundoApellidoT;
    }

    public String getTelefonoT() {
        return telefonoT;
    }

    public void setTelefonoT(String telefonoT) {
        this.telefonoT = telefonoT;
    }

    public String getEmailT() {
        return emailT;
    }

    public void setEmailT(String emailT) {
        this.emailT = emailT;
    }

    public String getDireccionT() {
        return direccionT;
    }

    public void setDireccionT(String direccionT) {
        this.direccionT = direccionT;
    }

    public boolean isActivoT() {
        return activoT;
    }

    public void setActivoT(boolean activoT) {
        this.activoT = activoT;
    }

    public double getSalarioT() {
        return salarioT;
    }

    public void setSalarioT(double salarioT) {
        this.salarioT = salarioT;
    }

    public String getCargoT() {
        return cargoT;
    }

    public void setCargoT(String cargoT) {
        this.cargoT = cargoT;
    }

}

