package modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="sala_reuniao")
public class SalaReuniao implements Serializable {
	
	private static final long serialVersionUID = 5533144961426493869L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_sala_reuniao", nullable=false)
	private Long IdSalaReuniao;
	
	@Basic(optional = false)
	@Column(name = "nome", nullable=false)
	private String nome;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy= "salaReuniao",fetch = FetchType.LAZY)
	private List<Reserva> reservas;

	public Long getIdSalaReuniao() {
		return IdSalaReuniao;
	}

	public void setIdSalaReuniao(Long idSalaReuniao) {
		IdSalaReuniao = idSalaReuniao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

}
