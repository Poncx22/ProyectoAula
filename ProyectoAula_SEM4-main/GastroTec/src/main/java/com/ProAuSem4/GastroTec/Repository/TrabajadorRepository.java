package com.ProAuSem4.GastroTec.Repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ProAuSem4.GastroTec.Model.Trabajador;

@Repository
public interface TrabajadorRepository extends JpaRepository<Trabajador, Integer> {

    // Buscar trabajadores por nombre o apellido (búsqueda parcial, ignora
    // mayúsculas)
    List<Trabajador> findByNombrePContainingIgnoreCaseOrApellidoPContainingIgnoreCase(String nombre, String apellido);

    // Buscar trabajadores por documento (búsqueda parcial)
    List<Trabajador> findByDocumentoPContaining(String documento);

    Optional<Trabajador> findByIdT(int idT);
}