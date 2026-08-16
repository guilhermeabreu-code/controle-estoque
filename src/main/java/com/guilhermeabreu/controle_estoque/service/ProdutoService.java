package com.guilhermeabreu.controle_estoque.service;

import com.guilhermeabreu.controle_estoque.exception.ProdutoNaoEncontradoException;
import com.guilhermeabreu.controle_estoque.model.Produto;
import com.guilhermeabreu.controle_estoque.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public List<Produto> listarTodos() {
        return repository.findAll();
    }

    public Produto buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ProdutoNaoEncontradoException(id));
    }

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public Produto atualizar(Long id, Produto dadosNovos) {
        Produto produto = buscarPorId(id);
        produto.setNome(dadosNovos.getNome());
        produto.setPreco(dadosNovos.getPreco());
        produto.setQuantidade(dadosNovos.getQuantidade());
        return repository.save(produto);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}