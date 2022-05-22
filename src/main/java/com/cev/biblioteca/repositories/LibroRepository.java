package com.cev.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cev.biblioteca.entities.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, String>{
	//Implementar las métricas necesarias
}
