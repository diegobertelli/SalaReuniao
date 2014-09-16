package dao;

import java.io.Serializable;

import javax.ejb.Stateless;

import modelo.Equipe;

@Stateless
public class EquipeDaoImpl extends DaoGenericoImpl<Equipe, Long> implements
Serializable, EquipeDao  {

	private static final long serialVersionUID = 3652097612703893222L;

}
