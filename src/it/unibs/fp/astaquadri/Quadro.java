package it.unibs.fp.astaquadri;

public class Quadro {
    private String titolo;
    private Autore autore;
    private String tecnica;
    private String anno_produzione;
    private int larghezza_mm;
    private int lunghezza_mm;
    private double prezzo_acquisto;
    private double base_asta;

    public Quadro(String titolo, Autore autore, String tecnica, String anno_produzione, int larghezza_mm, int lunghezza_mm, double prezzo_acquisto, double base_asta) {
        this.titolo = titolo;
        this.autore = autore;
        this.tecnica = tecnica;
        this.anno_produzione = anno_produzione;
        this.larghezza_mm = larghezza_mm;
        this.lunghezza_mm = lunghezza_mm;
        this.prezzo_acquisto = prezzo_acquisto;
        this.base_asta = base_asta;
    }

    public Quadro(String titolo, Autore autore, String tecnica, int larghezza_mm, int lunghezza_mm, double prezzo_acquisto, double base_asta) {
        this.titolo = titolo;
        this.autore = autore;
        this.tecnica = tecnica;
        this.anno_produzione = "unknown";
        this.larghezza_mm = larghezza_mm;
        this.lunghezza_mm = lunghezza_mm;
        this.prezzo_acquisto = prezzo_acquisto;
        this.base_asta = base_asta;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public Autore getAutore() {
        return autore;
    }

    public void setAutore(Autore autore) {
        this.autore = autore;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    public String getAnno_produzione() {
        return anno_produzione;
    }

    public void setAnno_produzione(String anno_produzione) {
        this.anno_produzione = anno_produzione;
    }

    public int getLarghezza_mm() {
        return larghezza_mm;
    }

    public void setLarghezza_mm(int larghezza_mm) {
        this.larghezza_mm = larghezza_mm;
    }

    public int getLunghezza_mm() {
        return lunghezza_mm;
    }

    public void setLunghezza_mm(int lunghezza_mm) {
        this.lunghezza_mm = lunghezza_mm;
    }

    public double getPrezzo_acquisto() {
        return prezzo_acquisto;
    }

    public void setPrezzo_acquisto(double prezzo_acquisto) {
        this.prezzo_acquisto = prezzo_acquisto;
    }

    public double getBase_asta() {
        return base_asta;
    }

    public void setBase_asta(double base_asta) {
        this.base_asta = base_asta;
    }

    @Override
    public String toString() {
        return  "titolo='" + titolo + '\'' +
                ", autore=" + autore.getNomeArte() +
                ", tecnica='" + tecnica + '\'' +
                ", anno_produzione='" + anno_produzione + '\'' +
                ", larghezza_mm=" + larghezza_mm +
                ", lunghezza_mm=" + lunghezza_mm +
                ", prezzo_acquisto=" + prezzo_acquisto +
                ", base_asta=" + base_asta;
    }
}
