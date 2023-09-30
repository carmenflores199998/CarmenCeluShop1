package com.cibertec.services;

import java.util.List;

import com.cibertec.entity.Celular;

public interface CelularService {
    void registrarCelular(Celular celular);

    List<Celular> listarCelulares();
}
