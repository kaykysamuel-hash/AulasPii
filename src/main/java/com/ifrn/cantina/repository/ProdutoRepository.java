package com.ifrn.cantina.repository;

import com.ifrn.cantina.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}