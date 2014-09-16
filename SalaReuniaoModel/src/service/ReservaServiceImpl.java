package service;

import java.util.List;

import javax.inject.Inject;

import modelo.Reserva;
import dao.ReservaDao;

public class ReservaServiceImpl implements ReservaService {

	@Inject
	ReservaDao reservaDao;

	@Override
	public void persistir(Reserva reserva) {	
		try {
			reservaDao.persistir(reserva);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void editar(Reserva reserva) {
		try {
			reservaDao.editar(reserva);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void remover(Reserva reserva) {
		try {
			reservaDao.remover(reserva);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Reserva recuperarPorId(Long id) {
		try {
			return reservaDao.recuperarPorId(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Reserva> recuperarTodos() {
		try {
			return (List<Reserva>) reservaDao.recuperarTodos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	
}
