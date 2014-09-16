package service;

import java.util.List;

import modelo.Equipe;

public interface EquipeService {
	
	public void persistir(Equipe equipe);

	public void editar(Equipe equipe);

	public void remover(Equipe equipe);

	public Equipe recuperarPorId(Long id);

	public List<Equipe> recuperarTodos();

}
