package br.com.calculadoraPreco.services;

import br.com.calculadoraPreco.models.Produto;
import br.com.calculadoraPreco.repository.IProdutoRepository;

import java.util.List;

public class ProdutoService implements IProdutoRepository {

    private static final ProdutoService PRODUTO_SERVICE = new ProdutoService();
    private ProdutoService(){};
    public static ProdutoService getInstance(){
        return PRODUTO_SERVICE;
    }

    public Produto gerarProduto(String nome, double valor) {
        return null;
    }

    public void addProdutoBanco(Produto produto) {

    }

    public List<Produto> ListarProdutos() {
        return null;
    }

    public Produto produtoIndex(int index) {
        return null;
    }
}
