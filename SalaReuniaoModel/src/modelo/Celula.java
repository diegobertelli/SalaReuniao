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
@Table(name="celula")
public class Celula implements Serializable {

	private static final long serialVersionUID = 1662529554732543539L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_celula", nullable=false)
	private Long IdCelula;
	
	@Basic(optional = false)
	@Column(name = "nr_celula", nullable=false)
	private int nrCelula;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy= "celula",fetch = FetchType.LAZY)
	private List<Funcionario> funcionarios;

	public Long getIdCelula() {
		return IdCelula;
	}

	public void setIdCelula(Long idCelula) {
		IdCelula = idCelula;
	}

	public int getNrCelula() {
		return nrCelula;
	}

	public void setNrCelula(int nrCelula) {
		this.nrCelula = nrCelula;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
}
