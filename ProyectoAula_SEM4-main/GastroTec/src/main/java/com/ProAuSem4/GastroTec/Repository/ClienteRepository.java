package com.ProAuSem4.GastroTec.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.ProAuSem4.GastroTec.Model.Cliente;

@Repository // Indica que esta clase es un "repositorio" (simula el acceso a datos)
public class ClienteRepository {

    // Lista que simula la "tabla de clientes" en memoria
    private List<Cliente> clientes = new ArrayList<>();
    private int nextId = 21; // porque ya tenemos 20 clientes de prueba

    // Constructor: al iniciar la app, agregamos datos quemados de prueba
    public ClienteRepository() {
        clientes.add(new Cliente(1, "1000123456", "María", "López", "3001112233"));
        clientes.add(new Cliente(2, "1000234567", "Carlos", "Ramírez", "3014445566"));
        clientes.add(new Cliente(3, "1000345678", "Sofía", "Castro", "3027778899"));
        clientes.add(new Cliente(4, "1000456789", "Andrés", "Díaz", "3030001122"));
        clientes.add(new Cliente(5, "1000567890", "Valeria", "Vargas", "3043334455"));
        clientes.add(new Cliente(6, "1000678901", "Javier", "Mora", "3056667788"));
        clientes.add(new Cliente(7, "1000789012", "Isabella", "Rojas", "3069990011"));
        clientes.add(new Cliente(8, "1000890123", "Ricardo", "Silva", "3072223344"));
        clientes.add(new Cliente(9, "1000901234", "Camila", "Torres", "3085556677"));
        clientes.add(new Cliente(10, "1001012345", "Alejandro", "Herrera", "3098889900"));
        clientes.add(new Cliente(11, "1001123456", "Gabriela", "Pineda", "3101112233"));
        clientes.add(new Cliente(12, "1001234567", "Felipe", "Gutiérrez", "3114445566"));
        clientes.add(new Cliente(13, "1001345678", "Paula", "Méndez", "3127778899"));
        clientes.add(new Cliente(14, "1001456789", "Daniel", "Cruz", "3130001122"));
        clientes.add(new Cliente(15, "1001567890", "Lucía", "Ortega", "3143334455"));
        clientes.add(new Cliente(16, "1001678901", "Sebastián", "Navarro", "3156667788"));
        clientes.add(new Cliente(17, "1001789012", "Elena", "Guerrero", "3169990011"));
        clientes.add(new Cliente(18, "1001890123", "Miguel", "Soto", "3172223344"));
        clientes.add(new Cliente(19, "1001901234", "Natalia", "Acosta", "3185556677"));
        clientes.add(new Cliente(20, "1002012345", "Jorge", "Montes", "3198889900"));
        clientes.add(new Cliente(21, "1002123456", "Ana", "López", "3201112233"));
    }

    // Método para obtener todos los clientes
    public List<Cliente> findAll() {
        return clientes;
    }

    // Buscar un cliente por su ID
    public Optional<Cliente> findById(int id) {
        return clientes.stream().filter(c -> c.getIdC() == id).findFirst();
    }

    // Guardar (agregar) un nuevo cliente
    public Cliente save(Cliente cliente) {
        if (cliente.getIdC() == 0) { 
            cliente.setIdC(nextId++); // asigna un ID automáticamente
        }
        clientes.removeIf(c -> c.getIdC() == cliente.getIdC()); // elimina el viejo si existe
        clientes.add(cliente); // guarda el nuevo o actualizado
        return cliente;
    }

    // Eliminar un cliente por su ID
    public boolean deleteById(int id) {
        // removeIf devuelve true si se eliminó, false si no encontró
        return clientes.removeIf(c -> c.getIdC() == id);
    }
}