package ex7;

import java.util.Scanner;

public class ProdutoView {
    static void executarView(){
        ProdutoController controller = new ProdutoController();
        Scanner ler = new Scanner(System.in);

        System.out.println("--- MENU DO SISTEMA (VIEW) ---");
        System.out.println("1 - Cadastrar Novo Produto");
        System.out.println("2 - Editar Produto Existente");
        System.out.print("Escolha uma opção: ");
        int opcao = ler.nextInt();

        switch (opcao) {
            case 1:
                Produto novo = new Produto(1, "Teclado", 150.0);
                controller.salvarController(novo);
                break;

            case 2:
                Produto editado = new Produto(1, "Teclado RGB", 180.0);
                controller.editarController(editado);
                break;

            default:
                System.out.println("Opção inválida.");
        }
    }
}
