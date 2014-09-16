package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import modelo.Equipe;
import dao.EquipeDao;

@Stateless
public class EquipeServiceImpl implements EquipeService {

	@Inject
	EquipeDao equipeDao;

	@Override
	public void persistir(Equipe equipe) {	
		try {
			equipeDao.persistir(equipe);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void editar(Equipe equipe) {
		try {
			equipeDao.editar(equipe);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void remover(Equipe equipe) {
		try {
			equipeDao.remover(equipe);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Equipe recuperarPorId(Long id) {
		try {
			return equipeDao.recuperarPorId(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Equipe> recuperarTodos() {
		try {
			return (List<Equipe>) equipeDao.recuperarTodos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
