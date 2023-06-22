package it.unibs.fp.astaquadri;

/**
 * Rappresenta un acquirente.
 */
public class Acquirente {
    private String nome;
    private int id;

    /**
     * Crea un nuovo acquirente con il nome e l'ID specificati.
     *
     * @param nome il nome dell'acquirente
     * @param id l'ID dell'acquirente
     */
    public Acquirente(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    /**
     * Restituisce il nome dell'acquirente.
     *
     * @return il nome dell'acquirente
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il nome dell'acquirente.
     *
     * @param nome il nuovo nome dell'acquirente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce l'ID dell'acquirente.
     *
     * @return l'ID dell'acquirente
     */
    public int getId() {
        return id;
    }

    /**
     * Imposta l'ID dell'acquirente.
     *
     * @param id il nuovo ID dell'acquirente
     */
    public void setId(int id) {
        this.id = id;
    }
}