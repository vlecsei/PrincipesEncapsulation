package com.vladimir.application;

import com.vladimir.entites.Personne;

public class Principale {

    public static void main(String[] args) {
	
	Personne martin = new Personne("martin", "Java SARL");
	Personne dupont = new Personne("dupont");
	martin.afficher();
	dupont.afficher();

    }

}
