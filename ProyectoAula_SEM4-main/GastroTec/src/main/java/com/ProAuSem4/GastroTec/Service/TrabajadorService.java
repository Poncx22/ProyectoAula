package com.ProAuSem4.GastroTec.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.ProAuSem4.GastroTec.Model.Trabajador;
import com.ProAuSem4.GastroTec.Repository.TrabajadorRepository;

@Service // Indica que esta clase es parte de la lógica de negocio
public class TrabajadorService {

    // Se inyecta el repositorio
    private final TrabajadorRepository trabajadorRepository;

    public TrabajadorService(TrabajadorRepository trabajadorRepository) {
        this.trabajadorRepository = trabajadorRepository;
    }
    
    // Retorna todos los trabajadores
    public List<Trabajador> getAll() {
        return trabajadorRepository.findAll();
    }

    // Busca un trabajador por su ID
    public Optional<Trabajador> getById(int id) {
        return trabajadorRepository.findById(id);
    }

    // Busca trabajadores por nombre o apellido
    public List<Trabajador> getByNombre(String nombre) {
        return trabajadorRepository.findByNombrePContainingIgnoreCaseOrApellidoPContainingIgnoreCase(nombre, nombre);
    }

    // Busca trabajadores por documento
    public List<Trabajador> getByDocumento(String documento) {
        return trabajadorRepository.findByDocumentoPContaining(documento);
    }

    // Guardar o actualizar un trabajador
    public Trabajador save(Trabajador trabajador) {
        return trabajadorRepository.save(trabajador);
    }

    // Elimina un trabajador
    public void delete(int id) {
        trabajadorRepository.deleteById(id);
    }
}