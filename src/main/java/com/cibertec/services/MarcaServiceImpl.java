package com.cibertec.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.entity.Marca;
import com.cibertec.interfaces.IMarcaRepository;

@Service
public class MarcaServiceImpl implements MarcaService{

    @Autowired
    private IMarcaRepository marcaRepository;

    @Override
    public List<Marca> listarMarcas() {
        return marcaRepository.findAll();
    }
    
}
