package com.ProAuSem4.GastroTec.Controller;

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


    @GetMapping
    public String listarProveedores(Model model) {
        model.addAttribute("proveedores", proveedorService.getAll());
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
