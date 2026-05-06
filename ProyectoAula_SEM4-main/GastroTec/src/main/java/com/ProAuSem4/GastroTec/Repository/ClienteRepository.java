package com.ProAuSem4.GastroTec.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ProAuSem4.GastroTec.Model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    // Buscar clientes por nombre o apellido (búsqueda parcial, ignora mayúsculas)
    // Usamos los nombres de los atributos de la clase Persona que Cliente hereda
    List<Cliente> findByNombrePContainingIgnoreCaseOrApellidoPContainingIgnoreCase(String nombre, String apellido);

    // Buscar clientes por documento (búsqueda parcial)
    List<Cliente> findByDocumentoPContaining(String documento);

    Optional<Cliente> findByIdC(int idC);
}