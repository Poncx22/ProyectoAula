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
        // Add more sample facturas as 
        facturas.add(new Factura(nextId++, new Date(), "Transferencia", 150.0, 15.0, 7.5, 0.0, 172.5, pedido, cliente, trabajador));
        facturas.add(new Factura(nextId++, new Date(), "Tarjeta", 200.0, 20.0, 10.0, 0.0, 230.0, pedido, cliente, trabajador));
    }

    public List<Factura> findAll() {
        return new ArrayList<>(facturas);
    }

    public Optional<Factura> findById(int id) {
        return facturas.stream().filter(f -> f.getIdF() == id).findFirst();
    }

    // Buscar facturas por método de pago (búsqueda parcial, ignora mayúsculas)
    public List<Factura> findByMetodoPago(String metodoPago) {
        String metodoLower = metodoPago.toLowerCase();
        return facturas.stream()
                .filter(f -> f.getMetodoPagoF().toLowerCase().contains(metodoLower))
                .collect(java.util.stream.Collectors.toList());
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