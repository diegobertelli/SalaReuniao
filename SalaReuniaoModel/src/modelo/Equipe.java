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
@Table(name="equipe")
public class Equipe implements Serializable {
	
	private static final long serialVersionUID = -522706241024222302L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_equipe", nullable=false)
	private Long IdEquipe;
	
	@Basic(optional = false)
	@Column(name = "nome", nullable=false)
	private String nome;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy= "equipe",fetch = FetchType.LAZY)
	private List<Reserva> reservas;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy= "equipe",fetch = FetchType.LAZY)
	private List<Funcionario> funcionarios;

	public Long getIdEquipe() {
		return IdEquipe;
	}

	public void setIdEquipe(Long idEquipe) {
		IdEquipe = idEquipe;
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

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

}
