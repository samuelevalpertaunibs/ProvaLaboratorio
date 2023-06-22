package it.unibs.fp.astaquadri;

/**
 * Rappresenta un quadro.
 */
public class Quadro {
    private String titolo;
    private Autore autore;
    private String tecnica;
    private String anno_produzione;
    private int larghezza_mm;
    private int lunghezza_mm;
    private double prezzo_acquisto;
    private double base_asta;

    /**
     * Crea un nuovo quadro con il titolo, autore, tecnica, anno di produzione, larghezza, lunghezza,
     * prezzo di acquisto e base d'asta specificati.
     *
     * @param titolo il titolo del quadro
     * @param autore l'autore del quadro
     * @param tecnica la tecnica usata per realizzare il quadro
     * @param anno_produzione l'anno di produzione del quadro
     * @param larghezza_mm la larghezza del quadro in millimetri
     * @param lunghezza_mm la lunghezza del quadro in millimetri
     * @param prezzo_acquisto il prezzo di acquisto del quadro
     * @param base_asta la base d'asta del quadro
     */
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

    /**
     * Crea un nuovo quadro con il titolo, autore, tecnica, larghezza, lunghezza,
     * prezzo di acquisto e base d'asta specificati. L'anno di produzione è impostato come "unknown".
     *
     * @param titolo il titolo del quadro
     * @param autore l'autore del quadro
     * @param tecnica la tecnica usata per realizzare il quadro
     * @param larghezza_mm la larghezza del quadro in millimetri
     * @param lunghezza_mm la lunghezza del quadro in millimetri
     * @param prezzo_acquisto il prezzo di acquisto del quadro
     * @param base_asta la base d'asta del quadro
     */
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

    /**
     * Restituisce il titolo del quadro.
     *
     * @return il titolo del quadro
     */
    public String getTitolo() {
        return titolo;
    }

    /**
     * Imposta il titolo del quadro.
     *
     * @param titolo il nuovo titolo del quadro
     */
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    /**
     * Restituisce l'autore del quadro.
     *
     * @return l'autore del quadro
     */
    public Autore getAutore() {
        return autore;
    }

    /**
     * Imposta l'autore del quadro.
     *
     * @param autore il nuovo autore del quadro
     */
    public void setAutore(Autore autore) {
        this.autore = autore;
    }

    /**
     * Restituisce la tecnica utilizzata per realizzare il quadro.
     *
     * @return la tecnica utilizzata per realizzare il quadro
     */
    public String getTecnica() {
        return tecnica;
    }

    /**
     * Imposta la tecnica utilizzata per realizzare il quadro.
     *
     * @param tecnica la nuova tecnica utilizzata per realizzare il quadro
     */
    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

    /**
     * Restituisce l'anno di produzione del quadro.
     *
     * @return l'anno di produzione del quadro
     */
    public String getAnno_produzione() {
        return anno_produzione;
    }

    /**
     * Imposta l'anno di produzione del quadro.
     *
     * @param anno_produzione il nuovo anno di produzione del quadro
     */
    public void setAnno_produzione(String anno_produzione) {
        this.anno_produzione = anno_produzione;
    }

    /**
     * Restituisce la larghezza del quadro in millimetri.
     *
     * @return la larghezza del quadro in millimetri
     */
    public int getLarghezza_mm() {
        return larghezza_mm;
    }

    /**
     * Imposta la larghezza del quadro in millimetri.
     *
     * @param larghezza_mm la nuova larghezza del quadro in millimetri
     */
    public void setLarghezza_mm(int larghezza_mm) {
        this.larghezza_mm = larghezza_mm;
    }

    /**
     * Restituisce la lunghezza del quadro in millimetri.
     *
     * @return la lunghezza del quadro in millimetri
     */
    public int getLunghezza_mm() {
        return lunghezza_mm;
    }

    /**
     * Imposta la lunghezza del quadro in millimetri.
     *
     * @param lunghezza_mm la nuova lunghezza del quadro in millimetri
     */
    public void setLunghezza_mm(int lunghezza_mm) {
        this.lunghezza_mm = lunghezza_mm;
    }

    /**
     * Restituisce il prezzo di acquisto del quadro.
     *
     * @return il prezzo di acquisto del quadro
     */
    public double getPrezzo_acquisto() {
        return prezzo_acquisto;
    }

    /**
     * Imposta il prezzo di acquisto del quadro.
     *
     * @param prezzo_acquisto il nuovo prezzo di acquisto del quadro
     */
    public void setPrezzo_acquisto(double prezzo_acquisto) {
        this.prezzo_acquisto = prezzo_acquisto;
    }

    /**
     * Restituisce la base d'asta del quadro.
     *
     * @return la base d'asta del quadro
     */
    public double getBase_asta() {
        return base_asta;
    }

    /**
     * Imposta la base d'asta del quadro.
     *
     * @param base_asta la nuova base d'asta del quadro
     */
    public void setBase_asta(double base_asta) {
        this.base_asta = base_asta;
    }

    /**
     * Restituisce una stringa che rappresenta il quadro.
     *
     * @return una stringa che rappresenta il quadro
     */
    @Override
    public String toString() {
        return "titolo='" + titolo + '\'' +
                ", autore=" + autore.getNomeArte() +
                ", tecnica='" + tecnica + '\'' +
                ", anno_produzione='" + anno_produzione + '\'' +
                ", larghezza_mm=" + larghezza_mm +
                ", lunghezza_mm=" + lunghezza_mm +
                ", prezzo_acquisto=" + prezzo_acquisto +
                ", base_asta=" + base_asta;
    }
}
