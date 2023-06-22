package it.unibs.fp.astaquadri;

import java.util.ArrayList;
import it.unibs.fp.mylib.InputDati;

public class Asta {

    public static final int PERCENTUALE_BASE_ASTA = 10;
    private static final String INTRO_VISUALIZZA_QUADRI = "Ecco la lista dei quadri\n";
    private ArrayList<Quadro> listaQuadri = new ArrayList<>();
    private ArrayList<Acquirente> listaAcquirenti = new ArrayList<>();

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

    public String visualizzaQuadri() {
        StringBuilder buffer = new StringBuilder();
        buffer.append(INTRO_VISUALIZZA_QUADRI);
        for (int i = 0; i < listaQuadri.size(); i++) {
            buffer.append(String.format("%d. %s\n",i , listaQuadri.get(i).toString()));
        }
        return buffer.toString();
    }

    public Autore getAutore(String nome_arte) {
        for (Quadro quadro : listaQuadri) {
            if (nome_arte.equals(quadro.getAutore().getNomeArte())) {
                return quadro.getAutore();
            }
        }
        return null;
    }

    public boolean esisteQuadro(String titolo_quadro) {
        for (Quadro quadro : listaQuadri) {
            if (titolo_quadro.equals(quadro.getTitolo())){
                return true;
            }
        }
        return false;
    }

    public void aggiungiQuadro(Quadro quadroDaAggiungere){
        listaQuadri.add(quadroDaAggiungere);
    }

    public boolean esisteAcquirente(int id) {
        for (Acquirente acquirente : listaAcquirenti) {
            if (id == acquirente.getId()){
                return true;
            }
        }
        return false;
    }

    public Acquirente getAcquirente(int id) {
        for (Acquirente acquirente : listaAcquirenti) {
            if (id == acquirente.getId()){
                return acquirente;
            }
        }
        return null;
    }

    public void aggiungiAcquirente(Acquirente acquirenteDaAggiungere){
        listaAcquirenti.add(acquirenteDaAggiungere);
    }


    public int getNumeroQuadri(){
        return this.listaQuadri.size();
    }

    public Quadro getQuadro(int id) {
        return listaQuadri.get(id);
    }

    public Quadro rimuoviQuadro(int id) {
        return listaQuadri.remove(id);
    }
}
