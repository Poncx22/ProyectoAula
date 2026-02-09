package com.ProAuSem4.GastroTec.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ProAuSem4.GastroTec.Model.Producto;
import com.ProAuSem4.GastroTec.Service.ProductoService;


@Controller
@RequestMapping("/productos")

public class ProductoController {
    
    @Autowired
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    // Mostrar lista de Productos en una página HTML
    @GetMapping
    public String listarProductos(Model model) {
        model.addAttribute("productos", productoService.getAll());
        return "productos"; // Renderiza trabajadores.html
    }

    // Formulario nuevo producto
    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("producto", new Producto());
        return "formProducto";
    }

    // Guardar Producto
    @PostMapping
    public String guardarProducto(@ModelAttribute Producto producto) {
        productoService.create(producto);
        return "redirect:/productos";
    }

    // Formulario editar Producto CORREGIR
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable int id, Model model) {
        Producto producto = productoService.getById(id).orElse(null);
        if (producto == null) {
            return "redirect:/productos";
        }
        model.addAttribute("producto", producto);
        return "formProducto"; // usa el mismo formulario
    }

    // Eliminar producto
    @GetMapping("/eliminar/{id}")
    public String eliminarProducto(@PathVariable int id) {
        productoService.delete(id);
        return "redirect:/productos";
    }
}