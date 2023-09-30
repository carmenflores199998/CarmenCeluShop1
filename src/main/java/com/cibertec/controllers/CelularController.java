package com.cibertec.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cibertec.entity.Celular;
import com.cibertec.services.CelularServiceImpl;
import com.cibertec.services.MarcaServiceImpl;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/")
public class CelularController {

    @Autowired
    private CelularServiceImpl celularServiceImpl;

    @Autowired
    private MarcaServiceImpl marcaServiceImpl;

    @GetMapping
    public String listarProductos(Model model) {
        model.addAttribute("celulares", celularServiceImpl.listarCelulares());
        return "listaCelulares";
    }

    @GetMapping("/celular")
    public String agregarCelular(Model model) {
        model.addAttribute("celular", new Celular());
        model.addAttribute("marcas", marcaServiceImpl.listarMarcas());
        return "registrarCelular";
    }

    @PostMapping("/celular")
    public String guardarCelular(@Valid @ModelAttribute("celular") Celular celular,
            RedirectAttributes redirectAttributes, Errors errors) {

        if (errors.hasErrors()) {
            return "registrarCelular";
        }

        celularServiceImpl.registrarCelular(celular);
        redirectAttributes.addFlashAttribute("mensaje", "Celular registrado con éxito");
        return "redirect:/";
    }
}
