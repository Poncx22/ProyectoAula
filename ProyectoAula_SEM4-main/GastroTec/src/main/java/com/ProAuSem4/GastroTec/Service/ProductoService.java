package com.ProAuSem4.GastroTec.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ProAuSem4.GastroTec.Model.Producto;
import com.ProAuSem4.GastroTec.Repository.ProductoRepository;

@Service
public class ProductoService {
    // Se inyecta el repositorio
    private final ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }
    
    // Retorna todos los producto
    public List<Producto> getAll() {
        return productoRepository.findAll();
    }

    // Busca un producto por su ID
    public Optional<Producto> getById(int id) {
        return productoRepository.findById(id);
    }

    // Busca productos por nombre
    public List<Producto> getByNombre(String nombre) {
        return productoRepository.findByNombre(nombre);
    }

    // Busca productos por código
    public List<Producto> getByCodigo(String codigo) {
        return productoRepository.findByCodigo(codigo);
    }

    // Crea un nuevo producto
    public void create(Producto producto) {
        productoRepository.save(producto);
    }

    // Elimina un producto
    public boolean delete(int id) {
        return productoRepository.deleteById(id);
    }
}