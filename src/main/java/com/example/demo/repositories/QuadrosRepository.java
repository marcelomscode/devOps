package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Quadros;



@Repository
public interface QuadrosRepository extends JpaRepository<Quadros, Long>{

}
