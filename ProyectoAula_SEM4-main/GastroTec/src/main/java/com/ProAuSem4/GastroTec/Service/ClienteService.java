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

    // Crear un nuevo cliente
    public Cliente create(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Eliminar un cliente
    public boolean delete(int id) {
        return clienteRepository.deleteById(id);
    }
}
