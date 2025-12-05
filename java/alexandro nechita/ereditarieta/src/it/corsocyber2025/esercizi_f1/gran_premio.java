package it.corsocyber2025.esercizi_f1;

public class gran_premio {
    public static void main(String[] args) {
        Gara monza = new Gara("GP d'Italia");
        monza.corri_gara();
        String risultato = monza.get_risultato();
        System.out.println(risultato);        
    }
}