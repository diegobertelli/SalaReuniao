package dao;

import java.util.Collection;

import javax.persistence.Query;

public interface DaoGenerico<T, PK> {
	
	public void persistir(T entity);

	public void editar(T entity);

	public void remover(T entity);

	public void removePeloId(PK id);

	public T recuperarPorId(PK id);

	public Collection<T> recuperarTodos();
	
	public Query criarConsultaPersonalizada(String query, Object... parameters);
}
