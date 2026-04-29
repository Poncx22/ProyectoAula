package com.ProAuSem4.GastroTec.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.ProAuSem4.GastroTec.Model.Proveedor;
import com.ProAuSem4.GastroTec.Repository.ProveedorRepository;

@Service 
public class ProveedorService {

    
    private final ProveedorRepository proveedorRepository;

    public ProveedorService(ProveedorRepository proveedorRepository) {
        this.proveedorRepository = proveedorRepository;
    }
    
    
    public List<Proveedor> getAll() {
        return proveedorRepository.findAll();
    }


    public Optional<Proveedor> getById(int id) {
        return proveedorRepository.findById(id);
    }

    // Busca proveedores por nombre
    public List<Proveedor> getByNombre(String nombre) {
        return proveedorRepository.findByNombre(nombre);
    }

    // Busca proveedores por código
    public List<Proveedor> getByCodigo(String codigo) {
        return proveedorRepository.findByCodigo(codigo);
    }


    public void create(Proveedor proveedor) {
        proveedorRepository.save(proveedor);
    }


    public boolean delete(int id) {
        return proveedorRepository.deleteById(id);
    }
}