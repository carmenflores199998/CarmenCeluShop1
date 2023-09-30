package com.cibertec.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.entity.Marca;

@Repository
public interface IMarcaRepository extends JpaRepository<Marca, Integer> {

}
