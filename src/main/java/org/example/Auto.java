package org.example;

public class Auto extends Veicolo {
    protected int numeroPorte;
    public Auto(String targa, int anno,  int numeroPorte) {
        super(targa, anno);
        this.numeroPorte = numeroPorte;
    }

    @Override
    public String Descrizione() {
        return Targa + ", " + anno + ", " + numeroPorte;
    }
}
