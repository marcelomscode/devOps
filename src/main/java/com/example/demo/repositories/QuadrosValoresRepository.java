package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.QuadrosValores;


@Repository
public interface QuadrosValoresRepository extends JpaRepository<QuadrosValores, Long>{

}
