package com.financeiro.repository;

import com.financeiro.model.Processo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProcessoRepository extends JpaRepository <Processo, Long> {
}
