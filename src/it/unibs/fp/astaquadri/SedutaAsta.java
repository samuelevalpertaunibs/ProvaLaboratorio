package it.unibs.fp.astaquadri;

import java.util.ArrayList;

public class SedutaAsta {
    private ArrayList<Offerta> listaOfferte = new ArrayList<>();
    private double guadagno;
    StringBuilder registro;

    public SedutaAsta() {
        this.registro = new StringBuilder();
        this.guadagno = 0;
    }

    public double getGuadagno() {
        return guadagno;
    }

    public void setGuadagno(double guadagno) {
        this.guadagno = guadagno;
    }

    public void aggiungiEvento(String evento){
        registro.append(evento);
    }

    public void aggiungiOfferta(Offerta offerta){
        listaOfferte.add(offerta);
        this.registro.append("Aggiunta offerta di " + offerta.getAcquirente().getNome() + " per il quadro " + offerta.getQuadro().getTitolo() + " dal valore di " + offerta.getPrezzo() + "\n");
    }

    public Offerta getUltimaOfferta(){
        return listaOfferte.get(listaOfferte.size() - 1);
    }

    public String getRegistro() {
        return registro.toString();
    }

    public void aggiungiGuadagno(double somma){
        this.guadagno = this.guadagno + somma;
    }
}
