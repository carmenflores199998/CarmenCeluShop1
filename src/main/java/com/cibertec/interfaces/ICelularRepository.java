package com.cibertec.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.entity.Celular;

@Repository
public interface ICelularRepository extends JpaRepository<Celular, Integer> {

}
