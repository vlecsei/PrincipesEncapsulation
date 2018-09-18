package com.vladimir.entites;


public class Personne {
    
    private String nom;
    private String societe;
    private static final String PAS_DE_SOCIETE = "?";
    
    
    
    
    public String getNom() {
        return nom.toUpperCase();
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getSociete() {
        return societe.toUpperCase();
    }
    public void setSociete(String entreprise) {
	if(societe != null && societe != "?") {
	    System.out.println("Erreur :\n1-quitterSociete, puis\n2-affecterSociete");// V�rification si societe est d�j� instanci�e
	    System.exit(1);
	}else {
	    this.societe = validerSociete(entreprise);
	}
        
    }
  
    public Personne(String nom) {
	this.nom = nom;
    }
    public Personne(String nom, String entreprise) {
	this.nom = nom;
	this.societe = validerSociete(entreprise);
    }
    public void afficher() {
	
	if(societe == null || societe == PAS_DE_SOCIETE) {
	    System.out.println( "Je m'appelle " + getNom() + " et je ne suis pas employ� d'une entreprise.");
	}else {
	     System.out.println( "Je m'appelle " + getNom() + " et je travaille chez " +getSociete());
	}
    }
	
    
    
    public void quitterSociete() {
	
	if (societe == null || societe == PAS_DE_SOCIETE) {	    
	    System.out.println("Je ne suis pas salari� : impossible de quitter la soci�t�");
	    System.exit(1);
	}else
	    societe = PAS_DE_SOCIETE;		
    }
    
    
    
    private String validerSociete(String entreprise) {
	
	if (entreprise.length() > 30 || entreprise == "?") {
	    System.out.println("Classe Personne, soci�t� incorrecte : ?");
	    System.exit(2);
	}
	    return entreprise;
    }
}
    
   

