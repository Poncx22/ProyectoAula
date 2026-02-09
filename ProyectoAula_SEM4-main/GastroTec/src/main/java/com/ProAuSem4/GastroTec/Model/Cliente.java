package com.ProAuSem4.GastroTec.Model;

public class Cliente extends Persona {

    private int idC;
    private String contactoC;

    public Cliente() {
        super();
    }

    public Cliente(int idC, String documentoP, String nombreP, String apellidoP,  String contactoC) {
        super(documentoP, nombreP, apellidoP);
        this.idC = idC;
        this.contactoC = contactoC;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public String getContactoC() {
        return contactoC;
    }

    public void setContactoC(String contactoC) {
        this.contactoC = contactoC;
    }

}
