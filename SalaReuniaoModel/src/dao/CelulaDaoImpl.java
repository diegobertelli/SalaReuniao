package dao;

import java.io.Serializable;

import javax.ejb.Stateless;

import modelo.Celula;

@Stateless
public class CelulaDaoImpl extends DaoGenericoImpl<Celula, Long> implements
		Serializable, CelulaDao {
	private static final long serialVersionUID = 2404360457246388280L;

}
