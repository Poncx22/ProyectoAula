package com.ProAuSem4.GastroTec.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.ProAuSem4.GastroTec.Model.Cliente;
import com.ProAuSem4.GastroTec.Model.Factura;
import com.ProAuSem4.GastroTec.Model.Pedido;
import com.ProAuSem4.GastroTec.Model.Trabajador;

@Repository
public class FacturaRepository {
    private final List<Factura> facturas = new ArrayList<>();
    private int nextId = 1;

    public FacturaRepository() {
        // Sample data - you may need to adjust based on your needs
        // Assuming some sample Pedido, Cliente, Trabajador exist
        // For simplicity, creating dummy objects
        Cliente cliente = new Cliente(); // You need to set properties
        Trabajador trabajador = new Trabajador();
        Pedido pedido = new Pedido();

        facturas.add(new Factura(nextId++, new Date(), "Efectivo", 100.0, 10.0, 5.0, 0.0, 115.0, pedido, cliente, trabajador));
        // Add more sample facturas as needed
    }

    public List<Factura> findAll() {
        return new ArrayList<>(facturas);
    }

    public Optional<Factura> findById(int id) {
        return facturas.stream().filter(f -> f.getIdF() == id).findFirst();
    }

    public void save(Factura factura) {
        if (factura.getIdF() == 0) {
            factura.setIdF(nextId++);
        }
        facturas.add(factura);
    }

    public boolean deleteById(int id) {
        return facturas.removeIf(f -> f.getIdF() == id);
    }
}