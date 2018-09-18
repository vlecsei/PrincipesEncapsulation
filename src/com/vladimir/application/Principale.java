package com.vladimir.application;

import com.vladimir.entites.Personne;

public class Principale {

    public static void main(String[] args) {
	
	Personne durand = new Personne ("durand", "j2e sa");    
		durand.afficher();        
		durand.quitterSociete();
		durand.afficher();
		durand.setSociete("ejb corporation");
		durand.afficher();
		durand.setSociete("ejb corporation");
		durand.afficher();

    }

}
