package com.guilhermeabreu.controle_estoque.repository;

import com.guilhermeabreu.controle_estoque.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
