package com.demo.gestiondestocks.repository;


import com.demo.gestiondestocks.model.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Integer, Categorie> {
}
