package com.example.Prueba_2.Controller;

import com.example.Prueba_2.Model.ModeloCliente;
import com.example.Prueba_2.Service.ServicioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

@Controller
public class ControllerCliente {
    @Autowired
    private ServicioCliente clienteService;

    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("cliente", new ModeloCliente());
        return "formulario";
    }

    @PostMapping("/calcular")
    public String calcular(@ModelAttribute ModeloCliente cliente, Model model) {
        clienteService.calcularDatos(cliente);
        model.addAttribute("cliente", cliente);
        return "formulario";
    }
}