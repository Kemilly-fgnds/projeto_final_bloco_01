package model.repository;

public interface Repository {
	
	public void cadastrar(Principal principal);
	public void listarTodas();
	public void atualizar(Principal principal);
	public void deletar(String produto);

}
