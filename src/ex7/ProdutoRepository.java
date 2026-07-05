package ex7;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {
    private List<Produto> produtos = new ArrayList<Produto>();

    public List<Produto> buscarTodos() {
        return this.produtos;
    }

    public Produto buscarPorId(int id) {
        return this.produtos.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public boolean salvarProduto(Produto produto) {
        return this.produtos.add(produto);
    }

    public boolean editarProduto(Produto produtoParaEditar) {
        Produto verSeProdutoExiste = buscarPorId(produtoParaEditar.getId());

        if(verSeProdutoExiste == null) return false;

        int indice = produtos.indexOf(verSeProdutoExiste);

        produtos.set(indice, produtoParaEditar);
        return true;
    }

    public Produto deletarPorId(int id) {
        Produto produtoDeletar = buscarPorId(id);

        if(produtoDeletar == null) {
            return produtoDeletar;
        }

        produtos.remove(produtoDeletar);
        return produtoDeletar;
    }

}
