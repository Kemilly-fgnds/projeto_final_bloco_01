package menu;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;
import controller.Controller;
import model.repository.Estendida;
import model.repository.Principal;

public class Menu {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		Controller produtos = new Controller();

		int opcao, quantidade = 0;
		String produto, novoProduto = null;
		boolean continua = true;

		while (continua) {
			System.out.println("                                                            ");
			System.out.println("                     JOALHERIA SOLÁRIA                      ");
			System.out.println("                                                            ");
			System.out.println("************************************************************");
			System.out.println("                                                            ");
			System.out.println("              1 - Cadastrar Produto                         ");
			System.out.println("              2 - Listar Produto                            ");
			System.out.println("              3 - Atualizar Produto                         ");
			System.out.println("              4 - Deletar Produto                           ");
			System.out.println("              5 - Sair                                      ");
			System.out.println("                                                            ");
			System.out.println("************************************************************");
			System.out.println("Entre com a opção desejada:                                 ");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Produto\n\n");

				System.out.println("Digite o nome do Produto: ");
				leia.skip("\\R?");
				produto = leia.next();

				System.out.println("Digite a quantidade do Produto: ");
				leia.skip("\\R?");
				quantidade = leia.nextInt();

				produtos.cadastrar((new Estendida(produto, novoProduto, quantidade)));

				System.out.println(quantidade + " unidade(s) de " + produto + " foram adicionados ao estoque!");
			
				keyPress();
				break;
			case 2:
				System.out.println("Listar todos os Produtos\n\n");
				produtos.listarTodas();
			
				keyPress();
				break;
			case 3:
				System.out.println("Atualizar Produto\n\n");

				System.out.println("Digite o nome do Produto que deseja atualizar: ");
				leia.skip("\\R?");
				produto = leia.nextLine();

				var buscaPrincipal = produtos.buscarNaCollection(produto);

				System.out.println("Digite o nome do novo Produto: ");
				novoProduto = leia.nextLine();

				buscaPrincipal.setProduto(novoProduto);
				produtos.atualizar(buscaPrincipal);

				keyPress();
				break;
			case 4:
				System.out.println("Deletar Produto\n\n");

				System.out.println("Digite o nome do Produto: ");
				leia.skip("\\R?");
				produto = leia.nextLine();

				produtos.deletar(produto);

				produtos.buscarNaCollection(produto);
			
				keyPress();
				break;

			case 5:
				System.out.println("Loja Solária agradece a sua visita.");
				continua = false;
		
				break;

			default:
				System.out.println("Operação inválida.");
		
				keyPress();
				break;

			}
		}
	}

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

}
