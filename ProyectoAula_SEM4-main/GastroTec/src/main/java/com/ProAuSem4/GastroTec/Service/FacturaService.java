package com.ProAuSem4.GastroTec.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ProAuSem4.GastroTec.Model.Factura;
import com.ProAuSem4.GastroTec.Repository.FacturaRepository;

@Service
public class FacturaService {
    // Se inyecta el repositorio
    private final FacturaRepository facturaRepository;

    public FacturaService(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }
    
    // Retorna todos los comprobantes (facturas)
    public List<Factura> getAll() {
        return facturaRepository.findAll();
    }

    // Busca un comprobante por su ID
    public Optional<Factura> getById(int id) {
        return facturaRepository.findById(id);
    }

    // Busca comprobantes por método de pago
    public List<Factura> getByMetodoPago(String metodoPago) {
        return facturaRepository.findByMetodoPago(metodoPago);
    }

    // Crea un nuevo comprobante
    public void create(Factura factura) {
        facturaRepository.save(factura);
    }

    // Elimina un comprobante
    public boolean delete(int id) {
        return facturaRepository.deleteById(id);
    }
}
