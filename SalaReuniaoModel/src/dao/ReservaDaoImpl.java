package dao;

import java.io.Serializable;

import javax.ejb.Stateless;

import modelo.Reserva;

@Stateless
public class ReservaDaoImpl extends DaoGenericoImpl<Reserva, Long> implements
Serializable, ReservaDao{

	private static final long serialVersionUID = 2546617927104077489L;

}
