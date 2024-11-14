package model.repository;

public abstract class Principal {

	private String produto;

	public Principal(String produto) {
		super();
		this.produto = produto;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	public void visualizar() {
		System.out.println("Produtos: " + this.produto);
	}
	
}
