package dao;

import java.io.Serializable;

import javax.ejb.Stateless;

import modelo.SalaReuniao;

@Stateless
public class SalaReuniaoDaoImpl extends DaoGenericoImpl<SalaReuniao, Long> implements
Serializable, SalaReuniaoDao{

	private static final long serialVersionUID = 7524981172800756891L;

}
