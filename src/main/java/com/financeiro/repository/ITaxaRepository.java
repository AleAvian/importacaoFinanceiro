package com.financeiro.repository;


import com.financeiro.model.Taxa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITaxaRepository extends JpaRepository<Taxa, Long> {
}
