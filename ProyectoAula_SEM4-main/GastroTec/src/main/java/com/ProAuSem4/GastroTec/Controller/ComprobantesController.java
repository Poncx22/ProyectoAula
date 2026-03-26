package com.ProAuSem4.GastroTec.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comprobantes")
public class ComprobantesController {

    @GetMapping
    public String listarComprobantes(Model model) {
        return "comprobantes"; // Renderiza comprobantes.html
    }


    
}
