package service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import modelo.Funcionario;
import dao.FuncionarioDao;

@Stateless
public class FuncionarioServiceImpl implements FuncionarioService {

	@Inject
	FuncionarioDao funcionarioDao;

	@Override
	public void persistir(Funcionario funcionario) {
		try {
			funcionarioDao.persistir(funcionario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void editar(Funcionario funcionario) {
		try {
			funcionarioDao.editar(funcionario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void remover(Funcionario funcionario) {
		try {
			funcionarioDao.remover(funcionario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Funcionario recuperarPorId(Long id) {
		try {
			return funcionarioDao.recuperarPorId(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Funcionario> recuperarTodos() {
		try {
			return (List<Funcionario>) funcionarioDao.recuperarTodos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
