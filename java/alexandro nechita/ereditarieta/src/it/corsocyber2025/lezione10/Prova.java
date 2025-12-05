package it.corsocyber2025.lezione10;

public class Prova {
	
	public static void main (String[] arg) {
		
		Studente stud = 
				new StudenteITS();
		System.out.println(stud.getNome());
		
		stud.vieniALezione();
		stud.pagaAbbonamento();
		stud.getAnnoDiCorso();
		stud.nomeDelCorso();
		
		Studente stud2 = 
				new StudenteCobol();
		System.out.println(stud2.getNome());
		
		stud2.vieniALezione();
		stud2.pagaAbbonamento();
		stud2.getAnnoDiCorso();
		stud2.nomeDelCorso();
	}
}
