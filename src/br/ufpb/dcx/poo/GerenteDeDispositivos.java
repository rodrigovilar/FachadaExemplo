package br.ufpb.dcx.poo;

import java.util.List;

import br.ufpb.dcx.poo.software.GerenteDeSoftware;

public class GerenteDeDispositivos {
	
	private GerenteDeSoftware software;

	public GerenteDeDispositivos(GerenteDeSoftware software) {
		this.software = software;
	}

	public void add(String nome, String espec) {
		
	}

	public void jogarFora(String nome) {
		software.jogarFora(nome + ".*");
	}

	public void relatarExtravio(String nome) {
		
	}
	
	public List<String> listAll() {
		return null;
	}

}
