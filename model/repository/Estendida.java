package model.repository;

public class Estendida extends Principal {
	
	private int quantidade;
	private String novoProduto;

	public Estendida(String produto, String novoProduto, int quantidade) {
		super(produto);
		this.quantidade = quantidade;
		this.novoProduto = novoProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	public String getNovoProduto() {
		return novoProduto;
	}

	public void setNovoProduto(String novoProduto) {
		this.novoProduto = novoProduto;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Quantidade no estoque: " + this.quantidade);
	}

}
