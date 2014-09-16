package modelo;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="funcionario")
public class Funcionario implements Serializable{

	private static final long serialVersionUID = 5558092442446790167L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_funcionario", nullable=false)
	private Long IdFuncionario;
	
	@Basic(optional = false)
	@Column(name = "nome", nullable=false)
	private String nome;
	
	@Basic(optional = false)
	@Column(name = "email", nullable=false)
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "id_celula", referencedColumnName="id_celula", nullable=false)
	private Celula celula;
	
	@ManyToOne
	@JoinColumn(name = "id_equipe", referencedColumnName="id_equipe", nullable=false)
	private Equipe equipe;

	public Long getIdFuncionario() {
		return IdFuncionario;
	}

	public void setIdFuncionario(Long idFuncionario) {
		IdFuncionario = idFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Celula getCelula() {
		return celula;
	}

	public void setCelula(Celula celula) {
		this.celula = celula;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	
}
