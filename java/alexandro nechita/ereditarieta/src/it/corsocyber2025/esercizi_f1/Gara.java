package it.corsocyber2025.esercizi_f1;

public class Gara {
    private String nome;
    private String risultato;
    private Auto griglia[];

    public Gara(String nome) {
        this.nome = nome;
        this.risultato = "Corsa non terminata";
        crea_griglia_di_partenza();
    }

    private void crea_griglia_di_partenza() {
    
        Pilota p1 = new Pilota("Vettel");
        Pilota p2 = new Pilota("Ricciardo");
        Pilota p3 = new Pilota("Verstappen");
        Pilota p4 = new Pilota("Hamilton");

        Auto a1 = new Auto("Ferrari", p1);
        Auto a2 = new Auto("Renault", p2);
        Auto a3 = new Auto("Red Bull", p3);
        Auto a4 = new Auto("Mercedes", p4);

        griglia = new Auto[4];
        griglia[0] = a1;
        griglia[1] = a2;
        griglia[2] = a3;
        griglia[3] = a4;
    }

    public void corri_gara() {
        int numero_vincente = (int) (Math.random() * 4);
        Auto vincitore = griglia[numero_vincente];
        String risultato = vincitore.dammi_dettagli();
        this.risultato = "Il vincitore del " + this.nome + ": " + risultato;
    }

    public String get_risultato() {
        return risultato;
    }
}
