package controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import modelo.Celula;
import service.CelulaService;

@Named
@ViewScoped
public class CelulaController implements Serializable {

	private static final long serialVersionUID = 2994828284880212036L;

	private Celula celula;
	private List<Celula> listCelula;

	@Inject
	private CelulaService celulaService;

	public CelulaController() {

	}
	
	@PostConstruct
	public void init(){	
		pesquisarCelulas();
		celula = new Celula();
	}

	public String salvar() {
		celulaService.persistir(celula);
		return "";
	}
	
	public String editar() {
		celulaService.editar(celula);
		return "";
	}
	
	public String excluir(){
		celulaService.remover(celula);
		return null;
	}
	
	public void pesquisarCelulas(){
		setListCelula(celulaService.recuperarTodos());
	}

	public Celula getCelula() {
		return celula;
	}

	public void setCelula(Celula celula) {
		this.celula = celula;
	}

	public CelulaService getCelulaService() {
		return celulaService;
	}

	public void setCelulaService(CelulaService celulaService) {
		this.celulaService = celulaService;
	}

	public List<Celula> getListCelula() {
		return listCelula;
	}
	
	public void setListCelula(List<Celula> listCelula) {
		this.listCelula = listCelula;
	}
}
