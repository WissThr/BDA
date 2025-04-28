package com.example.H2Demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.H2Demo.entities.Adherent;

public interface AdherentRepository extends JpaRepository<Adherent, Long> {

}
