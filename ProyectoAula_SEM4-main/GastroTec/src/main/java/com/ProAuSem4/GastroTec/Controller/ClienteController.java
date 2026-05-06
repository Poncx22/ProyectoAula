package com.ProAuSem4.GastroTec.Controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

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

    // Mostrar lista de clientes con filtros opcionales
    @GetMapping
    public String listarClientes(
            @RequestParam(value = "idBuscar", required = false) Integer idBuscar,
            @RequestParam(value = "nombreBuscar", required = false) String nombreBuscar,
            @RequestParam(value = "documentoBuscar", required = false) String documentoBuscar,
            Model model) {

        List<Cliente> clientes;
        String filtroActivo = null;

        if (idBuscar != null) {
            Optional<Cliente> resultado = clienteService.getById(idBuscar);
            clientes = resultado.map(Collections::singletonList).orElse(Collections.emptyList());
            model.addAttribute("idBuscar", idBuscar);
            filtroActivo = "id";
        } else if (nombreBuscar != null && !nombreBuscar.trim().isEmpty()) {
            clientes = clienteService.getByNombre(nombreBuscar.trim());
            model.addAttribute("nombreBuscar", nombreBuscar);
            filtroActivo = "nombre";
        } else if (documentoBuscar != null && !documentoBuscar.trim().isEmpty()) {
            clientes = clienteService.getByDocumento(documentoBuscar.trim());
            model.addAttribute("documentoBuscar", documentoBuscar);
            filtroActivo = "documento";
        } else {
            clientes = clienteService.getAll();
        }

        model.addAttribute("clientes", clientes);
        model.addAttribute("filtroActivo", filtroActivo);
        model.addAttribute("totalResultados", clientes.size());
        return "clientes";
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
        clienteService.save(cliente);
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