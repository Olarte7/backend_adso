package com.adso.aprendiz.service;

import com.adso.aprendiz.entity.Aprendiz;
import com.adso.aprendiz.repository.AprendizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Aprendiz_service {
    @Autowired
    private AprendizRepository AprendizRepository;


    public void  crearAprendiz(Aprendiz aprendiz){
        AprendizRepository.save(aprendiz);
    }

    public List<Aprendiz> obtenerAprendiz(){
        return AprendizRepository.findAll();
    }

    public Aprendiz buscarPorId(Long id){
        return AprendizRepository.findById(id).orElse(null);
    }

    public void eliminarAprendiz(Long id){
        AprendizRepository.deleteById(id);
    }

    public Aprendiz actualizarAprendiz(Long id, Aprendiz aprendiz){
        aprendiz.setId(id);
        return AprendizRepository.save(aprendiz);
    }
}
