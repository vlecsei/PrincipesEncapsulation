package com.vladimir.entites;


public class Personne {
    
    private String nom;
    private String societe;
    private static final String PAS_DE_SOCIETE = "?";
    
    
    
    
    
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getSociete() {
        return societe;
    }
    public void setSociete(String societe) {
        this.societe = societe;
    }
  
    public Personne(String nom) {
	this.nom = nom;
    }
    public Personne(String nom, String societe) {
	this.nom = nom;
	this.societe = societe;
    }
    public void afficher() {
	if(getSociete() == null) {
	    System.out.println( "Je m'appelle " + nom.toUpperCase() + " et je ne suis pas employé d'une entreprise.");
	}else {
	    System.out.println( "Je m'appelle " + nom.toUpperCase() + " et je travail chez " +societe.toUpperCase());
	}
	
    }
    
   
}
