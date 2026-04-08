package com.ProAuSem4.GastroTec.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ProAuSem4.GastroTec.Model.Factura;
import com.ProAuSem4.GastroTec.Service.FacturaService;

@Controller
@RequestMapping("/facturas")
public class FacturasController {

    // Mostrar lista de Facturas en una página HTML
    private final FacturaService facturasService;

    public FacturasController(FacturaService facturasService) {
        this.facturasService = facturasService;
    }

    // Mostrar lista de Comprobantes en una página HTML
    @GetMapping
    public String listarFacturas(Model model) {
        model.addAttribute("facturas", facturasService.getAll());
        return "facturas"; // Renderiza factura.html
    }

    // Formulario nuevo factura CORREGIR
    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("factura", new Factura());
        return "formFactura";
    }

    // Guardar Factura CORREGIR
    @PostMapping
    public String guardarFactura(@ModelAttribute Factura factura) {
        facturasService.create(factura);
        return "redirect:/facturas";
    }

    // Formulario editar Factura CORREGIR
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable int id, Model model) {
        Factura factura = facturasService.getById(id).orElse(null);
        if (factura == null) {
            return "redirect:/facturas";
        }
        model.addAttribute("factura", factura);
        return "formFactura"; // usa el mismo formulario
    }

    // Eliminar Factura CORREGIR
    @GetMapping("/eliminar/{id}")
    public String eliminarFactura(@PathVariable int id) {
        facturasService.delete(id);
        return "redirect:/facturas";
    }

}    

