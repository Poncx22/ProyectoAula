package com.ProAuSem4.GastroTec.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/hola")
    public String holaMundo() {
        return "Hola Mundo desde Spring Boot 🚀";
    }
}
