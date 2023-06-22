package it.unibs.fp.astaquadri;

public class Offerta {
    private Acquirente acquirente;
    private Quadro quadro;
    private double prezzo;

    public Offerta(double prezzo) {
        this.prezzo = prezzo;
    }

    public Offerta(Acquirente acquirente, Quadro quadro, double prezzo) {
        this.acquirente = acquirente;
        this.quadro = quadro;
        this.prezzo = prezzo;
    }

    public Acquirente getAcquirente() {
        return acquirente;
    }

    public void setAcquirente(Acquirente acquirente) {
        this.acquirente = acquirente;
    }

    public Quadro getQuadro() {
        return quadro;
    }

    public void setQuadro(Quadro quadro) {
        this.quadro = quadro;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
}
