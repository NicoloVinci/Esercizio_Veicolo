package org.example;

public class Veicolo {
    protected String Targa;
    protected int anno;

    public Veicolo(String targa, int anno) {
        Targa = targa;
        this.anno = anno;
    }

    public String Descrizione() {
        return Targa + ", " + anno;
    }
}
