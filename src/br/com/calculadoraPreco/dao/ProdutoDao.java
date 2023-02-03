package br.com.calculadoraPreco.dao;

import br.com.calculadoraPreco.models.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {

    private static List<Produto> produtoList = new ArrayList<Produto>();
    private static final ProdutoDao PRODUTO_DAO = new ProdutoDao();
    private ProdutoDao(){};
    public static ProdutoDao getInstance(){
        return PRODUTO_DAO;
    };

    public boolean addProdutoBanco(Produto produto){
        return produtoList.add(produto);
    };

    public List<Produto> retornaListaProduto(){
        return produtoList;
    }

    public Produto retornaProdutoIndex(int index){
        return produtoList.get(index);
    }

}
