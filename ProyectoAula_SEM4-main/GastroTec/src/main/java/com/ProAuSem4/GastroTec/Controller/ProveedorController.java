package com.ProAuSem4.GastroTec.Controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ProAuSem4.GastroTec.Model.Proveedor;
import com.ProAuSem4.GastroTec.Service.ProveedorService;

@Controller
@RequestMapping("/proveedores")
public class ProveedorController {

    @Autowired
    private final ProveedorService proveedorService;

    public ProveedorController(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

    // Mostrar lista de proveedores con filtros opcionales
    @GetMapping
    public String listarProveedores(
            @RequestParam(value = "idBuscar", required = false) Integer idBuscar,
            @RequestParam(value = "nombreBuscar", required = false) String nombreBuscar,
            @RequestParam(value = "codigoBuscar", required = false) String codigoBuscar,
            Model model) {

        List<Proveedor> proveedores;
        String filtroActivo = null;

        if (idBuscar != null) {
            Optional<Proveedor> resultado = proveedorService.getById(idBuscar);
            proveedores = resultado.map(Collections::singletonList).orElse(Collections.emptyList());
            model.addAttribute("idBuscar", idBuscar);
            filtroActivo = "id";
        } else if (nombreBuscar != null && !nombreBuscar.trim().isEmpty()) {
            proveedores = proveedorService.getByNombre(nombreBuscar.trim());
            model.addAttribute("nombreBuscar", nombreBuscar);
            filtroActivo = "nombre";
        } else if (codigoBuscar != null && !codigoBuscar.trim().isEmpty()) {
            proveedores = proveedorService.getByCodigo(codigoBuscar.trim());
            model.addAttribute("codigoBuscar", codigoBuscar);
            filtroActivo = "codigo";
        } else {
            proveedores = proveedorService.getAll();
        }

        model.addAttribute("proveedores", proveedores);
        model.addAttribute("filtroActivo", filtroActivo);
        model.addAttribute("totalResultados", proveedores.size());
        return "proveedores"; 
    }


    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("proveedor", new Proveedor());
        return "formProveedor";
    }

 
    @PostMapping
    public String guardarProveedor(@ModelAttribute Proveedor proveedor) {
        proveedorService.create(proveedor);
        return "redirect:/proveedores";
    }


    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable int id, Model model) {
        Proveedor proveedor = proveedorService.getById(id).orElse(null);
        if (proveedor == null) {
            return "redirect:/proveedores";
        }
        model.addAttribute("proveedor", proveedor);
        return "formProveedor"; 
    }


    @GetMapping("/eliminar/{id}")
    public String eliminarProveedor(@PathVariable int id) {
        proveedorService.delete(id);
        return "redirect:/proveedores";
    }
}
