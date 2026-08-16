package com.guilhermeabreu.controle_estoque.exception;

public class ProdutoNaoEncontradoException extends RuntimeException {

    public ProdutoNaoEncontradoException(Long id) {
        super("Produto não encontrado com id: " + id);
    }
}
