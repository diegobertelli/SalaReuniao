package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import modelo.SalaReuniao;
import dao.SalaReuniaoDao;

@Stateless
public class SalaReuniaoServiceImpl implements SalaReuniaoService {

	@Inject
	SalaReuniaoDao salaReuniaoDao;

	@Override
	public void persistir(SalaReuniao salaReuniao) {	
		try {
			salaReuniaoDao.persistir(salaReuniao);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void editar(SalaReuniao salaReuniao) {
		try {
			salaReuniaoDao.editar(salaReuniao);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void remover(SalaReuniao salaReuniao) {
		try {
			salaReuniaoDao.remover(salaReuniao);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public SalaReuniao recuperarPorId(Long id) {
		try {
			return salaReuniaoDao.recuperarPorId(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<SalaReuniao> recuperarTodos() {
		try {
			return (List<SalaReuniao>) salaReuniaoDao.recuperarTodos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
}
