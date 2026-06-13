package com.ProAuSem4.GastroTec.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trabajadores")
public class Trabajador extends Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trabajador")

    private int idT;
    @Column(name = "segundo_nombre")
    private String segundoNombreT;

    @Column(name = "segundo_apellido")
    private String segundoApellidoT;

    @Column(name = "telefono")
    private String telefonoT;

    @Column(name = "email")
    private String emailT;

    @Column(name = "direccion")
    private String direccionT;

    @Column(name = "activo")
    private boolean activoT;

    @Column(name = "salario")
    private double salarioT;

    @Column(name = "cargo")
    private String cargoT;

    public Trabajador() {
        super();
    }

    public Trabajador(int idT, String documentoP, String nombreP, String segundoNombreT, String apellidoP,
            String segundoApellidoT, String telefonoT, String emailT, String direccionT, boolean activoT,
            double salarioT, String cargoT) {
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
