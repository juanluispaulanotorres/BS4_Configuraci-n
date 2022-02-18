package com.example.BS4Configuracion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @Value("${VAR1}")
    private String var1;

    @Value("${My.VAR2}")
    private int var2;

    @GetMapping("/valores/")
    public String getValores() {
        return "valor de var1 es: " + var1 + " valor de my.var2 es: " + var2;
    }

    @Value("${VAR_SISTEMA:var3 no tiene valor}")
    private String var3;

    @GetMapping("/var3/")
    public String getTercerValor() {
        return "valor de var3 es: " + var3;
    }
}