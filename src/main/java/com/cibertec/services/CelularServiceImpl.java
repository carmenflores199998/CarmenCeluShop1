package com.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Celular;
import com.cibertec.interfaces.ICelularRepository;

@Service
public class CelularServiceImpl implements CelularService{
    @Autowired
    private ICelularRepository celularRepository;

    @Override
    public void registrarCelular(Celular celular) {
        celularRepository.save(celular);
    }

    @Override
    public List<Celular> listarCelulares() {
        return celularRepository.findAll();
    }
    
}
