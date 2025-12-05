package it.corsocyber2025.lezione10;

public abstract class Studente extends Persona implements EssereStudente, Abbonamenti{
	
	private String annoDiCorso;
	
	public Studente () {
		nome = "Mario";
	}
	
	public void vieniALezione() {
		System.out.println("Vengo a lezione in limousine");
	}
	
	public void pagaAbbonamento () {
		System.out.println("pago 2 bitcoin");
	}
	
	public String getAnnoDiCorso() {
		return annoDiCorso;
	}
	
	public void nomeDelCorso() {
	}
}
