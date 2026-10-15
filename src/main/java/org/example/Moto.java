package org.example;

public class Moto extends Veicolo {
    protected int cilindrata;

    public Moto(String targa, int anno, int cilindrata) {
        super(targa, anno);
        this.cilindrata = cilindrata;
    }

    @Override
    public String Descrizione() {
        return Targa + ", " + anno + ", " + cilindrata;
    }
}
