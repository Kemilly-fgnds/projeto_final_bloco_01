package controller;

import java.util.ArrayList;
import java.util.Optional;

import model.repository.Principal;
import repository.Repository;

public class Controller implements Repository {

	private ArrayList<Principal> listaProdutos = new ArrayList<Principal>();

	@Override
	public void cadastrar(Principal principal) {
		listaProdutos.add(principal);
		System.out.println("\nO Produto: " + principal.getProduto() + " foi criado com sucesso!");

	}

	@Override
	public void listarTodas() {
		for (var principal : listaProdutos) {
			principal.visualizar();
		}
	}

	@Override
	public void atualizar(Principal principal) {
		Principal buscaPrincipal = buscarNaCollection(principal.getProduto());

		if (buscaPrincipal != null) {
			int index = listaProdutos.indexOf(buscaPrincipal);
			if (index != -1) {
				listaProdutos.set(index, principal);
				System.out.println("O Produto " + principal.getProduto() + " foi atualizado com sucesso!");
			} else {
				System.out.println("O Produto " + principal.getProduto() + " não foi encontrado!");
			}
		}
	}

	@Override
	public void deletar(String produto) {
		var principal = buscarNaCollection(produto);

		if (principal != null) {
			if (listaProdutos.remove(principal)) {
				System.out.println("\nO Produto " + produto + " foi deletado com sucesso!");
			} else {
				System.out.println("\nO Produto " + produto + " não foi encontrado!");
			}
		}
	}

	public Principal buscarNaCollection(String produto) {
		for (var principal : listaProdutos) {
			if (principal.getProduto().equals(produto)) {
				return principal;
			}
		}

		return null;

	}
}
