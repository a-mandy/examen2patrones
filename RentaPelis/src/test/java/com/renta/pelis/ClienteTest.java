package com.renta.pelis;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ClienteTest {
	String nombreCliente= "Amanda";
	public Cliente cliente= new Cliente(nombreCliente);
	public ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	public Pelicula peliUno= new Pelicula("Terminator",1);
	public Disco disc= new Disco("p2",peliUno);
	public Alquiler alqui= new Alquiler(disc,2);
	
	

	@Test
	public void test() {
		Registrar.add("Clientes",cliente);
		cliente.addRental(alqui);
		String result= "Alquileres de Amanda:\r\n" + 
				"	Terminator	6.0\r\n" + 
				"Monto total:  6.0\r\n" + 
				"Gano 2 puntos por alquiler frecuente";
		String ans= cliente.statement();
		System.out.println(ans);
		
		assertEquals(ans,result);
		
	}

}
