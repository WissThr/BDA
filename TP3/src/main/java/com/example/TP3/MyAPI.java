package com.example.TP3;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("unused")
@RestController
public class MyAPI {
    public static ArrayList<Etudiant> liste = new ArrayList<>();
    static {
        liste.add(new Etudiant(0, "Z", 19));
        liste.add(new Etudiant(1, "A", 19));
        liste.add(new Etudiant(2, "B", 20));
        liste.add(new Etudiant(3, "C", 21));
    }

    @GetMapping(value = "/liste")
    public Collection<Etudiant> getAllEtudiants() {
        return liste;
    }

    @GetMapping(value = "/getEtudiant")
    public Etudiant getEtudiant(int id) {
        return liste.get(id);
    }

    @PostMapping(value = "/addEtudiant")
    public Etudiant addEtudiant(Etudiant e) {
        liste.add(e);
        return e;
    }

    @DeleteMapping(value = "/supprEtudiant")
    public void supprEtudiant(int id) {
        liste.remove(id);
    }

    @PutMapping(value = "/updateEtudiant")
    public Etudiant updateEtudiant(int id, String nom) {
        Etudiant e = liste.get(id);
        e.setNom(nom);
        return e;
    }

    @GetMapping(value = "/bonjour")
    public String bonjour() {
        return "Bonjour";
    }

    @GetMapping(value = "/bonsoir")
    public String bonsoir() {
        return "Bonsoir";
    }

    @GetMapping(value = "/etudiant")
    public Etudiant getEtudiant() {
        return new Etudiant(1, "A", 19);
    }

    @GetMapping(value = "/somme")
    public double somme(double a, double b) {
        return a + b;
    }
}
