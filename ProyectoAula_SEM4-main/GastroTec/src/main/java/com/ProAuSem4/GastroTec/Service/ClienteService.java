package com.ProAuSem4.GastroTec.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.ProAuSem4.GastroTec.Model.Cliente;
import com.ProAuSem4.GastroTec.Repository.ClienteRepository;

@Service // Marca esta clase como "servicio" de la lógica de negocio
public class ClienteService {

    // Se inyecta el repositorio
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    // Obtener todos los clientes
    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }

    // Obtener un cliente por su ID
    public Optional<Cliente> getById(int id) {
        return clienteRepository.findById(id);
    }

    // Buscar clientes por nombre o apellido
    public List<Cliente> getByNombre(String nombre) {
        return clienteRepository.findByNombrePContainingIgnoreCaseOrApellidoPContainingIgnoreCase(nombre, nombre);
    }

    // Buscar clientes por documento
    public List<Cliente> getByDocumento(String documento) {
        return clienteRepository.findByDocumentoPContaining(documento);
    }

    // Guardar o actualizar un cliente
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Eliminar un cliente
    public void delete(int id) {
        clienteRepository.deleteById(id);
    }
}
