package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import modelo.Celula;
import dao.CelulaDao;

@Stateless
public class CelulaServiceImpl implements CelulaService {
	
	@Inject
	CelulaDao celulaDao;

	@Override
	public void persistir(Celula celula) {	
		try {
			celulaDao.persistir(celula);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void editar(Celula celula) {
		try {
			celulaDao.editar(celula);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void remover(Celula celula) {
		try {
			celulaDao.remover(celula);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Celula recuperarPorId(Long id) {
		try {
			return celulaDao.recuperarPorId(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Celula> recuperarTodos() {
		try {
			return (List<Celula>) celulaDao.recuperarTodos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
