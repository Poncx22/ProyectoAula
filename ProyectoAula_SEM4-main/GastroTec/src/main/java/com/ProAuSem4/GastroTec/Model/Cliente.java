package com.ProAuSem4.GastroTec.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente extends Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idC;
    
    @Column(name = "contacto")
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
