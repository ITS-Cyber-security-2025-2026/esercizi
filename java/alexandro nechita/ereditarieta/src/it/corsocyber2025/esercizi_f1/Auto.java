package it.corsocyber2025.esercizi_f1;

public class Auto {

	private String auto;
	private Pilota pilota;

	public Auto(String auto, Pilota pilota) {
		this.auto = auto;
		this.pilota = pilota;
		
	}
	
	public String dammi_dettagli() {
		return pilota.getNome() + " per la scuderia " + auto;
	}

}
