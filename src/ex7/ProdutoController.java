package ex7;

import java.util.List;

public class ProdutoController {
    private ProdutoRepository repository = new ProdutoRepository();

    public void salvarController(Produto produtoEnviado){
        if(produtoEnviado == null || produtoEnviado.getNome().isBlank()){
            System.out.println("Produto vazio ou sem nome;");
            return;
        }
        if(produtoEnviado.getPreco() <= 0){
            System.out.println("Produto com preco menor que zero.");
            return;
        }

        System.out.println("Produto salvo com sucesso");
        repository.salvarProduto(produtoEnviado);
    }

    public void excluirController(Produto produto){
        if(produto == null){
            System.out.println("Produto nao existente;");
            return;
        }

        System.out.println("Produto removido com sucesso");
        repository.deletarPorId(produto.getId());
    }

    public void listarController(){
        if(repository == null){
            System.out.println("Banco vazio;");
            return;
        }
        repository.buscarTodos();
    }

    public void editarController(Produto produto){
        if(produto == null){
            System.out.println("Produto nao existente;");
            return;
        }
        repository.editarProduto(produto);
    }
}
