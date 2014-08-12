package br.ufpb.dcx.poo;

import static org.junit.Assert.*;

import org.junit.Test;

import br.ufpb.dcx.poo.software.GerenteDeSoftware;

public class PatrimonioTest {

	@Test
	public void test() {
		Facade facade = new Facade();
		
		facade.addDispositivo("cpu1", "sdfsdfsfsdfsd");
		facade.comprar("cpu1.win", "7");
		facade.jogarDispositivoFora("cpu1");
	}

}
