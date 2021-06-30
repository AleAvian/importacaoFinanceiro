package com.financeiro.repository;

import com.financeiro.model.Armazenagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IArmazenagemRepository extends JpaRepository<Armazenagem, Long> {



}
