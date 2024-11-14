package menu;

import java.util.Scanner;

public class Menu {

	public static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao;
		String produto;
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
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Produto\n\n");

				System.out.println("Digite o nome do Produto: ");
				leia.skip("\\R?");
				produto = leia.nextLine();

				System.out.println("O Produto " + produto + " foi adicionado ao estoque!");

				break;
			case 2:
				System.out.println("Listar todos os Produtos\n\n");
				produto = leia.nextLine();

				break;
			case 3:
				System.out.println("Atualizar Produto\n\n");

				System.out.println("Digite o nome do Produto: ");
				leia.skip("\\R?");
				produto = leia.nextLine();

				System.out.println("O Produto " + produto + " foi atualizado com sucesso!");

				break;
			case 4:
				System.out.println("Deletar Produto\n\n");

				System.out.println("Digite o nome do Produto: ");
				leia.skip("\\R?");
				produto = leia.nextLine();

				System.out.println("O Produto " + produto + " foi deletado!");

				break;

			case 5:
				System.out.println("Loja Solária agradece a sua visita.");
				continua = false;

				break;

			default:
				System.out.println("Operação inválida.");
				continua = false;
				break;

			}
		}
	}

}
