package model.repository;

public class Estendida extends Principal {
	
	private int quantidade;

	public Estendida(String produto, int quantidade) {
		super(produto);
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Quantidade no estoque: " + this.quantidade);
	}

}
