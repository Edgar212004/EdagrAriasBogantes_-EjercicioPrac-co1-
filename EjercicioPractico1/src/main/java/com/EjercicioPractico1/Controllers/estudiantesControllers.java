/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.EjercicioPractico1.Controllers;
//implements
import com.EjercicioPractico1.Domain.estudiantes;
import com.EjercicioPractico1.Service.estudiantesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
@RequestMapping("/estudiantes")
public class estudiantesControllers {
    
    @Autowired
    private estudiantesService estudiantesService;
    
    @GetMapping("/listado")
    public String inicio(Model model) {
        var estudiantes = estudiantesService.getestudiantes();
        model.addAttribute("estudiantes", estudiantes);
        model.addAttribute("totalestudiantes", estudiantes.size());
        return "/estudiantes/listado";
    }
    
    @GetMapping("/nuevo")
    public String estudiantesNuevo(estudiantes estudiantes) {
        return "/estudiantes/modifica";
    }
 
    @PostMapping("/guardar")
    public String estudiantesGuardar(estudiantes estudiantes) {        
         
        estudiantesService.save(estudiantes);
        return "redirect:/estudiantes/listado";
    }
    @GetMapping("/eliminar/{idCategoria}")
    public String categoriaEliminar(estudiantes estudiantes) {
        estudiantesService.delete(estudiantes);
        return "redirect:/categoria/listado";
    }
    @GetMapping("/modificar/{id}")
    public String categoriaModificar(estudiantes estudiantes, Model model) {
        estudiantes = estudiantesService.getestudiantes(estudiantes);
        model.addAttribute("estudiantes", estudiantes);
        return "/estudiantes/modifica";
    }
    
}
