package dao;

import java.io.Serializable;

import javax.ejb.Stateless;

import modelo.Funcionario;

@Stateless
public class FuncionarioDaoImpl extends DaoGenericoImpl<Funcionario, Long> implements
Serializable, FuncionarioDao {

	private static final long serialVersionUID = 7675712922172791700L;
		

}
