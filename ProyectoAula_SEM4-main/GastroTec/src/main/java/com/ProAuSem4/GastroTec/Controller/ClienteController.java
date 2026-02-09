package com.ProAuSem4.GastroTec.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ProAuSem4.GastroTec.Model.Cliente;
import com.ProAuSem4.GastroTec.Service.ClienteService;

@Controller 
@RequestMapping("/clientes") // Ruta base
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    // Mostrar lista de clientes en una página HTML
    @GetMapping
    public String listarClientes(Model model) {
        model.addAttribute("clientes", clienteService.getAll()); // Pasamos lista a la vista
        return "clientes"; // Renderiza clientes.html
    }

    // Mostrar formulario para crear un nuevo cliente
    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "formCliente"; // formulario HTML
    }

    // Procesar formulario de creación
    @PostMapping
    public String guardarCliente(@ModelAttribute Cliente cliente) {
        clienteService.create(cliente);
        return "redirect:/clientes"; // Redirige a la lista
    }

    // Mostrar formulario para editar un cliente existente
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable int id, Model model) {
        Cliente cliente = clienteService.getById(id).orElse(null);
        if (cliente == null) {
            return "redirect:/clientes";
        }
        model.addAttribute("cliente", cliente);
        return "formCliente"; // usa el mismo formulario
    }

    // Eliminar cliente
    @GetMapping("/eliminar/{id}")
    public String eliminarCliente(@PathVariable int id) {
        clienteService.delete(id);
        return "redirect:/clientes";
    }
}