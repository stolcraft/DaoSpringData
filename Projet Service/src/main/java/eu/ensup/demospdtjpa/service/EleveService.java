package eu.ensup.demospdtjpa.service;

import java.util.List;

import eu.ensup.demospdtjpa.dao.IEleveDao;
import eu.ensup.demospdtjpa.domaine.Eleve;

public class EleveService {

	private IEleveDao elevedao;

	public EleveService(IEleveDao elevedao) {
		super();
		this.elevedao = elevedao;
	}

	public EleveService() {
		super();
	}

	public IEleveDao getElevedao() {
		return elevedao;
	}

	public void setElevedao(IEleveDao elevedao) {
		this.elevedao = elevedao;
	}

	
	public void enregistrerEleve(Eleve eleve)
	{
		elevedao.save(eleve);
	}

}
