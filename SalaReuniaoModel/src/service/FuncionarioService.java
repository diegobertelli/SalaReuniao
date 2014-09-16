package service;

import java.util.List;

import modelo.Funcionario;

public interface FuncionarioService {
	
	public void persistir(Funcionario funcionario);

	public void editar(Funcionario funcionario);

	public void remover(Funcionario funcionario);

	public Funcionario recuperarPorId(Long id);

	public List<Funcionario> recuperarTodos();


}
