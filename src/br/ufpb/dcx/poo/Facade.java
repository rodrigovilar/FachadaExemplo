package br.ufpb.dcx.poo;

import java.util.List;

import br.ufpb.dcx.poo.software.GerenteDeSoftware;

public class Facade {

	private GerenteDeSoftware software = new GerenteDeSoftware();
	private GerenteDeDispositivos dispositivos = new GerenteDeDispositivos(software);
	private GerenteDeImoveis imoveis = new GerenteDeImoveis();

	
	public void addDispositivo(String nome, String espec) {
		dispositivos.add(nome, espec);
	}
	
	public List<String> listAll() {
		return dispositivos.listAll();
	}
	
	public void jogarDispositivoFora(String nome) {
		dispositivos.jogarFora(nome);
	}
	
	public void comprar(String nome, String versao) {
		software.comprar(nome, versao);
	}
}
