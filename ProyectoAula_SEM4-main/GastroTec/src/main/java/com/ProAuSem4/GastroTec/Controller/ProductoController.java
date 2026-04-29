package com.ProAuSem4.GastroTec.Controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    // Mostrar lista de Productos con filtros opcionales por ID, Nombre o Código
    @GetMapping
    public String listarProductos(
            @RequestParam(value = "idBuscar", required = false) Integer idBuscar,
            @RequestParam(value = "nombreBuscar", required = false) String nombreBuscar,
            @RequestParam(value = "codigoBuscar", required = false) String codigoBuscar,
            Model model) {

        List<Producto> productos;
        String filtroActivo = null;

        if (idBuscar != null) {
            Optional<Producto> resultado = productoService.getById(idBuscar);
            productos = resultado.map(Collections::singletonList).orElse(Collections.emptyList());
            model.addAttribute("idBuscar", idBuscar);
            filtroActivo = "id";
        } else if (nombreBuscar != null && !nombreBuscar.trim().isEmpty()) {
            productos = productoService.getByNombre(nombreBuscar.trim());
            model.addAttribute("nombreBuscar", nombreBuscar);
            filtroActivo = "nombre";
        } else if (codigoBuscar != null && !codigoBuscar.trim().isEmpty()) {
            productos = productoService.getByCodigo(codigoBuscar.trim());
            model.addAttribute("codigoBuscar", codigoBuscar);
            filtroActivo = "codigo";
        } else {
            productos = productoService.getAll();
        }

        model.addAttribute("productos", productos);
        model.addAttribute("filtroActivo", filtroActivo);
        model.addAttribute("totalResultados", productos.size());
        return "productos";
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