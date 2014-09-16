package service;

import java.util.List;

import modelo.Celula;

public interface CelulaService {
	
	public void persistir(Celula celula);

	public void editar(Celula celula);

	public void remover(Celula celula);

	public Celula recuperarPorId(Long id);

	public List<Celula> recuperarTodos();

}
