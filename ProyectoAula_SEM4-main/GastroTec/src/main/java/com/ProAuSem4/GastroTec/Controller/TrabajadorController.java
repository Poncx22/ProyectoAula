package com.ProAuSem4.GastroTec.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ProAuSem4.GastroTec.Model.Trabajador;
import com.ProAuSem4.GastroTec.Service.TrabajadorService;

@Controller
@RequestMapping("/trabajadores")
public class TrabajadorController {

    private final TrabajadorService trabajadorService;

    public TrabajadorController(TrabajadorService trabajadorService) {
        this.trabajadorService = trabajadorService;
    }

    // Mostrar lista de trabajadores en una página HTML
    @GetMapping
    public String listarTrabajadores(Model model) {
        model.addAttribute("trabajadores", trabajadorService.getAll());
        return "trabajadores"; // Renderiza trabajadores.html
    }

    // Formulario nuevo trabajador
    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("trabajador", new Trabajador());
        return "formTrabajador";
    }

    // Guardar trabajador
    @PostMapping
    public String guardarTrabajador(@ModelAttribute Trabajador trabajador) {
        trabajadorService.create(trabajador);
        return "redirect:/trabajadores";
    }

    // Formulario editar trabajador
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable int id, Model model) {
        Trabajador trabajador = trabajadorService.getById(id).orElse(null);
        if (trabajador == null) {
            return "redirect:/trabajadores";
        }
        model.addAttribute("trabajador", trabajador);
        return "formTrabajador"; // usa el mismo formulario
    }

    // Eliminar trabajador
    @GetMapping("/eliminar/{id}")
    public String eliminarTrabajador(@PathVariable int id) {
        trabajadorService.delete(id);
        return "redirect:/trabajadores";
    }
}