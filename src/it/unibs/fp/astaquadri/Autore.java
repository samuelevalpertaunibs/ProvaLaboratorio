package it.unibs.fp.astaquadri;

/**
 * Rappresenta un autore di quadri.
 */
public class Autore {
    private String nome;
    private String cognome;
    private String nomeArte;

    /**
     * Crea un nuovo autore con il nome, cognome e nome d'arte specificati.
     *
     * @param nome il nome dell'autore
     * @param cognome il cognome dell'autore
     * @param nomeArte il nome d'arte dell'autore
     */
    public Autore(String nome, String cognome, String nomeArte) {
        this.nome = nome;
        this.cognome = cognome;
        this.nomeArte = nomeArte;
    }

    /**
     * Restituisce il nome dell'autore.
     *
     * @return il nome dell'autore
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il nome dell'autore.
     *
     * @param nome il nuovo nome dell'autore
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce il cognome dell'autore.
     *
     * @return il cognome dell'autore
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il cognome dell'autore.
     *
     * @param cognome il nuovo cognome dell'autore
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * Restituisce il nome d'arte dell'autore.
     *
     * @return il nome d'arte dell'autore
     */
    public String getNomeArte() {
        return nomeArte;
    }

    /**
     * Imposta il nome d'arte dell'autore.
     *
     * @param nomeArte il nuovo nome d'arte dell'autore
     */
    public void setNomeArte(String nomeArte) {
        this.nomeArte = nomeArte;
    }
}