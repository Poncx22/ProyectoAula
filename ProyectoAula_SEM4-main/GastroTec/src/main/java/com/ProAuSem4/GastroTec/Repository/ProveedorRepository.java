package com.ProAuSem4.GastroTec.Repository;

import java.util.ArrayList;
import java.util.List;



import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.ProAuSem4.GastroTec.Model.Proveedor;

@Repository 
public class ProveedorRepository {

    private List<Proveedor> proveedores = new ArrayList<>();
    private int nextId = 11; 

    public ProveedorRepository() {
        proveedores.add(new Proveedor(1, "00031063", "Colanta", "Colanta@correo.com", "Calle 10 #5-12", "3101112233"));
        proveedores.add(new Proveedor(2, "00064752", "Diana", "Diana@correo.com", "Calle 15 #5-15", "3114445566"));
        proveedores.add(new Proveedor(3, "00054765","Zenú", "Zenú@correo.com", "Calle 13 #8-15", "3127778899"));
        proveedores.add(new Proveedor(4, "00064756","Alqueria", "Alqueria@correo.com", "Calle 30 #5-16", "3130001122"));
        proveedores.add(new Proveedor(5, "00021742","Gato Negro", "Gato Negro@correo.com", "Calle 60 #5-12", "3143334455"));
        proveedores.add(new Proveedor(6, "00012567","Viejo Roble", "Viejo Roble@correo.com", "Calle 10 #39-18", "3156667788"));
        proveedores.add(new Proveedor(7, "00024567","ColCafe", "ColCafe@correo.com", "Calle 16 #11-15", "3169990011"));
        proveedores.add(new Proveedor(8, "00026711","Sello Rojo", "Sello Rojo@correo.com", "Calle 95 #2-15", "3172223344"));
        proveedores.add(new Proveedor(9, "00021456","Refisal", "Refisal@correo.com", "Calle 10 #5-29", "3185556677"));
        proveedores.add(new Proveedor(10, "00021456" ,"Manuelita", "Manuelita@correo.com", "Calle 14 #29-95", "3198889900"));
    }

    public List<Proveedor> findAll() {
        return proveedores;
    }

    public Optional<Proveedor> findById(int id) {
        return proveedores.stream().filter(pv -> pv.getIdProv() == id).findFirst();
    }

    public Proveedor save(Proveedor proveedor) {
        if (proveedor.getIdProv() == 0) { 
            proveedor.setIdProv(nextId++);
        } 
        proveedores.removeIf(pv -> pv.getIdProv() == proveedor.getIdProv());
        proveedores.add(proveedor);
        return proveedor;
    }

   
    public boolean deleteById(int id) {
        
        return proveedores.removeIf(pv -> pv.getIdProv() == id);
    }
}

