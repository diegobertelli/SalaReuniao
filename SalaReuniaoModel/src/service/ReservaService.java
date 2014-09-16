package service;

import java.util.List;

import modelo.Reserva;

public interface ReservaService {
	
	public void persistir(Reserva reserva);

	public void editar(Reserva reserva);

	public void remover(Reserva reserva);

	public Reserva recuperarPorId(Long id);

	public List<Reserva> recuperarTodos();

}
