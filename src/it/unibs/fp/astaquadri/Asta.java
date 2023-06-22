package it.unibs.fp.astaquadri;

import java.util.ArrayList;
import it.unibs.fp.mylib.InputDati;

/**
 * Rappresenta un'asta di quadri.
 */
public class Asta {

    public static final int PERCENTUALE_BASE_ASTA = 10;
    private static final String INTRO_VISUALIZZA_QUADRI = "Ecco la lista dei quadri\n";
    private ArrayList<Quadro> listaQuadri = new ArrayList<>();
    private ArrayList<Acquirente> listaAcquirenti = new ArrayList<>();

    /**
     * Restituisce una rappresentazione testuale dell'asta.
     *
     * @return la rappresentazione testuale dell'asta
     */
    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();

        //add listaSedute

        buffer.append(INTRO_VISUALIZZA_QUADRI);
        for (Quadro quadro : listaQuadri) {
            buffer.append(String.format("%s\n", quadro.toString()));
        }
        return buffer.toString();
    }

    /**
     * Restituisce una stringa contenente la lista dei quadri dell'asta.
     *
     * @return una stringa contenente la lista dei quadri dell'asta
     */
    public String visualizzaQuadri() {
        StringBuilder buffer = new StringBuilder();
        buffer.append(INTRO_VISUALIZZA_QUADRI);
        for (int i = 0; i < listaQuadri.size(); i++) {
            buffer.append(String.format("%d. %s\n", i, listaQuadri.get(i).toString()));
        }
        return buffer.toString();
    }

    /**
     * Restituisce l'autore associato al nome d'arte specificato.
     *
     * @param nome_arte il nome d'arte dell'autore
     * @return l'autore associato al nome d'arte specificato, o null se non trovato
     */
    public Autore getAutore(String nome_arte) {
        for (Quadro quadro : listaQuadri) {
            if (nome_arte.equals(quadro.getAutore().getNomeArte())) {
                return quadro.getAutore();
            }
        }
        return null;
    }

    /**
     * Verifica se un quadro con il titolo specificato esiste nell'asta.
     *
     * @param titolo_quadro il titolo del quadro
     * @return true se il quadro esiste nell'asta, false altrimenti
     */
    public boolean esisteQuadro(String titolo_quadro) {
        for (Quadro quadro : listaQuadri) {
            if (titolo_quadro.equals(quadro.getTitolo())){
                return true;
            }
        }
        return false;
    }

    /**
     * Aggiunge un quadro alla lista dei quadri dell'asta.
     *
     * @param quadroDaAggiungere il quadro da aggiungere
     */
    public void aggiungiQuadro(Quadro quadroDaAggiungere){
        listaQuadri.add(quadroDaAggiungere);
    }

    /**
     * Verifica se un acquirente con l'ID specificato esiste nell'asta.
     *
     * @param id l'ID dell'acquirente
     * @return true se l'acquirente esiste nell'asta, false altrimenti
     */
    public boolean esisteAcquirente(int id) {
        for (Acquirente acquirente : listaAcquirenti) {
            if (id == acquirente.getId()){
                return true;
            }
        }
        return false;
    }

    /**
     * Restituisce l'acquirente con l'ID specificato.
     *
     * @param id l'ID dell'acquirente
     * @return l'acquirente con l'ID specificato, o null se non trovato
     */
    public Acquirente getAcquirente(int id) {
        for (Acquirente acquirente : listaAcquirenti) {
            if (id == acquirente.getId()){
                return acquirente;
            }
        }
        return null;
    }

    /**
     * Aggiunge un acquirente alla lista degli acquirenti dell'asta.
     *
     * @param acquirenteDaAggiungere l'acquirente da aggiungere
     */
    public void aggiungiAcquirente(Acquirente acquirenteDaAggiungere){
        listaAcquirenti.add(acquirenteDaAggiungere);
    }

    /**
     * Restituisce il numero di quadri presenti nell'asta.
     *
     * @return il numero di quadri presenti nell'asta
     */
    public int getNumeroQuadri(){
        return this.listaQuadri.size();
    }

    /**
     * Restituisce il quadro con l'ID specificato.
     *
     * @param id l'ID del quadro
     * @return il quadro con l'ID specificato
     */
    public Quadro getQuadro(int id) {
        return listaQuadri.get(id);
    }

    /**
     * Rimuove il quadro con l'ID specificato dall'asta.
     *
     * @param id l'ID del quadro da rimuovere
     * @return il quadro rimosso, o null se non trovato
     */
    public Quadro rimuoviQuadro(int id) {
        return listaQuadri.remove(id);
    }
}
