package dao;

import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.UserTransaction;

@Stateless
@SuppressWarnings("unchecked")
public abstract class DaoGenericoImpl<T, PK> implements DaoGenerico<T, PK> {
	
	@PersistenceContext(unitName="SalaReuniaoModel")
	protected EntityManager entityManager;
	
	@Resource
	protected UserTransaction ut;

	public void persistir(T entity) {
		try {
			ut.begin();
			entityManager.persist(entity);
			ut.commit();
		} catch (Exception e) {
			
		}

	}

	public void editar(T entity) {
		try {
			ut.begin();
			entityManager.merge(entity);
			ut.commit();
		} catch (Exception e) {
			
		}
		
	}

	public void remover(T entity) {
		try {
			ut.begin();
			entityManager.remove(entity);
			ut.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}		
	}

	public void removePeloId(PK id) {
		try {
			T entity = recuperarPorId(id);
			ut.begin();			
			entityManager.remove(entity);
			ut.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}	
	}

	public T recuperarPorId(PK id) {
		try {
			ut.begin();	
			T obj = entityManager.find(recuperarTipoClasse(), id);
			ut.commit();
			return obj;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	public Collection<T> recuperarTodos() {
		try {
			ut.begin();	
			List<T> list = entityManager.createQuery("FROM " + recuperarTipoClasse().getName())
					.getResultList();
			ut.commit();
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	public Query criarConsultaPersonalizada(String query, Object... parameters) {
		Query q = entityManager.createQuery(query);

		for (int i = 1; i <= parameters.length; i++) {
			q.setParameter(i, parameters[i]);
		}
		
		return q;
	}

	private Class<T> recuperarTipoClasse() {
		return (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}
}
