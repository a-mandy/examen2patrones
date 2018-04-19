package com.renta.pelis;

public class Disco {
	private String numeroSerie; 
    private Pelicula pelicula;
// constructor  
    
    public Disco(String pNumeroSerie, Pelicula pPelicula) {
    	setNumeroSerie(pNumeroSerie);
    	pelicula = pPelicula;
    }
    
    public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}
	
	public Pelicula getPelicula() {
    	return pelicula;
    }

	
}
