package com.adso.aprendiz.Controller;


import com.adso.aprendiz.entity.Aprendiz;
import com.adso.aprendiz.service.Aprendiz_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/aprendiz")
@CrossOrigin("http://localhost:5173/")
public class aprendizController {

    @Autowired
    private Aprendiz_service aprendizService;

    @PostMapping
    public void crearAprendiz(@RequestBody Aprendiz aprendiz){
        aprendizService.crearAprendiz(aprendiz);
    }

    @GetMapping
    public List<Aprendiz> obtenerAprendices(){
        return aprendizService.obtenerAprendiz();
    }

    @GetMapping("/{id}")
    public Aprendiz buscarPorId(@PathVariable Long id){
        return aprendizService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarAprendiz(@PathVariable Long id){
        aprendizService.eliminarAprendiz(id);
    }


    @PutMapping("/{id}")
    public Aprendiz actualizarAprendiz(@PathVariable Long id, @RequestBody Aprendiz aprendiz){
        return aprendizService.actualizarAprendiz(id, aprendiz);
    }
}