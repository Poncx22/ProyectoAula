package com.ProAuSem4.GastroTec.Model;

public abstract class Persona {
    
    protected String documentoP;
    protected String nombreP;
    protected String apellidoP;

    public Persona() {
    }
    
    public Persona(String documentoP, String nombreP, String apellidoP) {
        this.documentoP = documentoP;
        this.nombreP = nombreP;
        this.apellidoP = apellidoP;
    }

    public String getDocumentoP() {return documentoP;}

    public void setDocumentoP(String documentoP) {this.documentoP = documentoP;}

    public String getNombreP() {return nombreP;}

    public void setNombreP(String nombreP) {this.nombreP = nombreP;}

    public String getApellidoP() {return apellidoP;}

    public void setApellidoP(String apellidoP) {this.apellidoP = apellidoP;}

}

