package service;

import java.util.List;

import modelo.SalaReuniao;

public interface SalaReuniaoService {
	
	public void persistir(SalaReuniao salaReuniao);

	public void editar(SalaReuniao salaReuniao);

	public void remover(SalaReuniao salaReuniao);

	public SalaReuniao recuperarPorId(Long id);

	public List<SalaReuniao> recuperarTodos();

}
