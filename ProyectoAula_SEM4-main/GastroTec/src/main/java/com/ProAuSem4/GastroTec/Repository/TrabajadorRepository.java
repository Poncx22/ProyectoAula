package com.ProAuSem4.GastroTec.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import com.ProAuSem4.GastroTec.Model.Trabajador;

@Repository // Marca esta clase como repositorio (acceso a datos simulado en memoria)
public class TrabajadorRepository {

    // Lista que simula la "tabla de trabajadores"
    private List<Trabajador> trabajadores = new ArrayList<>();
    private int nextId = 6; // simulación de autoincremento

    // Constructor: datos de prueba quemados
    public TrabajadorRepository() {
        trabajadores.add(new Trabajador(1, "123", "Camilo", "Andrés", "Vega", "Torres", "3101234567", "kmilo@correo.com", "Calle 10 #5-15", true, 50000, "Lider - Backend"));
        trabajadores.add(new Trabajador(2, "456", "Jesus", "Alberto", "Villaba", "Manjarres", "3107654321", "jesus@correo.com", "Calle 20 #6-25", false, 45000, "Frontend"));
        trabajadores.add(new Trabajador(3, "789", "Izaid", "Daniel", "Castro", "Rodriguez", "3109876543", "izaid@correo.com", "Calle 30 #7-35", true, 55000, "Documentador"));
        trabajadores.add(new Trabajador(4, "321", "Santiago", "", "Varela", "Mejia", "3101122334", "santiago@correo.com", "Calle 40 #8-45", true, 60000, "Tester"));
        trabajadores.add(new Trabajador(5, "654", "Joseph", "Andres", "Ponce", "Navas", "3104433221", "joseph@correo.com", "Calle 50 #9-55", false, 10000, "Documentador"));
    }

    // Retorna todos los trabajadores
    public List<Trabajador> findAll() {
        return trabajadores;
    }

    // Buscar un trabajador por ID
    public Optional<Trabajador> findById(int id) {
        return trabajadores.stream().filter(t -> t.getIdT() == id).findFirst();
    }

    // Buscar trabajadores por nombre o apellido (búsqueda parcial, ignora mayúsculas)
    public List<Trabajador> findByNombre(String nombre) {
        String nombreLower = nombre.toLowerCase();
        return trabajadores.stream()
                .filter(t -> t.getNombreP().toLowerCase().contains(nombreLower)
                        || t.getApellidoP().toLowerCase().contains(nombreLower))
                .collect(java.util.stream.Collectors.toList());
    }

    // Buscar trabajadores por documento (búsqueda parcial)
    public List<Trabajador> findByDocumento(String documento) {
        return trabajadores.stream()
                .filter(t -> t.getDocumentoP().contains(documento))
                .collect(java.util.stream.Collectors.toList());
    }

    // Guardar (agregar) un nuevo trabajador
    public Trabajador save(Trabajador trabajador) {
        if (trabajador.getIdT() == 0) { 
            trabajador.setIdT(nextId++);
        } 
        trabajadores.removeIf(t -> t.getIdT() == trabajador.getIdT());
        trabajadores.add(trabajador);
        return trabajador;
    }

    // Eliminar un trabajador por ID
    public boolean deleteById(int id) {
        // removeIf devuelve true si se eliminó, false si no encontró
        return trabajadores.removeIf(t -> t.getIdT() == id);
    }
}