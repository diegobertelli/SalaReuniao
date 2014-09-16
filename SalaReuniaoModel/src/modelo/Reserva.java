package modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="reserva")
public class Reserva implements Serializable {
	
	private static final long serialVersionUID = -6941329609835096418L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_reserva", nullable=false)
	private Long IdReserva;
	
	@Column(name = "data_reuniao", nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dataReuniao;
	
	@Basic(optional = false)
	@Column(name = "hora_inicio", nullable=false)
	private String horaInicio;
	
	@Basic(optional = false)
	@Column(name = "hora_fim", nullable=false)
	private String horaFim;
	
	@ManyToOne
	@JoinColumn(name = "id_sala_reuniao", referencedColumnName="id_sala_reuniao", nullable=false)
	private SalaReuniao salaReuniao;
	
	@ManyToOne
	@JoinColumn(name = "id_equipe", referencedColumnName="id_equipe", nullable=false)
	private Equipe equipe;

	public Long getIdReserva() {
		return IdReserva;
	}

	public void setIdReserva(Long idReserva) {
		IdReserva = idReserva;
	}

	public Date getDataReuniao() {
		return dataReuniao;
	}

	public void setDataReuniao(Date dataReuniao) {
		this.dataReuniao = dataReuniao;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}

	public SalaReuniao getSalaReuniao() {
		return salaReuniao;
	}

	public void setSalaReuniao(SalaReuniao salaReuniao) {
		this.salaReuniao = salaReuniao;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

}
