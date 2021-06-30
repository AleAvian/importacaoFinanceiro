package com.financeiro.repository;

import com.financeiro.model.TaxaProcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITaxaProcessoRepository extends JpaRepository <TaxaProcesso, Long> {
}
