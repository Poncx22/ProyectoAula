package com.ProAuSem4.GastroTec.Controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

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

    // Mostrar lista de trabajadores con filtros opcionales
    @GetMapping
    public String listarTrabajadores(
            @RequestParam(value = "idBuscar", required = false) Integer idBuscar,
            @RequestParam(value = "nombreBuscar", required = false) String nombreBuscar,
            @RequestParam(value = "documentoBuscar", required = false) String documentoBuscar,
            Model model) {

        List<Trabajador> trabajadores;
        String filtroActivo = null;

        if (idBuscar != null) {
            Optional<Trabajador> resultado = trabajadorService.getById(idBuscar);
            trabajadores = resultado.map(Collections::singletonList).orElse(Collections.emptyList());
            model.addAttribute("idBuscar", idBuscar);
            filtroActivo = "id";

        } else if (nombreBuscar != null && !nombreBuscar.trim().isEmpty()) {
            trabajadores = trabajadorService.getByNombre(nombreBuscar.trim());
            model.addAttribute("nombreBuscar", nombreBuscar);
            filtroActivo = "nombre";

        } else if (documentoBuscar != null && !documentoBuscar.trim().isEmpty()) {
            trabajadores = trabajadorService.getByDocumento(documentoBuscar.trim());
            model.addAttribute("documentoBuscar", documentoBuscar);
            filtroActivo = "documento";

        } else {
            trabajadores = trabajadorService.getAll();
        }

        model.addAttribute("trabajadores", trabajadores);
        model.addAttribute("filtroActivo", filtroActivo);
        model.addAttribute("totalResultados", trabajadores.size());
        return "trabajadores";
    }

    // Formulario nuevo trabajador
    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("trabajador", new Trabajador());
        return "formTrabajador";
    }

    // Guardar trabajador en la base de datos
    @PostMapping
    public String guardarTrabajador(@ModelAttribute Trabajador trabajador) {
        trabajadorService.save(trabajador);
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